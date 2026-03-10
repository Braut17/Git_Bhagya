package freshStart;

import java.time.Duration;
import java.util.Set;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class frames {


	@Test
	
	
	public void windowDemo() throws InterruptedException
	{
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable");
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		Actions act= new Actions(driver);
		WebElement source=driver.findElement(By.id("draggable"));
		WebElement dest=driver.findElement(By.id("droppable"));
		Thread.sleep(4000);
		act.dragAndDrop(source, dest).perform();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[text()='Themes']")).click();
		//count links
		driver.findElements(By.tagName("a"));
		java.util.List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println(driver.findElements(By.tagName("a")).size());
		for(WebElement link:links)
		{
			System.out.println(link.getText());
		}
		
		//Footer Links
		System.out.println("Footer Links********************************************");
		WebElement footer = driver.findElement(By.className("clearfix"));
		java.util.List<WebElement> footerLinks = footer.findElements(By.tagName("a"));
		System.out.println("footerLinks "+footerLinks.size());
		
		for(WebElement footLink: footerLinks)
		{
			System.out.println(footLink.getText());
		}
	
	}
}
