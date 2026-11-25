package com.AutomationExercise.demo.generic.WebDriverutility;

import java.time.Duration;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtility {

	public void waiForPageLoad(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void maximize(WebDriver driver) {
		driver.manage().window().maximize();
	}
	public void pageRefersh(WebDriver driver) {
		driver.navigate().refresh();
	}
	
	public void waitForElementPresent(WebDriver driver,WebElement element) {
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	public void waitForalertPresent(WebDriver driver) {
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.alertIsPresent());
				
	}
	public void switchTOTabOnUrl(WebDriver driver, String partialurl) {
		 Set<String> winid = driver.getWindowHandles();
		   for(String window:winid) {
			   driver.switchTo().window(window);
			   String acturl=driver.getCurrentUrl();
			   if(acturl.contains(partialurl)) {
				   break;
			   }
		   }
	}
	public void select(WebElement element, String text) {
		Select sel=new Select(element);
		sel.selectByContainsVisibleText(text);
	}
	public void select(WebElement element, int index) {
		Select sel=new Select(element);
		sel.selectByIndex(index);
	}
	public void selectby(WebElement element, String value) {
		Select sel=new Select(element);
		sel.selectByValue(value);
	}
	public void mouseHover(WebDriver driver, WebElement element) {
		Actions act=new Actions(driver);
		act.moveToElement(element).perform();
	}
	public void doubleClick(WebDriver driver, WebElement element) {
		Actions act=new Actions(driver);
		act.doubleClick(element).perform();
	}

	
}
