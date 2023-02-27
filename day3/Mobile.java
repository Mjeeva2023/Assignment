package week.day3;

public class Mobile {

	public void poweron() {
		System.out.println("poweron");
	}
	public void call() {
		System.out.println("call");
}
	public void dataon() {
		System.out.println("dataon");
	}
	public void applypassword() {
		System.out.println("applypassword");
}
	public void camera() {
		System.out.println("camera");
	}
	public void appliction() {
		System.out.println("appliction");
		
	}
	public void simcard() {
		System.out.println("simcard");
	}	
	
	
	public static void main(String[] args) {
		
		Mobile myMoblie=new Mobile();
		
		myMoblie.call();
		myMoblie.camera();
		myMoblie.applypassword();
		myMoblie.dataon();
		myMoblie.poweron();
		myMoblie.simcard();
		myMoblie.appliction();
		
		
		
	}
		
}


