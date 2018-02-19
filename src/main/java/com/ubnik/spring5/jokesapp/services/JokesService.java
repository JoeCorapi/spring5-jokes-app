package com.ubnik.spring5.jokesapp.services;

import org.springframework.stereotype.Repository;

@Repository
public interface JokesService {

    String getJoke();
}
