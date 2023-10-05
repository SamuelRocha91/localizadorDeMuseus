package com.betrybe.museumfinder.dto;

import com.betrybe.museumfinder.model.Coordinate;
import org.springframework.stereotype.Component;

/**
 * Cria Dto sem legacy.
 *
 * @param id Long.
 * @param name String.
 * @param description String.
 * @param address STring.
 * @param collectionType String.
 * @param subject String.
 * @param url STring.
 * @param coordinate Coordinate.
 */

public record MuseumDto(Long id, String name, String description,
                        String address, String collectionType, String subject, String url,
                        Coordinate coordinate) {

}
