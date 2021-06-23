package labos_1;

import java.util.ArrayList;
import java.util.List;

public class RaceTimeTable {
	List<Driver> table = new ArrayList<Driver>();
	void addDriver(Driver driver) {
		table.add(driver);
	}
	List<Driver> getXFirstDrivers(int x){
		if(x == 0)return null;
		List<Driver> rv = new ArrayList<>();
		rv.addAll(table);
		rv.sort(new DriverComparator());
		List<Driver> rv2 = new ArrayList<>();
		for(int i = 0; i < x; i++) {
			if(i >= table.size())break;
			rv2.add(rv.get(i));
		}
		return rv2;
	}
	List<Driver> getByName(){
		List<Driver> rv = new ArrayList<>();
		rv.addAll(table);
		rv.sort(null);
		return rv;
	}
}
