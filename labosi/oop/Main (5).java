package tomin_labos;

import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		Set<Player> playerSet = new TreeSet<>();

	    playerSet.add(new Player("Fabiano", "Carlsen", "0000000002", 2835));
	    playerSet.add(new Player("Liren", "Ding", "0000000003", 2791));
	    playerSet.add(new Player("Magnus", "Carlsen", "0000000001", 2863));
	    playerSet.add(new Player("Levon", "Aronian", "0000000015", 2770));

	}

}
