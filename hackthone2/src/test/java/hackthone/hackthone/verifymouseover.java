package hackthone.hackthone;


import org.testng.annotations.Test;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import resources.base;

public class verifymouseover extends base {
	WebDriver driver;

	@Test
	public void login() throws Exception{
		driver = initialize();
		driver.get("https://www.flipkart.com/");
		
		mouseover hover=new mouseover(driver);
		hover.getname().sendKeys("7387701985");
		hover.getpass().sendKeys("Priyanka@22");
		hover.getlogin().click();
		
		Thread.sleep(3000);
		Actions act=new Actions(driver);
		act.moveToElement(hover.getelectronics()).build().perform();
		
		/*//11.Mouseover on baby& toys
		Thread.sleep(3000);
		hover.getkidstoys().click();
		
		
		Set<String> windows=driver.getWindowHandles(); //parent id and child id
	       Iterator<String> it=windows.iterator();
	      String parentID= it.next();  //control will goes to zeroth index
	       // child id
	      
		Thread.sleep(3000);
		act.moveToElement(hover.getkidsandtoys()).build().perform();
		hover.getkidsandtoys().click();
		
		hover.remote().click();
		*/
	

      
}

}