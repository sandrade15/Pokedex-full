
package com.regi.poketeste.controller;

import com.regi.poketeste.model.Pokemon;
import com.regi.poketeste.service.PokemonService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pokemon")
public class PokemonController {

    private final PokemonService pokemonService;

    public PokemonController(PokemonService pokemonService) {
        this.pokemonService = pokemonService;
    }

    @GetMapping
    public List<Pokemon> listarTodos() {
        return pokemonService.listarTodos();
    }

    @GetMapping("/{name}/{form}")
    public ResponseEntity<Pokemon> findByNameAndForm(
            @PathVariable String name,
            @PathVariable String form) {

        return pokemonService.findByNameAndForm(name, form)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}