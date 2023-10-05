package com.betrybe.museumfinder.controller;

import com.betrybe.museumfinder.dto.MuseumCreationDto;
import com.betrybe.museumfinder.dto.MuseumDto;
import com.betrybe.museumfinder.model.Coordinate;
import com.betrybe.museumfinder.model.Museum;
import com.betrybe.museumfinder.service.MuseumServiceInterface;
import com.betrybe.museumfinder.util.ModelDtoConverter;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.AliasFor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Cria a controller da aplicação de museus.
 *
 */
@RestController
@RequestMapping("/museums")
public class MuseumController {

  private MuseumServiceInterface museumService;

  @Autowired
  public MuseumController(MuseumServiceInterface museumService) {
    this.museumService = museumService;
  }

  /**
   * cria rota para criação de cadastro de museus.
   *
   * @param museumCreationDto museucreationdto.
   * @return response created.
   */
  @PostMapping
  public ResponseEntity<Museum> createMuseum(@RequestBody MuseumCreationDto museumCreationDto) {

    return ResponseEntity.status(HttpStatus.CREATED)
        .body(museumService.createMuseum(ModelDtoConverter.dtoToModel(museumCreationDto)));
  }

  /**
   * cria metodo de localizar museus proximos.
   *
   * @param lat       double.
   * @param lng       double.
   * @param maxDistKm double.
   * @return o mais proximo.
   */
  @GetMapping("/closest")
  public ResponseEntity<MuseumDto> getClosestMuseum(@RequestParam double lat,
      double lng, @RequestParam("max_dist_km") double maxDistKm) {
    Coordinate coordinate = new Coordinate(lat, lng);
    return ResponseEntity.status(HttpStatus.OK)
        .body(ModelDtoConverter
            .modelToDto(museumService.getClosestMuseum(coordinate, maxDistKm)));
  }
}
