package freshStart;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class mouseActions {
	
	
	@Test
	
	
	public void actionsDemo()
	{
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");
		Actions act=new Actions(driver);
		//WebElement signInPage=driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		//act.moveToElement(signInPage).build().perform();
		driver.get("https://www.google.com");
		act.moveToElement(driver.findElement(By.cssSelector(".gLFyf"))).click().keyDown(Keys.SHIFT).sendKeys("bhagyashree").doubleClick().contextClick().perform();
		

		
		
	}

}
