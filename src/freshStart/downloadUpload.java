package freshStart;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class downloadUpload {
		
	@Test

	public void downloadUpload() throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/upload-download-test/index.html");
		//Download
		driver.findElement(By.id("downloadButton")).click();
		//Edit Excel
		
		//Upload
		driver.findElement(By.id("fileinput")).sendKeys("C://Users//BHAGYASHREE RAUT//Downloads/download.xlsx");
		//Wait for Success Message
		WebElement ele = driver.findElement(By.xpath("//div[text()='Updated Excel Data Successfully.']"));
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
	    wait.until(ExpectedConditions.visibilityOf(ele));
	    String txt=ele.getText();
	    System.out.println(ele.getText());
		File ss=ele.getScreenshotAs(OutputType.FILE);
		File dest=new File("C://Users//BHAGYASHREE RAUT//eclipse-workspace//freshStart//src//freshStart/scrnsss.png");
		FileUtils.copyFile(ss, dest);
		//Verify on UI
		Assert.assertEquals("Updated Excel Data Successfully.", txt);
		WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(30));
	    wait1.until(ExpectedConditions.invisibilityOf(ele));
//	    String val = driver.findElement(By.id("cell-4-undefined")).getText();
//	    int valInt = Integer.parseInt(val);
//	    Assert.assertEquals(val, valInt);
	    
	    //Parent child and siblings traverse
	    
	    String price = driver.findElement(By.xpath("//div[@id='row-1']/div[@id='cell-4-undefined']/div")).getText();
	    int prc = Integer.parseInt(price);
	    Assert.assertEquals(prc, 0);
	    driver.findElement(By.id("downloadButton")).click();	    
	    System.out.println("Success");
	    
      
}
}
