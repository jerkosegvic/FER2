package proba;

import java.util.SortedSet;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		SortedSet<StringWraper> coll = new TreeSet<>();
		coll.add(new StringWraper("naj"));
		coll.add(new StringWraper("najbolji"));
		coll.add(new StringWraper("najjaci"));
		coll.add(new StringWraper("med"));
		coll.add(new StringWraper("medvjed"));
		///{naj, najbolji, najjaci, med, medvjed}
	}

}
