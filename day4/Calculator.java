package week1.day4;

public class Calculator {
	public int addTwonumber (int a,int b) {
		
		int c=a+b;
		return c;
	}
public void subTwonumber (int e,int f) {
		
		int c=e-f;
		System.out.println(c);
	}
public void multipleTwonumber (int i ,int j) {
		
		double d=i*j;
		System.out.println(d);
}
public void divideTwonumber (int x ,int y) {
	
	float e=x/y;
	System.out.println(e);
}
public static void main(String[] args) {
	Calculator calc=new Calculator();
	int sum = calc.addTwonumber(100,100);
	System.out.println(sum);
	calc.subTwonumber(10,20);
	calc.multipleTwonumber(10, 50);
	calc.divideTwonumber(20, 30);
	
}
}



