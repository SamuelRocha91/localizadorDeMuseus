package com.betrybe.museumfinder.dto;

import com.betrybe.museumfinder.model.Coordinate;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * criA museum dto sem id e legacy.
 *
 * @param name String.
 * @param description String.
 * @param address String.
 * @param collectionType String.
 * @param subject String.
 * @param url STring.
 * @param coordinate Coordinate.
 */

public record MuseumCreationDto(String name, String description,
                                String address, String collectionType, String subject, String url,
                                Coordinate coordinate) {

}
