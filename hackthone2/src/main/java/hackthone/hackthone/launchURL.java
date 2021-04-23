package hackthone.hackthone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class launchURL {
	public WebDriver driver;

	By name = By.xpath("//input[@class='_2IX_2- VJZDxU']");
	By pass = By.xpath("//input[@type='password']");
	By click_link = By.xpath("//button[@type='submit']//span[contains(text(),'Login')]");

	By click_acct=By.xpath("//div[contains(text(),'Priyanka')]");
	
	By click_Myprofile=By.xpath("//li[1]//a[1]");
	
	//logout
	By log_out=By.xpath("//a[@href='#']");
	public launchURL(WebDriver driver) {
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
	public WebElement getacct() {
		return driver.findElement(click_acct);
	}
	public WebElement getmyprofile() {
		return driver.findElement(click_Myprofile);
	}
	
	public WebElement clicklogout() {
		return driver.findElement(log_out);
	}
}
