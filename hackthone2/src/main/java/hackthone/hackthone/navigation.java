package hackthone.hackthone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class navigation {
	WebDriver driver;
	By name = By.xpath("//input[@class='_2IX_2- VJZDxU']");
	By pass = By.xpath("//input[@type='password']");
	By click_link = By.xpath("//button[@type='submit']//span[contains(text(),'Login')]");
	
	//9.search
	
	By search=By.xpath("//*[@id='container']/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input");
	//10.
	By flights = By.xpath("//p[normalize-space()='Flights']");

	public navigation(WebDriver driver) {
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
	
	public WebElement getsearch() {
		return driver.findElement(search);
	}
	
	
	public WebElement getfilghtlink() {
		return driver.findElement(flights);
	}
	
}
