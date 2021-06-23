package paket2;
import java.lang.Math;


public class Circle extends Shape{
	private int r;
	public Circle(Point p , int r) {
		super(p);
		this.r = r;
	}
	public int getR() {
		return this.r;
	}
	public Point getCenter() {
		return this.getPoint();
	}
	@Override
	public Rectangle boundingBox() {
		Rectangle rv = new Rectangle(this.getPoint() , r*2 , r*2);
		return rv;
	}
	@Override
	public double area() {
		return this.r*this.r*Math.PI;
	}
	@Override
	public boolean contains(Point p) {
		Point cn = this.getPoint();
		
		if( Point.distanceTo(cn , p) <= r) {
			return true;
		}
		else return false;
	}
}
