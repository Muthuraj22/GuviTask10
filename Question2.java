package task10;

import java.time.Duration;
import org.junit.Assert;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Question2 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		
		WebElement element1 = driver.findElement(By.id("draggable"));
		WebElement element2 = driver.findElement(By.id("droppable"));
		
		String beforeColor = element2.getCssValue("background-color");
		System.out.println(beforeColor);
		
		Actions Act = new Actions(driver);
		Act.dragAndDrop(element1, element2).perform();
		
		String afterColor = element2.getCssValue("background-color");
		System.out.println(afterColor);
		
		if(beforeColor != afterColor) {
			System.out.println("Dropped Successfully");
		} else {
			System.out.println("unsuccessfull");
		}
		
		String afterText = element2.getText();
		Assert.assertEquals("Dropped!", afterText);
		
	}

}
