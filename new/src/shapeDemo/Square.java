package shapeDemo;

public class Square extends Rectangle{
	
	public Square(double side){
		super(side,side);
	
	}

	@Override
	public String toString() {
		return "Square [width=" + width + ", length=" + length + ", colour=" + colour + ", isFilled=" + isFilled + "]";
	}
	
}
