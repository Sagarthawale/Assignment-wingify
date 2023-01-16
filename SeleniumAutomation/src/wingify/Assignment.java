package wingify;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://sakshingp.github.io/assignment/login.html");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 driver.findElement(By.id("username")).sendKeys("thawale82@gmail.com");
		 Thread.sleep(2000);
		 driver.findElement(By.id("password")).sendKeys("Sagar@123");
		 Thread.sleep(2000);
		 driver.findElement(By.id("log-in")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.id("amount")).click();
		 

	}

}

