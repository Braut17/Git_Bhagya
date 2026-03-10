package freshStart;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class linksInSeparateTab {

	
	@Test

	public void links() throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice");
		WebElement aboveLoc = driver.findElement(By.cssSelector("input[name='name']"));
		String txt = driver.findElement(with(By.tagName("label")).above(By.cssSelector("input[name='name']"))).getText();
		System.out.println(txt);
		String txt2=driver.findElement(with(By.id("exampleFormControlSelect1")).below(By.xpath("//label[text()='Gender']"))).getText();
	    System.out.println(txt2);
	    String textNew = driver.findElement(with(By.xpath("//label[text()='Student']")).toRightOf(By.xpath("//label[text()='Employed']"))).getText();
	    System.out.println(textNew);
	
	}
}
