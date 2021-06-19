package inheritance;

public class Test {

	public static void main(String[] args) {

		Car car1 = new Car();
		Car car = new Swift();
		
		System.out.println(car1.getClass());
		System.out.println(car.getClass());
		
		car.run();
		
		car.setBrandName("Suzuki");
		car.setEngineCC(1200);
		
		System.out.println(car.getBrandName()+""+car.getEngineCC());
	}
	

}
