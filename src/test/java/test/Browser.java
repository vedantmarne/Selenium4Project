package test;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		//Using WebDriver Manager
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));  
		driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2));  
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
		//Browser Actions
		//Window management
		// maximize window
		driver.manage().window().maximize();
	 
		//Open a web page
		driver.get("https://google.com");
		driver.navigate().to("https://selenium.dev");
		
		//Get current url
		System.out.println(driver.getCurrentUrl());
		//Get title
		System.out.println(driver.getTitle());
		
		//Forward | Back | Refresh
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		//Take screenshot
		//File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(scrFile, new File("./image.png"));
		
		//Closing browser
		driver.close();
		//driver.quit();
		
	}
}
