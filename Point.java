package paket2;
import java.lang.Math;

public class Point {
	private int x;
	private int y;
	public Point(int x , int y){
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return this.x;
	}
	public int getY() {
		return this.y;
	}
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int x) {
		this.y = x;
	}
	static double distanceTo(Point p1 , Point p2) {
		double rv = Math.sqrt((p1.getX() - p2.getX()) * (p1.getX() - p2.getX()) + (p1.getY() - p2.getY()) * (p1.getY() - p2.getY()) );
		return rv;
	}
}
