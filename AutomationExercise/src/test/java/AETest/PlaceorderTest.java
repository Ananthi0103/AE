package AETest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.AutomationExercise.demo.Basetest.BaseClass;





public class PlaceorderTest extends BaseClass {
	
	@DataProvider
	public Object[][] getData() throws Throwable {

		int rowcount = eu.getRowCount("accountDetails");
		int colcount=eu.getcellCount("accountDetails", 1);
		System.out.println(colcount);

		Object[][] obj = new Object[rowcount][colcount];
		for (int i = 0; i < rowcount; i++) {
			for(int j=0; j<colcount;j++) {
			obj[i][j] = eu.getDataFromExcel("accountDetails", i + 1, j) ;
		
			}	
		}
		return obj;
	
	}

	@Test(dataProvider = "getData")
	public void orderplace(String name, String email, String password, String FN, String LN, String address,
			String state, String city, String zipcode, String mobnum, String cardname, String cardnum, String cvv,
			String expmon, String year) throws Throwable {
		System.out.println(name);
		wu.maximize(driver);
		wu.waiForPageLoad(driver);
		driver.findElement(By.xpath("//a[text()=' Signup / Login']")).click();
		driver.findElement(By.name("name")).sendKeys(name+ju.getRandomNum());
		driver.findElement(By.xpath("//input[@data-qa='signup-email']")).sendKeys(email+ju.getRandomNum()+"@gmail.com");
		driver.findElement(By.xpath("//button[text()='Signup']")).click();
		driver.findElement(By.xpath("//input[@value='Mrs']")).click();
		driver.findElement(By.id("password")).sendKeys(password+ju.getRandomNum());
		/*
		 * WebElement days = driver.findElement(By.id("days")); Select s = new
		 * Select(days); s.selectByValue("1"); WebElement month =
		 * driver.findElement(By.id("months")); Select s1=new Select(month);
		 * s1.selectByValue(""); WebElement year = driver.findElement(By.id("years"));
		 * Select s2=new Select(year); s2.selectByValue("");
		 */
		driver.findElement(By.id("newsletter")).click();
		driver.findElement(By.id("optin")).click();
		driver.findElement(By.id("first_name")).sendKeys(FN);
		driver.findElement(By.id("last_name")).sendKeys(LN);
		driver.findElement(By.id("address1")).sendKeys(address);
		/*
		 * WebElement country = driver.findElement(By.id("country")); Select s3=new
		 * Select(country); s3.selectByValue("");
		 */
		driver.findElement(By.id("state")).sendKeys(state);
		driver.findElement(By.id("city")).sendKeys(city);
		driver.findElement(By.id("zipcode")).sendKeys(zipcode);
		driver.findElement(By.id("mobile_number")).sendKeys(mobnum);
		driver.findElement(By.xpath("//button[text()='Create Account']")).click();
		/*
		 * WebElement adv = driver.findElement(By.xpath("//div[text()='Close']"));
		 * wu.waitForElementPresent(driver, adv); adv.click();
		 */
		driver.findElement(By.xpath("//a[text()=' Products']")).click();
		// driver.findElement(By.xpath("//div[@class='productinfo
		// text-center']")).click();
		// driver.findElement(By.xpath("//a[text()='Add to cart']")).click();
		driver.findElement(By.xpath("//p[text()='Blue Top']/parent::div[@class='productinfo text-center']")).click();
		driver.findElement(By.xpath(
				"//p[text()='Blue Top']/parent::div[@class='productinfo text-center']/child::a[text()='Add to cart']"))
				.click();
		driver.findElement(By.xpath("//u[text()='View Cart']")).click();
		driver.findElement(By.xpath("//a[text()='Proceed To Checkout']")).click();
		driver.findElement(By.xpath("//a[text()='Place Order']")).click();
		driver.findElement(By.name("name_on_card")).sendKeys(cardname);
		driver.findElement(By.name("card_number")).sendKeys(cardnum);
		driver.findElement(By.name("cvc")).sendKeys(cvv);
		driver.findElement(By.name("expiry_month")).sendKeys(expmon);
		driver.findElement(By.name("expiry_year")).sendKeys(year);
		driver.findElement(By.xpath("//button[text()='Pay and Confirm Order']")).click();

	}

}
