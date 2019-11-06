package alogrithm;

public class EfficientPrimeNumber {

	public static void main(String[] args) {

		int num = 270399;
		
		int sqrt = (int) Math.sqrt(num);
		
		System.out.println(sqrt);
		int counter = 0;
		
		for(int i=2;i<sqrt+1;i++){
			System.out.println("i ="+i);
			if(num%i == 0 ){
				counter = counter + 1;
				
				 if(counter > 0){
				System.out.println("number is not prime");
				break;
				 }
			}
			
		}
		if(counter == 0 ){
			System.out.println("number is prime");
		}
		
	}

}
