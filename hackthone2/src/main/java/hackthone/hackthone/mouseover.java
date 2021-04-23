package hackthone.hackthone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class mouseover {
	WebDriver driver;
	By name = By.xpath("//input[@class='_2IX_2- VJZDxU']");
	By pass = By.xpath("//input[@type='password']");
	By click_link = By.xpath("//button[@type='submit']//span[contains(text(),'Login')]");
	//8.
	By click_electroics=By.xpath("//p[normalize-space()='Electronics']");

	
	//11.
	By kids_toys=By.xpath("//p[normalize-space()='Beauty, Toys & More']");
	
	//mouse over on baby & toys link
	
	By babyAndkids=By.xpath("//span[@class='_2I9KP_ _2WDRax']");
	
	//select remote control
	
	By remote=By.xpath("//a[normalize-space()='Remote Control Toys']");
	public mouseover(WebDriver driver) {
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
	public WebElement getelectronics() {
		return driver.findElement(click_electroics);
	}
	public WebElement getkidstoys() {
		return driver.findElement(kids_toys);
	}
	
	public WebElement getkidsandtoys() {
		return driver.findElement(babyAndkids);
	}
	public WebElement remote() {
		return driver.findElement(remote);
	}
}
