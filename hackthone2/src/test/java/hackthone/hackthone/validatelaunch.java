package hackthone.hackthone;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


import resources.base;

public class validatelaunch extends base {
	WebDriver driver;

	@Test
	public void login() throws Exception {
		driver = initialize();
		driver.get("https://www.flipkart.com/");
	
	launchURL launch=new launchURL(driver);
	launch.getname().sendKeys("7387701985");
	launch.getpass().sendKeys("Priyanka@22");
	launch.getlogin().click();
	
	Actions act=new Actions(driver);
	act.moveToElement(launch.getacct()).build().perform();
	
	//launch.getmyprofile().click();
	System.out.println(launch.getacct().getText());
	
	launch.clicklogout().click();
	}
				
}
