package lab4;

import java.util.*;

class Eurosong {
	Map<String, Map<String, Integer>> countMap;
	
	public Eurosong() {
		countMap = new HashMap<String, Map<String, Integer>>();
	}
	
	public static Map<String, Integer> getCurrentResult(Map<String, Map<String, Integer>> eurosongMap) {
		Map<String, Integer> rv = new HashMap<String, Integer>();
		for(String s: eurosongMap.keySet() ) {
			int sum = 0;
			Map<String , Integer> tren = eurosongMap.get(s);
			for(Integer val: tren.values()) {
				sum += val;
			}
			rv.put(s , sum);
		}
		Map<String , Integer> rv2 = new TreeMap<>(rv);
		return rv2;
	}
	public static Map<String, Integer> getPointsByCountry(String country, Map<String, Map<String, Integer>> eurosongMap){
		if(eurosongMap.containsKey(country)){
			Map<String , Integer> rv2 = new TreeMap<>(eurosongMap.get(country));
			return rv2;
		}
		else return null;
	}
	public static String getWinner(Map<String, Map<String, Integer>> eurosongMap) {
		Map<String , Integer> mapa = getCurrentResult(eurosongMap);
		int naj = -5;
		String winner = "nam";
		for(String country : mapa.keySet()) {
			if(mapa.get(country) > naj) {
				naj = mapa.get(country);
				winner = country;
			}
		}
		return winner+naj;
	}
	public static void main(String[] args) {
		// eurosongMap je prazna
		System.out.println(Eurosong.getCurrentResult(eurosongMap));

		// eurosongMap je napunjena za Spain i Croatia
		System.out.println(eurosongMap); 
		System.out.println(Eurosong.getCurrentResult(eurosongMap));
		System.out.println(Eurosong.getPointsByCountry("France", eurosongMap));

		// glasala Poland
		System.out.println(Eurosong.getPointsByCountry("Poland", eurosongMap));
		System.out.println(Eurosong.getCurrentResult(eurosongMap));
		System.out.println(Eurosong.getWinner(eurosongMap));
	}
	
}
