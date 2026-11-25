package com.AutomationExercise.demo.testcase;


import org.testng.annotations.Test;

import com.AutomationExercise.demo.Basetest.BaseClass;
import com.AutomationExercise.demo.POM.HomePage;
import com.AutomationExercise.demo.POM.SignUpPage;

public class RegisterUser extends BaseClass {
	
	@Test
	public void RegisterUserTest() throws Throwable {
		String name = eu.getDataFromExcel("accountDetails", 1, 0) ;
		String email = eu.getDataFromExcel("accountDetails", 1, 1) ;
		String password = eu.getDataFromExcel("accountDetails", 1, 2) ;
		String FN= eu.getDataFromExcel("accountDetails", 1, 3);
		String LN= eu.getDataFromExcel("accountDetails", 1, 4) ;
		String address= eu.getDataFromExcel("accountDetails", 1, 5) ;
		String state= eu.getDataFromExcel("accountDetails", 1, 6);
		String city= eu.getDataFromExcel("accountDetails", 1, 7);
		String zipcode= eu.getDataFromExcel("accountDetails", 1, 8);
		String mobnum= eu.getDataFromExcel("accountDetails", 1, 9) ;
		wu.maximize(driver);
		wu.waiForPageLoad(driver);
		HomePage hp=new HomePage(driver);
		String homepagemsg = hp.getHomepagemsg().getText();
		System.out.println(homepagemsg);
		hp.getSignuplink().click();
		SignUpPage sp=new SignUpPage(driver);
		sp.getSignupname().sendKeys(name+ju.getRandomNum());
		sp.getSignupemail().sendKeys(email+ju.getRandomNum()+"@gmail.com");
		sp.getSignupbtn().click();
		sp.getTitleradiobtn().click();
		sp.getPwdfield().sendKeys(password+ju.getRandomNum());
		/*
		 * WebElement days = driver.findElement(By.id("days")); Select s = new
		 * Select(days); s.selectByValue("1"); WebElement month =
		 * driver.findElement(By.id("months")); Select s1=new Select(month);
		 * s1.selectByValue(""); WebElement year = driver.findElement(By.id("years"));
		 * Select s2=new Select(year); s2.selectByValue("");
		 */
		sp.getNewslettercheckbox().click();
		sp.getRecievescheckbox().click();
		sp.getFNtextfield().sendKeys(FN);
		sp.getLNtextfield().sendKeys(LN);
		sp.getAddressfield().sendKeys(address);
		/*
		 * WebElement country = driver.findElement(By.id("country")); Select s3=new
		 * Select(country); s3.selectByValue("");
		 */
		sp.getStatefield().sendKeys(state);
		sp.getCityfield().sendKeys(city);
		sp.getZipcodefield().sendKeys(zipcode);
		sp.getMobnofield().sendKeys(mobnum);
	    sp.getCreateaccbtn().click();
		
	}

}
