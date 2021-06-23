package labos5;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		List<Move> pikachuMoveset = new ArrayList<>();
		pikachuMoveset.add(new Move("Spark", 65));
		pikachuMoveset.add(new Move("Thunderbolt", 90));
		Pokemon pikachu = new Pokemon("Pikachu", 25, pikachuMoveset);

		List<Move> charmanderMoveset = new ArrayList<>();
		charmanderMoveset.add(new Move("Ember", 40));
		charmanderMoveset.add(new Move("Fire Fang", 65));
		Pokemon charmander = new Pokemon("Charmander", 4, charmanderMoveset);

		List<Move> squirtleMoveset = new ArrayList<>();
		squirtleMoveset.add(new Move("Water Gun", 40));
		squirtleMoveset.add(new Move("Water Pulse", 60));
		Pokemon squirtle = new Pokemon("Squirtle", 7, squirtleMoveset);

		List<Pokemon> pokemonList = new ArrayList<Pokemon>();
		pokemonList.add(pikachu);
		pokemonList.add(charmander);
		pokemonList.add(squirtle);

		System.out.println("Pokemon with a move that has power over 60:");
		Stream<Pokemon> filtered1 = pokemonList.stream().filter(Solution.pokemonWithMoveStrongerThan(60));
		for (Pokemon pokemon : filtered1.toArray(Pokemon[]::new)) {
		    System.out.println(pokemon.getName());
		}

		System.out.println("\nPokemon with Pokedex number between 0 and 10:");
		Stream<Pokemon> filtered2 = pokemonList.stream().filter(Solution.pokemonWithPokedexNumberBetweenBounds(0, 10));
		for (Pokemon pokemon : filtered2.toArray(Pokemon[]::new)) {
		    System.out.println(pokemon.getName());
		}
	}

}
