package testcases;

import org.junit.AfterClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;

@RunWith(SerenityRunner.class)
public class LaunchChromeBrowser extends PageObject{

	@Managed
	WebDriver driver;
	
	
	@Test
	public void launchChromeWindow() {
		open();
		find(By.xpath("//input[@aria-label='Search a product']")).typeAndEnter("Women Asics");
		//$("//input[@name='q']").typeAndEnter("Serenity");
	}

}
