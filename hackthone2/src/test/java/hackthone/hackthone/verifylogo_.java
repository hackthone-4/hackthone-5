package hackthone.hackthone;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import resources.base;

public class verifylogo_  extends base{
	WebDriver driver;
	@Test
	public void login() throws Exception{
		driver = initialize();
		driver.get("https://www.flipkart.com/");;
	WebElement ImageFile = driver.findElement(By.xpath("//*[@id='container']/div/div[3]/div[2]/div/div[1]/span/div/img[1]"));
        
        Boolean ImagePresent = (Boolean) ((JavascriptExecutor)driver).executeScript("return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0", ImageFile);
        if (!ImagePresent)
        {
             System.out.println("Image not displayed.");
        }
        else
        {
            System.out.println("Image displayed.");
        }
	}
}
