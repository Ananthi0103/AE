package com.AutomationExercise.demo.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {
	
	WebDriver driver;
	public SignUpPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="name")
	private WebElement signupname;
	@FindBy(xpath="//input[@data-qa='signup-email']")
	private WebElement signupemail;
	@FindBy(xpath="//button[text()='Signup']")
	private WebElement signupbtn;
	@FindBy(xpath="//input[@value='Mrs']")
	private WebElement titleradiobtn;
	@FindBy(id="password")
	private WebElement pwdfield;
	@FindBy(id="days")
	private WebElement daysdropdown;
	@FindBy(id="months")
	private WebElement mondropdown;
	@FindBy(id="years")
	private WebElement yeardropdown;
	@FindBy(id="newsletter")
	private WebElement newslettercheckbox;
	@FindBy(id="optin")
	private WebElement recievescheckbox;
	@FindBy(id="first_name")
	private WebElement FNtextfield;
	@FindBy(id="last_name")
	private WebElement LNtextfield;
	@FindBy(id="address1")
	private WebElement addressfield;
	@FindBy(id="state")
	private WebElement statefield;
	@FindBy(id="city")
	private WebElement cityfield;
	@FindBy(id="zipcode")
	private WebElement zipcodefield;
	@FindBy(id="mobile_number")
	private WebElement mobnofield;
	@FindBy(xpath="//button[text()='Create Account']")
	private WebElement createaccbtn;
	public WebElement getSignupname() {
		return signupname;
	}
	public WebElement getSignupemail() {
		return signupemail;
	}
	public WebElement getSignupbtn() {
		return signupbtn;
	}
	public WebElement getTitleradiobtn() {
		return titleradiobtn;
	}
	public WebElement getPwdfield() {
		return pwdfield;
	}
	public WebElement getDaysdropdown() {
		return daysdropdown;
	}
	public WebElement getMondropdown() {
		return mondropdown;
	}
	public WebElement getYeardropdown() {
		return yeardropdown;
	}
	public WebElement getNewslettercheckbox() {
		return newslettercheckbox;
	}
	public WebElement getRecievescheckbox() {
		return recievescheckbox;
	}
	public WebElement getFNtextfield() {
		return FNtextfield;
	}
	public WebElement getLNtextfield() {
		return LNtextfield;
	}
	public WebElement getAddressfield() {
		return addressfield;
	}
	public WebElement getStatefield() {
		return statefield;
	}
	public WebElement getCityfield() {
		return cityfield;
	}
	public WebElement getZipcodefield() {
		return zipcodefield;
	}
	public WebElement getMobnofield() {
		return mobnofield;
	}
	public WebElement getCreateaccbtn() {
		return createaccbtn;
	}
	
	

	

}
