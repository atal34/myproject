package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class JavaUtilDate {

	public static void main(String[] args) throws ParseException {

		
		String dd = "20210208";
		    
		    SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
		    SimpleDateFormat insertFormatter = new SimpleDateFormat("dd-MMM-yyyy");
		    java.util.Date date = formatter.parse(dd);
		    String fDate = insertFormatter.format(date);
		    System.out.println(fDate.toString());
		   
	}

}
