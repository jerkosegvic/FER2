package labos_1;

import java.util.Comparator;

public class DriverComparator implements Comparator<Driver>{
	@Override
	public int compare(Driver d1 , Driver d2) {
		return d1.getDuration().compareTo(d2.getDuration());
	}
}
