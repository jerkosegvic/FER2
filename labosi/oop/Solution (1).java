package labos5;

import java.util.List;
import java.util.function.Predicate;

public class Solution{
    static Predicate<Pokemon> pokemonWithMoveStrongerThan(int power){
        return new Predicate<Pokemon>() {
        	@Override
            public boolean test(Pokemon p) {
        		List<Move> mv = p.getMoves();
        		for(Move m: mv) {
        			if(m.getPower() > power)return true;
        		}
        		return false;
        	}
        };
    }
    static Predicate<Pokemon> pokemonWithPokedexNumberBetweenBounds(int lowerBound, int upperBound){
    	return new Predicate<Pokemon>() {
    		@Override
            public boolean test(Pokemon p) {
    			int x = p.getPokedexNumber();
    			if(x >= lowerBound && x <= upperBound)return true;
    			return false;
    		}
    	};
    }
}
