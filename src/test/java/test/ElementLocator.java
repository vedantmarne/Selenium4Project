package test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementLocator {
		
		public static void main(String[] args) throws InterruptedException {
			
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));  
			driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2));  
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
			
			driver.manage().window().maximize();
			
			/*
			driver.get("https://google.com");
			WebElement searchBox = driver.findElement(By.name("q"));
			searchBox.sendKeys("Selenium",Keys.ENTER);
			*/
			
			/*
			driver.navigate().to("https://trytestingthis.netlify.app/");
			List<WebElement> options = driver.findElements(By.name("Optionwithcheck[]"));
			for(WebElement element : options)
			{
				System.out.println(element.getText());
			}
			
			driver.findElement(By.cssSelector("#fname")).sendKeys("Vedant");
			*/
			
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			//driver.navigate().refresh();
			//WebElement loginButton = driver.findElement(By.cssSelector("oxd-button oxd-button--medium oxd-button--main orangehrm-login-button"));
			WebElement loginButton = driver.findElement(By.tagName("button"));
			driver.findElement(RelativeLocator.with(By.tagName("input")).above(loginButton)).sendKeys("admin123");
			
			Thread.sleep(2000);
			
			
			
			driver.close();
			
		}
}
