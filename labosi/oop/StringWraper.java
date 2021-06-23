package proba;

public class StringWraper implements Comparable<StringWraper>{
	String str;
	public StringWraper(String s) {
		this.str = s;
	}
	public String getString() {
		return this.str;
	}
	@Override
	public int compareTo(StringWraper other) {
		if(this.getString().startsWith(other.getString()))return 1;
		else if(other.getString().startsWith(this.getString()))return -1;
		else return this.getString().compareTo(other.getString());
	}
	@Override
	public String toString() {
		return str;
	}
	@Override
	public int hashCode() {
		return str.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if(this.toString().equals((String)obj.toString()))return true;
		return false;
	}
	
	
}
