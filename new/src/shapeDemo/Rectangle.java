package shapeDemo;

public class Rectangle extends Shape{
	
		
	public Rectangle() {
		this.length = 1.0;
		this.width = 1.0;
	}
	
	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}
	public Rectangle(double width, double length,boolean isFilled,String colour) {
		super();
		this.width = width;
		this.length = length;
	}
	

	public double width;
	public double length;
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", length=" + length + ", getWidth()=" + getWidth() + ", getLength()="
				+ getLength() + "]";
	}
	@Override
	public double getPerimeter() {
		double peri = 2 * (this.length + this.width);
		return peri;
	}
	@Override
	public double getArea() {
		double area = this.length * this.width;
		return area;
	}
	
	

}
