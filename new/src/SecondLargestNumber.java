
public class SecondLargestNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int temp =0;	
	int[] arr= {1,4,7,2,9,10,54,76,34};
	
	for(int i=0;i<arr.length;i++){
		for (int j=0;j<arr.length;j++){
			
			if(arr[i]>arr[j])
			{
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
	System.out.println(arr[1]);
	}

}
