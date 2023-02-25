package weekday2;

public class Twowheeler {

int noOfWheels=2;
byte engine=1;
short noOFMirrors=2;
String bikeName="Apache rtr160";
char carFirstLetter='A';
double runningKM=51423.77;
boolean headlightdamged=true;

public static void main(String[] args) {
	
	Twowheeler myBike =new Twowheeler();
	System.out.println(myBike.bikeName);
	System.out.println("engine=" +myBike.engine);
	System.out.println("headlightdamged=" +myBike.headlightdamged);
	System.out.println("runningKM="+myBike.runningKM);
	System.out.println("noOfwheels="+myBike.noOfWheels);
	System.out.println("noOfMirrors="+myBike.noOFMirrors);
	
	
}

	
}