package freshStart;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class framesNew {

	@Test

	public void windowDemo() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/");

		driver.findElement(By.xpath("//a[text()='Selenium Practice']")).click();
//		Actions act=new Actions(driver);
//		act.moveToElement(hover).click().perform();
		List<WebElement> lst = driver.findElements(By.xpath("//li[@class='parent'][3]/ul/li/a"));
		System.out.println(driver.findElements(By.xpath("//li[@class='parent'][3]/ul/li/a")).size());
		for (WebElement ls : lst) {
			System.out.println(ls.getText());
			if(ls.getText().equals("Frames Practice"))
			{
				ls.click();
				break;
			}
	
		}
		//driver.switchTo().frame(driver.findElement(By.id("ad_iframe")));
		//driver.findElement(By.cssSelector(".ns-94a6g-e-21")).click();
		driver.switchTo().frame(driver.findElement(By.id("frm1")));
		Select slct=new Select(driver.findElement(By.id("course")));
		slct.selectByContainsVisibleText("Dot Net");
		System.out.println(slct.getFirstSelectedOption().getText());

	}

}
