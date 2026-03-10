package freshStart;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class multipleWindowsAndTabs {
	
	@Test

	public void multipleWindowsAndTabs() throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice");
		driver.switchTo().newWindow(WindowType.TAB);
		Set<String> windows=driver.getWindowHandles();
		Iterator<String> it=windows.iterator();
		String parentWin = it.next();
		String childWin = it.next();
		driver.switchTo().window(childWin);
		driver.get("https://rahulshettyacademy.com/");
	}

}
