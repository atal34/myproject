package date;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;  
public class StringToSQLDateExample {  
public static void main(String[] args) throws ParseException {  
    String str="2015-03-31";  
    Date date=Date.valueOf(str);//converting string into sql date  
    System.out.println(date); 
    
    Date date2 = new Date(0);
    System.out.println("date 2"+date2);
    
    String d = "20210802";
    String d1 = d.substring(0, 4)+"-"+d.substring(4, 6)+"-"+d.substring(6, 8);
    
    SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy");
    //Parsing the given String to Date object
    String date1 = formatter.format(Date.valueOf(d1));
    System.out.println("Date object value: "+date1);
}  
} 

