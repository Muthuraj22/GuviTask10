package task10;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question1 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://jqueryui.com/datepicker");
		
		WebElement iframeElement = driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(iframeElement);
		
		WebElement datepicker = driver.findElement(By.id("datepicker"));
		datepicker.click();
		
		WebElement nextMonthButton = driver.findElement(By.className("ui-icon-circle-triangle-e"));
		nextMonthButton.click();
		
		WebElement dateButton = driver.findElement(By.xpath("//a[@data-date='22']"));
		dateButton.click();
		
		@SuppressWarnings("deprecation")
		String selectedDate =  datepicker.getAttribute("value");
		System.out.println("Selected Date: " +selectedDate);
		driver.switchTo().defaultContent();

        driver.quit();
	}

}
