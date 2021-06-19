package inheritance;

public class Car {
	
	Car(){
		System.out.println("creating car object");
	}
	
	public String brandName;
	public int engineCC;
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public int getEngineCC() {
		return engineCC;
	}
	public void setEngineCC(int engineCC) {
		this.engineCC = engineCC;
	}
	
	public void run(){
		System.out.println("Running Car");
	}

}
