package freshStart;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class scrolling {
	
	
	@Test

	public void scrolling() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
        //js.executeScript("window.scrollBy(0,100)");
		//js.executeScript("window.scrollTo(0,200)");
		WebElement scroll = driver.findElement(By.xpath("//span[text()='Tax Docs']"));
	    //js.executeScript("arguments[0].scrollIntoView(true);", scroll);
		//Vertically and Horizontally Scroll
		
		
	}
}
