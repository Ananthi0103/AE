package com.AutomationExercise.demo.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()=' Home']")
	private WebElement homepagemsg;
	@FindBy(xpath="//a[text()=' Signup / Login']")
	private WebElement Signuplink;
	@FindBy(xpath="//h2[text()='New User Signup!']")
	private WebElement newusersignupmsg;
	@FindBy(xpath="//b[text()='Enter Account Information']")
	private WebElement enteraccifomsg;
	@FindBy(xpath="//a[text()='Continue']")
	private WebElement continuebtn;
	@FindBy(xpath="//a[text()=' Logged in as ']")
	private WebElement loggedinmsg;
	@FindBy(xpath="//b[text()='Account Created!']")
	private WebElement acccreatedmsg;
	@FindBy(xpath="//a[text()=' Delete Account']")
	private WebElement deleteaccbtn;
	@FindBy(xpath="//b[text()='Account Deleted!']")
	private WebElement accdeletedmsg;
	public WebElement getHomepagemsg() {
		return homepagemsg;
	}
	public WebElement getSignuplink() {
		return Signuplink;
	}
	public WebElement getNewusersignupmsg() {
		return newusersignupmsg;
	}
	public WebElement getEnteraccifomsg() {
		return enteraccifomsg;
	}
	public WebElement getContinuebtn() {
		return continuebtn;
	}
	public WebElement getLoggedinmsg() {
		return loggedinmsg;
	}
	public WebElement getAcccreatedmsg() {
		return acccreatedmsg;
	}
	public WebElement getDeleteaccbtn() {
		return deleteaccbtn;
	}
	public WebElement getAccdeletedmsg() {
		return accdeletedmsg;
	}
	

	
	
	

}
