package serialization;

import java.io.*;

public class IOQ {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos=new FileOutputStream("C:/Users/aabha/OneDrive/Desktop/output.txt");
		String data = "Learning ";
		fos.write(data.getBytes());
		fos.close();
		fos = new FileOutputStream("C:/Users/aabha/OneDrive/Desktop/output.txt");
		data = "Java is really fun!";
		fos.write(data.getBytes());
		fos.close();
	}
}
