
public class ThreadDemo extends Thread implements Cloneable
{ 
	public void run()
	
	{ 
		System.out.println("Run"); 
	
	} 
	public static void main(String a[])
	{ 
		Thread t  = new ThreadDemo();
		System.out.println(t.getState());
		Thread t1 = new Thread(new ThreadDemo()); 
	t1.start(); 
	t.start();
	//t1.start(); 
	t.getPriority();
	System.out.println(t.getState());
	

	} 
	}


	
