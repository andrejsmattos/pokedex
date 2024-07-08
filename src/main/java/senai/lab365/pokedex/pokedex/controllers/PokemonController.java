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

    @PutMapping("/capturado")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void atualizaCapturado(@Valid @RequestBody PokemonCapturadoRequest pokemonCapturadoRequest) {
        service.atualizaCapturado(pokemonCapturadoRequest);
    }

    @PutMapping("/visto")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void atualizaVisto(@Valid @RequestBody PokemonVistoRequest pokemonVistoRequest) {
        service.atualizaVisto(pokemonVistoRequest);
    }

    @DeleteMapping("/{numero}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void exclui(@PathVariable Integer numero) {
        service.exclui(numero);
    }
}
