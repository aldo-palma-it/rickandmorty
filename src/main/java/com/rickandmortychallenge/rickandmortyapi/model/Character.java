package com.rickandmortychallenge.rickandmortyapi.model;

import lombok.Data;

import java.util.ArrayList;

@Data
public class Character {
    private String id;
    private String name;
    private String status;
    private String type;
    private ArrayList<String> episode;
    private Origin origin;
}
