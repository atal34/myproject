import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatTest {

	public static void main(String[] args) {

		
		Format formatter1 = new SimpleDateFormat("dd/MM/yyyy HH:MM:SS");
		String s1 = formatter1.format(new Date());
		System.out.println(s1);
	}

}
