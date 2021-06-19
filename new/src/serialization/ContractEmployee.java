package serialization;

import java.io.*;

class Employee {
	String name;
}

public class ContractEmployee extends Employee {
	int salary;

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ContractEmployee cemp = new ContractEmployee(10000, "Sam");
		FileOutputStream fos = new FileOutputStream("C:/Users/aabha/OneDrive/Desktop/dumpsserial.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(cemp);

		FileInputStream fis = new FileInputStream("C:/Users/aabha/OneDrive/Desktop/dumpsserial.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		cemp = (ContractEmployee) ois.readObject();
		System.out.println(cemp);
	}

	ContractEmployee(int salary, String name) {
		super.name = name;
		this.salary = salary;
	}

	public String toString() {
		return super.name + salary;
	}
}
