package paket2;
///import java.lang.Math;


public class Rectangle extends Shape{
	private int width;
	private int height;
	public Rectangle(Point p , int x , int y) {
		super(p);
		this.width = x;
		this.height = y;
	}
	public int getWidth() {
		return this.width;
	}
	public int getHeight() {
		return this.height;
	}
	@Override
	public Rectangle boundingBox() {
		return this;	
	}
	@Override
	public double area() {
		return this.width * this.height;
	}
	@Override
	public boolean contains(Point p) {
		Point cn = this.getPoint();
		double cx = cn.getX();
		double cy = cn.getY();
		double px = p.getX();
		double py = p.getY();
		double x0 = cx - (double)this.getWidth()/2; 
		double x1 = cx + (double)this.getWidth()/2;
		double y0 = cy - (double)this.getHeight()/2;
		double y1 = cy + (double)this.getHeight()/2;
		if(px >= x0 && px <= x1 && py >= y0 && py <= y1) {
			return true;
		}
		else return false;
	}
}
