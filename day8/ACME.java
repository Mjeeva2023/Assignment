package assignment.day8;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class ACME {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EdgeDriver d =new EdgeDriver();
		d.get("https://acme-test.uipath.com/login");
		d.manage().window().maximize();
		d.findElement(By.id("email")).sendKeys("kumar.testleaf@gmail.com");
		d.findElement(By.name("password")).sendKeys("leaf@12");
		d.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		String expectedResult ="ACME System 1 -  Dashboard";
		String actualResult= d.getTitle();
		if(expectedResult .equals(actualResult));
		System.out.println("Print=" +expectedResult);
		d.findElement(By.xpath("//a[text()='Log Out']")).click();
		//d.close();


	}

}
