package senai.lab365.pokedex.pokedex.services;

import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;
import senai.lab365.pokedex.pokedex.dtos.PokemonCapturadoRequest;
import senai.lab365.pokedex.pokedex.dtos.PokemonVistoRequest;
import senai.lab365.pokedex.pokedex.repositories.PokemonRepository;

import static senai.lab365.pokedex.pokedex.mappers.PokemonMapper.map;

@Service
public class PokemonService {

    private final PokemonRepository repository;

    public PokemonService(PokemonRepository pokemonRepository) {
        this.repository = pokemonRepository;
    }

    public void cadastraVisto(PokemonVistoRequest pokemonVistoRequest) {

        if (repository.existsById(pokemonVistoRequest.getNumero())) {
            throw new DuplicateKeyException("Já existe um pokemon com este número");
        }
        repository.save(map(pokemonVistoRequest));
    }

    public void cadastraCapturado(PokemonCapturadoRequest pokemonCapturadoRequest) {

        if (repository.existsById(pokemonCapturadoRequest.getNumero())){
            throw new DuplicateKeyException("Já existe um pokemon com este número.");
        }
        repository.save(map(pokemonCapturadoRequest));
    }
}
