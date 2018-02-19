package com.ubnik.spring5.jokesapp.Services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public interface JokesService {

    String getJoke();
}
