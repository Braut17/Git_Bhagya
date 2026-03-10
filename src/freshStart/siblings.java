package freshStart;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class siblings {
	
	public static void main(String[] args) {
		
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		String buttonText=driver.findElement(By.xpath("//button[text()='Practice']/following-sibling::button[text()='Signup']")).getText();
		System.out.println(buttonText);

		//Child to Parent
		WebElement but=driver.findElement(By.xpath("//button[text()='Practice']/parent::div/parent::header"));
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10000));
		wait.until(ExpectedConditions.elementToBeClickable(but));
	
	}

}
