package freshStart;
import org.testng.*;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;
public class locators1 {
	
	
	@Test
	
	public void locators() throws InterruptedException
	{
		
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("rautbhagyashree17@gmail.com");
		driver.findElement(By.cssSelector("input[name='inputPassword']")).sendKeys("sgdsgdjksd");
		driver.findElement(By.cssSelector("input[value='agreeTerms']")).click();
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
		String errorMessage = driver.findElement(By.xpath("//p[text()='* Incorrect username or password']")).getText();
		System.out.println(errorMessage);
		
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Bhagya");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("rautbhagyashree17@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("1231231234");
		Thread.sleep(5000);
		driver.findElement(By.className("reset-pwd-btn")).click();
		String email = driver.findElement(By.cssSelector(".infoMsg")).getText();
		System.out.println(email);
		
		driver.findElement(By.cssSelector(".go-to-login-btn")).click();
		String [] arr=email.split("password");
		String eml=arr[1].trim();
		String [] str=eml.split("to");
		String pwd=str[0];
		System.out.println(str[0]);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("rautbhagyashree17@gmail.com");
		driver.findElement(By.cssSelector("input[name='inputPassword']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("input[value='agreeTerms']")).click();
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
		String successMsg=driver.findElement(By.xpath("//p[text()='You are successfully logged in.']")).getText();
		System.out.println(successMsg);
		Assert.assertEquals("You are successfully logged in.", successMsg);
		String msg = driver.findElement(By.xpath("//h2")).getText();
		System.out.println(msg);
		//driver.quit();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
	}

}
