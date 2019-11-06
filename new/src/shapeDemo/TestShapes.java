package shapeDemo;

public class TestShapes {

	public static void main(String[] args) {

		Shape s1 = new Circle(5.5,false, "RED");  // Upcast Circle to Shape
		System.out.println(s1);                    // which version?
		System.out.println(s1.getArea());          // which version?
		System.out.println(s1.getPerimeter());     // which version?
		//System.out.println(s1.getColor());
		System.out.println(s1.isFilled());
		//System.out.println(s1.getRadius());

		System.out.println("\n\n s1 is of type "+s1.getClass());
		
		//Shape c2 = new Shape();
		
		Circle c1 = (Circle)s1;                   // Downcast back to Circle
		System.out.println("\n\n c1 is of type "+c1.getClass());
		
		System.out.println(c1);
		System.out.println(c1.getArea());
		System.out.println(c1.getPerimeter());
		//System.out.println(c1.getColor());
		System.out.println(c1.isFilled());
		System.out.println(c1.getRadius());

		
		
	}

}
