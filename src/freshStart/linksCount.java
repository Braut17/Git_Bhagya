package freshStart;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class linksCount {
	
	@Test

	public void scrolling() throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		int linksCount = driver.findElements(By.tagName("a")).size();
		System.out.println(linksCount);
		WebElement scrl = driver.findElement(By.xpath("//span[text()='Rewards']"));
		File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("C://Users//BHAGYASHREE RAUT//eclipse-workspace//freshStart//src//freshStart/scrn.png");
		FileUtils.copyFile(file, dest);
		SoftAssert st=new SoftAssert();
		st.assertEquals(linksCount, 12);
		System.out.println("HardAssert");
//		Assert.assertEquals(linksCount, 12);
	}
}
