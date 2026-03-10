package freshStart;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDowns {
public static void main(String[] args) {
		
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		WebElement drop=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown=new Select(drop);
		dropdown.selectByContainsVisibleText("AED");
		dropdown.selectByIndex(2);
		dropdown.selectByValue("INR");
		List<WebElement> opt = dropdown.getOptions();
		for(WebElement op: opt)
		{
			
			System.out.println(op.getText());
			if(op.getText().equals("AED"));
			op.click();
			break;
		}
		

		
		
}
}
