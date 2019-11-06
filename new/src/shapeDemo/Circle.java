package shapeDemo;

public class Circle extends Shape{
	
	public double radius;

	public Circle(){
		this.radius = 1.0;
	}
	public Circle(double radius){
		this.radius = radius;
	}
	public Circle(double radius,boolean isFilled,String colour){
		this.radius = radius;
		this.colour = colour;
		this.isFilled = isFilled;
	}
	
	
	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", colour=" + colour + ", isFilled=" + isFilled + "]";
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	@Override
	public double getPerimeter() {
		double peri = this.radius * 2 * 3.142;
		return peri;
	}

	@Override
	public double getArea() {
		double area = 3.142 * this.radius * this.radius;
		return area;
	}
	
	

}
