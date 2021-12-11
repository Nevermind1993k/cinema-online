package com.kovr.cinemaonlineapi.entity;

import com.kovr.cinemaonlineapi.dto.Type;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Movie {

    @Id
    @GeneratedValue(generator = "UUID")
    String id;

    String name;

    int year;

    Type type;
}
