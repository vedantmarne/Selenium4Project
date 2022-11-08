package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		/*
		//find element
		driver.get("https://google.com");
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("Selenium"+Keys.ENTER);
		//driver.findElement(By.linkText("Google Search")).click();
		*/
		
		/*
		//find element
		driver.get("https://trytestingthis.netlify.app/");
		List<WebElement> elements = driver.findElements(By.tagName("select"));
		
		for(WebElement element : elements) {
			System.out.println(element.getText());
		}
		*/
		
		/*
		//find element within element
		driver.get("https://google.com");
		WebElement form = driver.findElement(By.tagName("form"));
		form.findElement(By.name("q")).sendKeys("Selenium"+Keys.ENTER);
		*/
		
		/*
		//get active element
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("Selenium");
		// Get attribute of current active element
		String title = driver.switchTo().activeElement().getAttribute("title");
		System.out.println(title);
		*/
		
		/*
		//get tagname,text,css etc
		driver.get("https://google.com");
		WebElement searchBox = driver.findElement(By.name("q"));
		String tagName = searchBox.getTagName();
		String text = searchBox.getText();
		String cssValue = searchBox.getCssValue("font");
		
		System.out.println(tagName+" | "+text+" | "+cssValue);
		*/
		
		//check element is enabled,is selected
		driver.get("https://the-internet.herokuapp.com/checkboxes");
		WebElement checkbox = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
		System.out.println(checkbox.isEnabled());
		System.out.println(checkbox.isSelected());
		
		Thread.sleep(2000);
		driver.quit();
	}
}
