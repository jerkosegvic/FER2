package proba2;


public class Car extends Vehicle{
	int[] speed;
	int[] rpm;
	public Car(String nm , int yr , int[] speed , int[] rpm){
		super(nm , yr);
		this.speed = speed;
		this.rpm = rpm;
	}
	public float calculateAverageAcceleration(){
		float zbr = 0;
		for(int i = 1; i < speed.length; i++)zbr += (double)(speed[i] - speed[i - 1] ) / 2;
		zbr /= (speed.length - 1);
		return zbr;
	}
	public float calculateAverageRPM(){
		float zbr = 0;
		for(int i = 0; i < rpm.length; i++)zbr += rpm[i];
		zbr /= (rpm.length);
		return zbr;
	}
	public String calculateEcoValue(){
		double x = this.calculateAverageAcceleration();
		double y = this.calculateAverageRPM();
		if(x >= 0.5 && x <= 2.0 && y <= 2500.0 && y >= 2000.0)return "eco";
		else return "non-eco"; 
	}
	@Override
	public String toString() {
    	return "My car " + getName() + " is produced " + getYearProduced() + " and I am " 
    	+ calculateEcoValue() + " driver.";
	}
}