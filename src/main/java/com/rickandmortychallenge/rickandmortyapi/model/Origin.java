package com.rickandmortychallenge.rickandmortyapi.model;

import lombok.Data;

import java.util.ArrayList;

@Data
public class Origin {
    private String name;
    private String url;
    private String dimension;
    private ArrayList<String> residents;
}