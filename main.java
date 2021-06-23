package labos;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

class Solution {

	static Predicate<Superhero> superheroesFightingOnlySupervillian(String supervillian) {
		return new Predicate<Superhero>() {

			@Override
			public boolean test(Superhero t) {
				List<String> list = t.getSupervillains();
				for (String sv : list) {
					if (supervillian.equals(sv))
						return true;
				}
				return false;
			}

		};

	}

	static Predicate<Superhero> superheroesWithMoreThanOneWordInAlias() {
		return new Predicate<Superhero>() {

			@Override
			public boolean test(Superhero t) {
				String al = t.getAlias();
				if (al.contains(" "))
					return true;
				return false;
			}

		};

	}

}
class Superhero {
    private String name;
    private String alias;
    private List<String> supervillains;

    public Superhero(String name, String alias, List<String> supervillains) {
        super();
        this.name = name;
        this.alias = alias;
        this.supervillains = supervillains;
    }

    public String getName() {
        return name;
    }

    public String getAlias() {
        return alias;
    }

    public List<String> getSupervillains() {
        return supervillains;
    }
}

public class Main{
    public void Main(String[] args){
        Superhero captainAmerica = new Superhero("Steve Rogers", "Captain America",
        Arrays.asList(new String[]{"Red Skull"}));
        Superhero hulk = new Superhero("Bruce Banner", "Hulk",
        Arrays.asList(new String[]{"Abomination", "Thanos"}));
        Superhero ironMan = new Superhero("Tony Stark", "Iron Man",
        Arrays.asList(new String[]{"Thanos"}));

        List<Superhero> avengers = new ArrayList<Superhero>();
        avengers.add(captainAmerica);
        avengers.add(hulk);
        avengers.add(ironMan);

        System.out.println("Superheroes who are fighting only one supervillain named Red Skull:");
        Stream<Superhero> filtered1 = avengers.stream().filter(Solution.superheroesFightingOnlySupervillain("Red Skull"));
        for (Superhero superhero : filtered1.toArray(Superhero[]::new)) {
            System.out.println(superhero.getAlias());
        }

        System.out.println("\nSuperheroes who have more than one word in their alias:");
        Stream<Superhero> filtered2 = avengers.stream().filter(Solution.superheroesWithMoreThanOneWordInAlias());
        for (Superhero superhero : filtered2.toArray(Superhero[]::new)) {
            System.out.println(superhero.getAlias());
        }
    }
    
}