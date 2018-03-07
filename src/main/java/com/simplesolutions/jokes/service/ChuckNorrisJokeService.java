package com.simplesolutions.jokes.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChuckNorrisJokeService implements JokeService {

    private ChuckNorrisQuotes jokes;

    @Autowired
    public ChuckNorrisJokeService() {
        this.jokes = new ChuckNorrisQuotes();
    }

    @Override
    public String returnJoke() {
        return jokes.getRandomQuote();
    }
}
