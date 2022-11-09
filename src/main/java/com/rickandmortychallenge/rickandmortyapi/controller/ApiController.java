package com.rickandmortychallenge.rickandmortyapi.controller;

import com.rickandmortychallenge.rickandmortyapi.model.Character;
import com.rickandmortychallenge.rickandmortyapi.service.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @Autowired
    private ApiService apiService;

    @GetMapping("/{id}")
    public ResponseEntity<Character> getCharacters(@PathVariable("id") Integer id) {
        Character characters = apiService.getACharacter(id);
        return new ResponseEntity<>(characters, HttpStatus.OK);
    }
}