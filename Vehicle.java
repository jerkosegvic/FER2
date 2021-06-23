package proba2;

public abstract class Vehicle{
	private String name;
	private int yearProduction;
	public Vehicle(String n , int x){
		this.name = n;
		this.yearProduction = x;
	}
	public String getName(){
		return this.name;
	}
	public int getYearProduced(){
		return this.yearProduction;
	}
}

