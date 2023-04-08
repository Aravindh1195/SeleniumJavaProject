package day04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Program03 {
	

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
		driver = new EdgeDriver();
		driver.get("https://www.myntra.com/");
		
		Actions action = new Actions(driver);
		WebElement btn = driver.findElement(By.xpath("//a[@data-group='home_&_living']"));
		WebElement btn2 = driver.findElement(By.xpath("//a[text()='clocks']"));
		action.moveToElement(btn).build().perform();
		Thread.sleep(4000);
		action.click(btn2).build().perform();
		
		
		
	}
		

}
