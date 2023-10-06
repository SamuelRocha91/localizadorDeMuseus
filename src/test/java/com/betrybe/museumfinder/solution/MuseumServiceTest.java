package com.betrybe.museumfinder.solution;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;

import com.betrybe.museumfinder.database.MuseumFakeDatabase;
import com.betrybe.museumfinder.dto.CollectionTypeCount;
import com.betrybe.museumfinder.exception.MuseumNotFoundException;
import com.betrybe.museumfinder.model.Museum;
import com.betrybe.museumfinder.service.MuseumService;
import java.util.Optional;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

@SpringBootTest

public class MuseumServiceTest {

  @MockBean
  MuseumFakeDatabase database;

  @Autowired
  MuseumService museumService;

  @Test
  @DisplayName("verifica se a service retorna a resposta adequadamente em caso de ter o id")
  void testMuseumServiceGetId() {
    Museum museum = new Museum();
    Mockito.when(
        database.getMuseum(any())
    ).thenReturn(
        Optional.of(museum)
    );
    assertEquals(museum, museumService.getMuseum(44L));
  }

  @Test
  @DisplayName("verifica se a service retorna a resposta adequadamente em caso erro")
  void testMuseumServiceGetIdError() {
    Mockito.when(
        database.getMuseum(any())
    ).thenReturn(
        Optional.empty()
    );
    assertThrows( MuseumNotFoundException.class,
        () -> museumService.getMuseum(74L));
  }
}
