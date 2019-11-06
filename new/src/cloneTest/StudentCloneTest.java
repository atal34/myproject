package cloneTest;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class StudentCloneTest {

	public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {

		Cource c1 = new Cource("Eng", "Hindi");
		Student1 s1 = new Student1("Atal", 1, "Pune",c1);
		String filename = ("C:\\Users\\689218\\Desktop\\test.txt");
		
		 ByteArrayOutputStream bos = new ByteArrayOutputStream();
		 
		 FileOutputStream file = new FileOutputStream(filename); 
         ObjectOutputStream out = new ObjectOutputStream(file);
         // Method for serialization of object 
         out.writeObject(s1); 
           
         out.close(); 
         file.close(); 
           
         System.out.println("Object has been serialized"); 
         
         Student1 s3 = null;
         // Deserialization 
         try
         {    
             // Reading the object from a file 
        	 FileInputStream file1 = new FileInputStream(filename); 
             ObjectInputStream in = new ObjectInputStream(file1); 
               
             // Method for deserialization of object 
             s3 = (Student1)in.readObject(); 
               
             in.close(); 
             file.close(); 
               
             System.out.println("Object has been deserialized "); 
             System.out.println("a = " + s3.getName()); 
             System.out.println("b = " + s3.c1.sub1); 
             System.out.println("b = " + s3.c1.sub2); 
         } 
           
         catch(IOException ex) 
         { 
             System.out.println("IOException is caught"); 
         }
         
		
		
		
		Student1 s2 = (Student1) s1.clone();
		
		s2.c1.sub1 = "Maths";
		s2.setName("Atal Phatak");

		System.out.println(s1.c1.sub1);
		System.out.println(s1.getName());
	}

}
