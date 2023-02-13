package com.testing.omeayo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoTest {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("Why do we");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		WebElement suggestions = driver.findElement(By.cssSelector("div[class='aajZCb'] div:nth-child(2) ul:nth-child(1)"));
		List<WebElement> suggestionList = suggestions.findElements(By.tagName("li"));
		System.out.println(suggestionList);
		driver.quit();

	}
}

