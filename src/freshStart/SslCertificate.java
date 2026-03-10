package freshStart;

import java.time.Duration;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class SslCertificate {
	
	
	@Test

	public void scrolling() throws InterruptedException {
		ChromeOptions opt=new ChromeOptions();
		opt.setAcceptInsecureCerts(true);
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://expired.badssl.com/");
		System.out.println(driver.getTitle());
		Proxy proxy=new Proxy();
		
		proxy.setHttpProxy("ipaddress:4444");
		
	}

}
