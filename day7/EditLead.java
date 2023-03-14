package assignments.day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	 public static void main(String[] args) {
	        //To open browser
	        EdgeDriver driver = new EdgeDriver();

	        //Load the url using get() method
	        //https is mandatory to load the url
	        driver.get("http://leaftaps.com/opentaps/control/main");

//	        //To maximize the window size
	        driver.manage().window().maximize();
	        driver.findElement(By.name("USERNAME")).sendKeys("DemosalesManager");
	        driver.findElement(By.id("password")).sendKeys("crmsfa");
	        driver.findElement(By.className("decorativeSubmit")).click();
//	        //To verify Home Page
	        
	      
     
//	        
	        driver.findElement(By.linkText("CRM/SFA")).click();
	        driver.findElement(By.linkText("Leads")).click();
	        driver.findElement(By.linkText("Create Lead")).click();
	        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
	        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("jeeva");
	        driver.findElement(By.id("createLeadForm_lastName")).sendKeys("M");
	        driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("CSE");
	        driver.findElement(By.id("createLeadForm_description")).sendKeys("SWAG");
	        driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("jeevamuthu046@gmail.com");
	        WebElement stateDropDown = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
	        Select selectStateDropDown = new Select(stateDropDown);
	        selectStateDropDown.selectByVisibleText("New York");
	        driver.findElement(By.className("smallSubmit")).click();
	        driver.findElement(By.linkText("Edit")).click();
	        driver.findElement(By.id("updateLeadForm_description")).clear();
	        driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("MARVAL");
	        driver.findElement(By.className("smallSubmit")).click();
	

	        
}
}
