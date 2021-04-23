package hackthone.hackthone;

import org.testng.annotations.Test;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import resources.base;

public class checkcategory extends base{
	WebDriver driver;

	@Test
	public void login() throws Exception{
		driver = initialize();
		driver.get("https://www.flipkart.com/");
		
		navigatetocategoryurl cate=new navigatetocategoryurl(driver);
		cate.getname().sendKeys("7387701985");
		cate.getpass().sendKeys("Priyanka@22");
		cate.getlogin().click();
		
		Thread.sleep(3000);
		cate.getelectronics().click();
		
	}
}
