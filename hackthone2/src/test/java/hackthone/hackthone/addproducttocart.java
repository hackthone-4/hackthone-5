package hackthone.hackthone;

import org.testng.annotations.Test;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import resources.base;

public class addproducttocart extends base {
	WebDriver driver;

	@Test
	public void login() throws Exception{
		driver = initialize();
		driver.get("https://www.flipkart.com/");
		
		addproduct add=new addproduct(driver);
		add.getname().sendKeys("7387701985");
		add.getpass().sendKeys("Priyanka@22");
		add.getlogin().click();
		
		add.getsearch().sendKeys("laptop" +Keys.ENTER);
		
		add.getitem().click();
		
		   Set<String> windows=driver.getWindowHandles(); //parent id and child id
	       Iterator<String> it=windows.iterator();
	      String parentID= it.next();  //control will goes to zeroth index
	      String childID=it.next();   // child id
	       driver.switchTo().window(childID);
	      
	       add.getcart().click();
	}
}
