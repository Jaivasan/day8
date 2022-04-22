package day8;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchAlert {
public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\Users\\SONY\\eclipse-workspace-Jai\\Selenium\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Alerts.html");
	
	Thread.sleep(3000);
	//Simple Alert
	driver.findElement(By.xpath("(//a[contains(text(),'Alert with OK')] )[1]")).click();
	driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
	
	Thread.sleep(3000);
	
	 Alert alert = driver.switchTo().alert();
	 alert.accept();
	 
	 //Confirm Alert
	 
	 driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
	 driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	 alert.dismiss();
	 
	 Thread.sleep(3000);
	 
	 driver.findElement(By.xpath("(//a[@class='analystic'])[3]")).click();
	 driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
	 alert.sendKeys("Jai");
	 alert.accept();
	 
	 
	 Thread.sleep(3000);
	 	
}
}
