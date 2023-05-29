package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
 
public class Script01 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.co.in/");
		Thread.sleep(3000);
		driver.findElement(By.id("APjFqb"));
		Thread.sleep(3000);
	    driver.findElement(By.className("M6CB1c rr4y5c")).click();
	    //Thread.sleep(3000);
	    driver.findElement(By.id("APjFqb")).sendKeys("facebook login");
	    driver.findElement(By.className("LC20lb MBeuO DKV0Md")).click();
	    driver.findElement(By.id("email")).sendKeys("akash");
	    driver.findElement(By.id("pass")).sendKeys("12345");
	    driver.findElement(By.className("_9lsa")).click();
	
		
		
	}
}
