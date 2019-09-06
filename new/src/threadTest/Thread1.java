package threadTest;

public class Thread1 extends Thread{
	
	@Override
	public void run() {
		super.run();
		
		for(int j=0;j<=70;j++){
		System.out.println("Running Thread1");
		}
	}

}
