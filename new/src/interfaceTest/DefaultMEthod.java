package interfaceTest;

interface WithDefault{
	default void printDefault(){
		System.out.println("defauly method");
	}
}

class WithDefaultImpl implements WithDefault{
	void callPrint()
	{
		printDefault();
	}
}

public class DefaultMEthod {

	public static void main(String[] args) {

		WithDefaultImpl impl = new WithDefaultImpl();
		impl.callPrint();

	}

}
