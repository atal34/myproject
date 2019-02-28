package alogrithm;

public class PrimeNumber {

	public static void main(String[] args) {

		int num = 3;
		//int counter = 0;
		
		for(int no=1;no<=100;no++){
			int counter = 0;
			//System.out.println("number is "+no);
			for(int i=1;i<=no;i++){
				if(no%i == 0){
					counter = counter+1;
				}
			}
			if(counter == 2){
				System.out.println(no+" is prime number");
			}
		}
		
	}

}
