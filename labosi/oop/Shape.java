package paket2;
import java.lang.Math;


public abstract class Shape {
	Point center;
	public Shape(int x , int y) {
		this.center = new Point(x , y);
	}
	public Shape(Point p) {
		this.center = p;
	}
	public Point getPoint() {
		return this.center;
	}
	public abstract boolean contains(Point P);
	public abstract double area();
	public abstract Rectangle boundingBox();
	public double difference(Shape s) {
		return Math.abs(this.area() - s.area());
	}
}
