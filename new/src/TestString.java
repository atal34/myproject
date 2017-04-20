
public class TestString {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		String s= "Nullpointer1234";
		String s2= "pointer1234Null";
		int ch=0;
		TestString t= new TestString();
		//System.out.println(s.substring(0, 1));
		//System.out.println(s2.substring(1,2));
		
		
		
		
		for (int i=0;i<s.length();i++){
			
			if(s.charAt(0)==(s2.charAt(i)))
				ch=i;
			}
		
			System.out.println(ch);
			System.out.println(s.substring(0,s2.length()-ch));
			System.out.println(s2.substring(ch,s2.length()));
			if(s.substring(0,s2.length()-ch).equals(s2.substring(ch,s2.length()))){
				System.out.println(true);}
				
			System.out.println(s.substring(s.length()-ch,s.length()));
			System.out.println(s2.substring(0,ch));
			if(s.substring(s.length()-ch,s.length()).equals(s2.substring(0,ch)))
				System.out.println(true);
			}
				
		}


		
		
	


