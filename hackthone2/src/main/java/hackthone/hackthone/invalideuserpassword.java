package hackthone.hackthone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class invalideuserpassword {
	WebDriver driver;
	By name = By.xpath("//input[@class='_2IX_2- VJZDxU']");
	By pass = By.xpath("//input[@type='password']");
	By click_link = By.xpath("//button[@type='submit']//span[contains(text(),'Login')]");
	
	//verify text
	By error=By.xpath("//span[contains(text(),'Please enter valid Email ID/Mobile number')]");
	public invalideuserpassword(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getname() {
		return driver.findElement(name);
	}

	public WebElement getpass() {
		return driver.findElement(pass);
	}

	public WebElement getlogin() {
		return driver.findElement(click_link);
	}
	
	public WebElement geterror() {
		return driver.findElement(error);
	}
}
