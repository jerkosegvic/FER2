package labos5;

import java.util.List;

public class Pokemon {
    private String name;
    private int pokedexNumber;
    private List<Move> moves;
    
    public Pokemon(String name, int pokedexNumber, List<Move> moveset) {
        this.name = name;
        this.pokedexNumber = pokedexNumber;
        this.moves = moveset;
    }

    public String getName() {
        return name;
    }

    public int getPokedexNumber() {
        return pokedexNumber;
    }

    public List<Move> getMoves() {
        return moves;
    }
}