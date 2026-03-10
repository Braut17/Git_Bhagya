package freshStart;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class brokenLinks {

	
	@Test

	public void brokenLinks() throws InterruptedException, MalformedURLException, IOException {
		ChromeOptions opt=new ChromeOptions();
		opt.setAcceptInsecureCerts(true);
		opt.addArguments("--disable-notifications");

		WebDriver driver = new ChromeDriver(opt);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		String url=driver.findElement(By.cssSelector("a[href*='soapui']")).getAttribute("href");
		System.out.println(url);
		// open connection using url class		
		URLConnection conn = new URL(url).openConnection();
	
		
		
	}
}
