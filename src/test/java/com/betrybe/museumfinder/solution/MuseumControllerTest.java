package com.betrybe.museumfinder.solution;

import static com.betrybe.museumfinder.evaluation.utils.TestHelpers.objectToJson;
import static org.mockito.ArgumentMatchers.any;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.betrybe.museumfinder.model.Museum;
import com.betrybe.museumfinder.service.MuseumServiceInterface;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
public class MuseumControllerTest {

  @Autowired
  MockMvc mockMvc;

  @MockBean
  MuseumServiceInterface museumService;

  @Test
  @DisplayName("Rota GET /museum/{id} implementada")
  void testGetControllerMuseum() throws Exception {
    Museum museum = new Museum();
    museum.setAddress("Rua do cavalo voador");
    Mockito.when(museumService.getMuseum(any())).thenReturn(museum);

    mockMvc.perform(
            get("/museums/1")
                .accept(MediaType.APPLICATION_JSON))
        .andExpect(status().isOk())
        .andExpect(content().contentType(MediaType.APPLICATION_JSON))
        .andExpect(jsonPath("$.address").value(museum.getAddress()));
  }
}
