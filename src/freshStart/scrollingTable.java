package freshStart;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class scrollingTable {
	
	
	@Test

	public void scrolling() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		WebElement table=driver.findElement(By.id("product"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView(true);", table);
        js.executeScript("document.querySelector('.tableFixHead').scrollTop=500");
		List<WebElement> tabl=driver.findElements(By.xpath("//div[@class='tableFixHead']/table/tbody/tr/td[4]"));
		int sum=0;
		for(WebElement tb: tabl)
		{
			
			int lk = Integer.parseInt(tb.getText());
			System.out.println(lk);
			sum=sum+lk;
			
		}
		System.out.println(sum);
		
		String values = driver.findElement(By.xpath("//div[text()=' Total Amount Collected: 296 ']")).getText();
		String[] val = values.split(": ");
		SoftAssert sa=new SoftAssert();
		System.out.println(val[1]);
		int outCome = Integer.parseInt(val[1]);
		sa.assertEquals(sum, outCome);
		sa.assertEquals(sum, 22);
 
		System.out.println("Test Pass");
		sa.assertAll();
		
		
	}

}
