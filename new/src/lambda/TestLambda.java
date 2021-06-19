package lambda;

public class TestLambda implements Calculator{

	public static void main(String[] args) {

		Calculator add = (double x,double y) -> {return x+y;};
		
		TestLambda t = new TestLambda();
		
		t.calculate(x, y)
	}

	@Override
	public double calculate(double x, double y) {
		// TODO Auto-generated method stub
		return 0;
	}

}
