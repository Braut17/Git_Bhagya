package freshStart;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class windowSwitching {
	
	@Test
	
	
	public void windowDemo()
	{
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.partialLinkText("InterviewQues/ResumeAssistance/Material")).click();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> itr=windows.iterator();
		String parent = itr.next();
		System.out.println(parent);
		String child = itr.next();		
		driver.switchTo().window(child);		
		String email= driver.findElement(By.xpath("//a[text()='mentor@rahulshettyacademy.com']")).getText();
		System.out.println(email);
	}

}
