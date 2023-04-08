package day04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;


public class Program04 {
	


	public static void main(String[] args) throws InterruptedException {

	
	WebDriver driver;
	driver = new EdgeDriver();
	driver.get("https://demo.automationtesting.in/Alerts.html");
	driver.findElement(By.xpath("//a[@href='#CancelTab']")).click();
	driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	System.out.println(driver.switchTo().alert().getText());
	driver.switchTo().alert().accept();//ok
	//driver.switchTo().alert().dismiss();//cancel
	
	
	}
	
	
}
