package org.amazon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AmazonTestcase {
public static void main(String[] args) throws Exception {
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	ChromeDriver driver = new ChromeDriver(options);
	
	//ChromeDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("bags");
	
	driver.findElement(By.xpath("//div[@class='s-suggestion-container']//span[contains(text(),'for boys')]")).click();
	
	WebElement result = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
	System.out.println("Result count: " + result.getText());
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//div[@id='brandsRefinements']//span[@class='a-list-item'])[1]")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("(//div[@id='brandsRefinements']//span[@class='a-list-item'])[3]")).click();
	driver.findElement(By.xpath("//span[@class='a-button-text a-declarative']")).click();
	driver.findElement(By.linkText("Newest Arrivals")).click();
	WebElement productTitle = driver.findElement(By.xpath("(//a[@class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal']/span)[1]"));
	System.out.println("Name of the product: " +productTitle.getText());
	
	WebElement price = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]"));
	System.out.println("Price of the product: " +price.getText());
	
	
	System.out.println(driver.getTitle());
	driver.close();
	
}
}
