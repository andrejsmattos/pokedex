package senai.lab365.pokedex.pokedex.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import senai.lab365.pokedex.pokedex.models.Pokemon;

@Repository
public interface PokemonRepository extends JpaRepository<Pokemon, Integer>{
}
