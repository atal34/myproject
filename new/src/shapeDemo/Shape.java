package shapeDemo;

public abstract  class Shape {
	
	protected String colour;
	protected boolean isFilled;
	
	public Shape(){
		this.colour = "Green";
		this.isFilled = true;
		
	}
	
	public Shape(String colour,boolean isFilled){
		this.colour = colour;
		this.isFilled = isFilled ;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public boolean isFilled() {
		return isFilled;
	}

	public void setFilled(boolean isFilled) {
		this.isFilled = isFilled;
	}

	@Override
	public String toString() {
		return "Shape [colour=" + colour + ", isFilled=" + isFilled + "]";
	}
	
	public abstract double getPerimeter();		
	
	public abstract double getArea();	
	
}

