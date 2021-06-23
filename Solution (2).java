package perin_labos;

import java.util.List;
import java.util.function.Predicate;

public class Solution {
	
	static Predicate<Superhero> superheroesWithMoreThanOneWordInAlias() {
		return new Predicate<Superhero>() {

			@Override
			public boolean test(Superhero sh) {
				String str = sh.getAlias();
				if (str.contains(" "))
					return true;
				return false;
			}

		};

	}
	
	static Predicate<Superhero> superheroesFightingOnlySupervillian(String supervillian) {
		return new Predicate<Superhero>() {

			@Override
			public boolean test(Superhero curr) {
				List<String> list = curr.getSupervillains();
				for (String name : list) {
					if (supervillian.equals(name))
						return true;
				}
				return false;
			}

		};

	}

	
}
