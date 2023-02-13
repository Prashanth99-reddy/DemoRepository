package com.testing.omeayo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		driver.manage().window().maximize();
		//driver.findElement(By.className("hidden-xs hidden-sm hidden-md")).click();
		//driver.findElement(By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Login']")).click();
		//Thread.sleep(2000);
		
		driver.findElement(By.id("input-email")).sendKeys("prashanth1@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("12345");
		driver.findElement(By.cssSelector("input[value='Login']")).click();
		
		Thread.sleep(3000);
		driver.quit();
		

	}

}
