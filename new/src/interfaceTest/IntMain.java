package interfaceTest;

public class IntMain {

	public static void main(String[] args) {

		ExtClass ec = (ExtClass) new ExtClass(); 
		ec.getName();
		//SampleInterface s = new SampleInterface();
		
		SampleInterface s = new ExtClass();
		
		AbstractClass c = new ExtClass();
		
		c.abstractMethod();
		c.nonAbstractMEthod();
	}

}
