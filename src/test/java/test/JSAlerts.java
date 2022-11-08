package test;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JSAlerts {

	 public static void main(String[] args) throws InterruptedException {
		
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 driver.manage().window().maximize();
		 driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		 Thread.sleep(3000);
		 
		 //js alert
		 driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
		 Alert alert1 = driver.switchTo().alert();
		 System.out.println(alert1.getText());
		 Thread.sleep(3000);
		 alert1.accept();
		 if(driver.getPageSource().contains("You successfully clicked an alert"));
		 	System.out.println("You successfully clicked an alert");
		 System.out.println("==================================================");
		 
		 //js confirm
		 driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
		 Alert alert2 = driver.switchTo().alert();
		 System.out.println(alert1.getText());
		 Thread.sleep(3000);
		 alert2.dismiss();
		 if(driver.getPageSource().contains("You clicked: Cancel"));
		 	System.out.println("You clicked: Cancel");
		 System.out.println("==================================================");
		 
		//js prompt
		 driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
		 Alert alert3 = driver.switchTo().alert();
		 System.out.println(alert3.getText());
		 Thread.sleep(3000);
		 alert3.sendKeys("Selenium Java");
		 alert1.accept();
		 Thread.sleep(3000);
		 if(driver.getPageSource().contains("You entered: Selenium Java"));
		 	System.out.println("You entered: Selenium Java");
		 System.out.println("==================================================");
		 
		 driver.close();
		 driver.quit();
		 
	}
}
