package task10;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Question3 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.guvi.in/");
		
		driver.findElement(By.linkText("Sign up")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		driver.findElement(By.id("name")).sendKeys("Muthu");
		driver.findElement(By.id("email")).sendKeys("raj.muthupb@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Muthu123");
		driver.findElement(By.id("mobileNumber")).sendKeys("8900970229");
		driver.findElement(By.className("signup-btn")).click();
		
		
		WebElement stuprofile = wait.until(ExpectedConditions.elementToBeClickable(By.id("profileDrpDwn")));
		stuprofile.click();
		
		Select profileDrp = new Select(stuprofile);
		profileDrp.selectByValue("Working professional in IT");
		
		WebElement degree = wait.until(ExpectedConditions.elementToBeClickable(By.id("degreeDrpDwn")));
		degree.click();
		
		Select degreeDrpDwn = new Select(degree);
		degreeDrpDwn.selectByValue("B.E. / B.Tech. Computer Science");
		
		driver.findElement(By.id("year")).sendKeys("2021");
		
		driver.findElement(By.id("details-btn")).click();
	
		WebElement gmailRedirect = wait.until(ExpectedConditions.elementToBeClickable(By.className("gmail-redirect")));
        gmailRedirect.click();
		
		driver.findElement(By.id("login-btn")).click();
		
		driver.findElement(By.id("email")).sendKeys("raj.muthupb@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Muthu123");
		
		driver.findElement(By.id("login-btn")).click();
		
		driver.quit();
	}

}
