package com.betrybe.museumfinder.solution;

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
import org.springframework.test.web.servlet.MockMvc;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;



@SpringBootTest
public class CollectionTypeServiceTest {

  @MockBean
  MuseumFakeDatabase database;

  @Autowired
  CollectionTypeService collectionTypeService;

  @Test
  @DisplayName("verifica se a service retorna a resposta adequadamente")
  void testCollectionServiceinSplitTypes() {
    String collection = "hist";
    String[] colle = new String[2];
    colle[0] = "hist";
    colle[1] = "imag";
    CollectionTypeCount collectionTypeCount = new CollectionTypeCount(colle, 40);
    Mockito.when(
        database.countByCollectionType(any())
    ).thenReturn(
        40L
    );
    assertEquals(collectionTypeCount.count(), collectionTypeService.countByCollectionTypes(collection).count());
  }
}
