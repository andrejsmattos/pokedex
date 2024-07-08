package senai.lab365.pokedex.pokedex.controllers;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import senai.lab365.pokedex.pokedex.dtos.PokemonCapturadoRequest;
import senai.lab365.pokedex.pokedex.dtos.PokemonVistoRequest;
import senai.lab365.pokedex.pokedex.services.PokemonService;

@RestController
@RequestMapping("/pokemon")
public class PokemonController {

    private final PokemonService service;

    public PokemonController(PokemonService pokemonService) {
        this.service = pokemonService;
    }

    @PostMapping("/visto")
    @ResponseStatus(HttpStatus.CREATED)
    public void cadastraVisto(@Valid @RequestBody PokemonVistoRequest pokemonVistoRequest) {
        service.cadastraVisto(pokemonVistoRequest);
    }

    @PostMapping("/capturado")
    @ResponseStatus(HttpStatus.CREATED)
    public void cadastraCapturado(@Valid @RequestBody PokemonCapturadoRequest pokemonCapturadoRequest) {
        service.cadastraCapturado(pokemonCapturadoRequest);
    }
}
