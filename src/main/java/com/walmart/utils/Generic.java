package com.walmart.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Generic {
	public static WebDriver driver;

	public static void browserInit() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\saadi\\eclipse-workspace\\seleniumAutomation\\SeleniumPractice\\driver\\chromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	
	}
	public void navigateTo() {
		driver.get("https://www.walmart.com/");
	}

}
