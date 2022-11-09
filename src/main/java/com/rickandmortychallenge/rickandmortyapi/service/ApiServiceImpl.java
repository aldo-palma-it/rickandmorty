package com.rickandmortychallenge.rickandmortyapi.service;

import com.rickandmortychallenge.rickandmortyapi.model.Character;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class ApiServiceImpl implements ApiService {

    @Value("${Base_Path}")
    private String basePath;
    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private HttpHeaders httpHeaders;

    @Override
    public Character getACharacter(Integer id) {

        httpHeaders.setAccept(List.of(MediaType.APPLICATION_JSON));

        HttpEntity<String> entity = new HttpEntity<>(httpHeaders);

        ResponseEntity<Character> response = restTemplate.exchange(basePath+"/character/"+id, HttpMethod.GET,
                entity, Character.class);

        return response.getBody();
    }
}

