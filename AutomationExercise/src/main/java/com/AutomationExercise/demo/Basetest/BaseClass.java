package com.AutomationExercise.demo.Basetest;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.AutomationExercise.demo.generic.Fileutility.ExcelUtility;
import com.AutomationExercise.demo.generic.Fileutility.FileUtility;
import com.AutomationExercise.demo.generic.WebDriverutility.JavaUtility;
import com.AutomationExercise.demo.generic.WebDriverutility.WebDriverUtility;


public class BaseClass {
	public FileUtility fu = new FileUtility();
	public WebDriverUtility wu = new WebDriverUtility();
	public JavaUtility ju = new JavaUtility();
	public ExcelUtility eu = new ExcelUtility();
	public WebDriver driver = null;
	public static WebDriver sdriver = null;
	@BeforeSuite()
	public void configBS() {
		System.out.println("connect to db, Report config");
	}

	@BeforeClass()
	//public void configBC(String Browser) throws Throwable {
	public void configBC() throws Throwable {
		String Browser = fu.getDataFromProperties("browser");

		if (Browser.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (Browser.equals("firefox")) {
			driver = new FirefoxDriver();
		} else if (Browser.equals("edge")) {
			driver = new EdgeDriver();
		} else {
			driver = new ChromeDriver();
		}
        
	
	}

	@BeforeMethod()
	public void configbeforemethod() throws Throwable {
		String URL = fu.getDataFromProperties("url");
		driver.get(URL);
		
	}

	@AfterMethod()
	public void configaftermethod() {
		driver.findElement(By.xpath("//a[text()=' Logout']")).click();
		System.out.println("logout");
	}

	@AfterClass()
	public void configAC() {
		driver.quit();
		System.out.println("close the browser");
	}

	@AfterSuite()
	public void configAS() {
		System.out.println("close db, report backup");
	}

}
