package com.rickandmortychallenge.rickandmortyapi.service;

import com.rickandmortychallenge.rickandmortyapi.model.Character;

public interface ApiService {
    public Character getACharacter(Integer id);
}
