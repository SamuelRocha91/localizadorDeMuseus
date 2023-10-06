package com.betrybe.museumfinder.solution;

import static com.betrybe.museumfinder.evaluation.utils.TestHelpers.objectToJson;
import static org.mockito.ArgumentMatchers.any;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.betrybe.museumfinder.controller.CollectionTypeController;
import com.betrybe.museumfinder.database.MuseumFakeDatabase;
import com.betrybe.museumfinder.dto.CollectionTypeCount;
import com.betrybe.museumfinder.service.CollectionTypeService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

@SpringBootTest
@AutoConfigureMockMvc
public class CollectionTypeControllerTest {
  @Autowired
  MockMvc mockMvc;

  @MockBean
  CollectionTypeService collectionTypeService;

  @Test
  @DisplayName("Rota GET /count/{typesList} implementada")
  void testCollectionTypeController() throws Exception {
    String[] collection = new String[2];
    collection[0] = "hist";
    collection[1] = "imag";
    CollectionTypeCount collectionTypeCount = new CollectionTypeCount(collection, 42);
    String typeList = "hist";
    Mockito.when(collectionTypeService.countByCollectionTypes(any())).thenReturn(collectionTypeCount);

    mockMvc.perform(
            get("/collections/count/hist,imag")
                .accept(MediaType.APPLICATION_JSON)
                .content(objectToJson(collection)))
        .andExpect(status().isOk())
        .andExpect(content().contentType(MediaType.APPLICATION_JSON))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.count").value(collectionTypeCount.count()));

    Mockito.verify(collectionTypeService).countByCollectionTypes(any());

    Mockito.reset(collectionTypeService);
  }

  @Test
  @DisplayName("Rota GET /count/{typesList} implementada com retorno não encontrado")
  void testNotCollectionFound() throws Exception {
      String[] collection = new String[2];
      collection[0] = "hist";
      collection[1] = "imag";
      CollectionTypeCount collectionTypeCount = new CollectionTypeCount(collection, 0);
    Mockito
        .when(collectionTypeService.countByCollectionTypes(any()))
        .thenReturn(collectionTypeCount);

    ResultActions result = mockMvc.perform(
        get("/collections/count/javali"));

    result.andExpect(status().isNotFound());

  }
}

