package labos_1;

///import java.util.Comparator;

public class Driver implements Comparable<Driver> /*, Comparator<Driver>*/ {
	String name;
	java.time.Duration duration;
	public Driver(String name , java.time.Duration duration) {
		this.name = name;
		this.duration = duration;
	}
	public String getName() {
		return this.name;
	}
	public java.time.Duration getDuration() {
		return this.duration;
	}
	@Override
	public String toString() {
		String rv = new String(name);
		rv += ": ";
		int sec = (int)this.getDuration().getSeconds();
		int nano = this.getDuration().getNano();
		rv += (sec/60)+ ":" + (sec % 60) + "." + (nano/10000000);
		return rv;
	}
	@Override
	public int compareTo(Driver other) {
		return (this.name).compareTo(other.getName());
	}
	/*
	@Override
	public int compare(Driver d1 , Driver d2) {
		return d1.getDuration().compareTo(d2.getDuration());
	}*/
}
