package weekday2;

public class Mobile {
	
	
	short NoofNewpiece= 1000;
	String MobileBrandName="Vivo y5";
	int Storage=256;
	long ModelNumber=9344198851l;
	float MobilePrice=15000.00f;
	boolean ishaet=false;
	
	public static void main(String[] args) {
		
		Mobile vivoMobile=new Mobile();
		
		System.out.println(vivoMobile.MobileBrandName);
		System.out.println("noOfMobilePieces="+vivoMobile.NoofNewpiece);
		System.out.println("modelNumber="+vivoMobile.ModelNumber);
		System.out.println("storage="+vivoMobile.Storage);
		System.out.println("Price="+vivoMobile.MobilePrice);
		System.out.println("ishaet="+vivoMobile.ishaet);
		
		
	}
}