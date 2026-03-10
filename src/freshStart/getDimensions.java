package freshStart;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class getDimensions {

	
	
	
	
	@Test

	public void getDimensions() throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice");
		WebElement name = driver.findElement(By.className("form-control"));
		name.sendKeys("Bhagya");
		File file=name.getScreenshotAs(OutputType.FILE);
		File dest=new File("C://Users//BHAGYASHREE RAUT//eclipse-workspace//freshStart//src//freshStart/scrn.png");
		FileUtils.copyFile(file, dest);
		System.out.println(name.getRect().getDimension().getHeight());
		System.out.println(name.getRect().getDimension().getWidth());
		

	}
}
