package com.loginrrs;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LoginRRS {
public static void main(String[] args) throws InterruptedException {
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	ChromeDriver driver = new ChromeDriver(options);
	
	driver.get("https://beta.roadrunnersports.com/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.manage().window().maximize();
	driver.findElement(By.id("login_emailAddress")).sendKeys("sathishdemo7@gmail.com");
	driver.findElement(By.id("login_password")).sendKeys("Qwerty@12345");
	
	
	
	
}
}
