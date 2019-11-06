import org.apache.commons.lang3.RandomStringUtils;

public class PasswordGen {

	public static void main(String[] args) {

		 
	        	String password = "";
	        	String upperCaseAplha = "ABCDEFGHIJKLMNOPQRSTUVWXY";
				String specialCharacters ="!.";
				String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
				password = RandomStringUtils.random(1,upperCaseAplha);
				password = password.concat(RandomStringUtils.random(1,specialCharacters));
				password = password.concat(RandomStringUtils.random(9,characters));
				System.out.println("Generated password is = "+password);
			
		
	}

}
