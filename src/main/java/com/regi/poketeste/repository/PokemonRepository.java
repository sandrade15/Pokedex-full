
package com.regi.poketeste.repository;

import com.regi.poketeste.model.Pokemon;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PokemonRepository
        extends JpaRepository<Pokemon, String> {

    Optional<Pokemon> findByNameAndForm(String name, String form);

}