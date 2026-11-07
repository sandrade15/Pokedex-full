package com.regi.poketeste.service;

import com.regi.poketeste.model.Pokemon;
import com.regi.poketeste.repository.PokemonRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PokemonService {

    private final PokemonRepository repository;

    public PokemonService(PokemonRepository repository) {
        this.repository = repository;
    }

    public List<Pokemon> listarTodos() {
        return repository.findAll();
    }

    public Optional<Pokemon> findByNameAndForm(
            String name, String form) {

        return repository.findByNameAndForm(name, form);
    }
}
