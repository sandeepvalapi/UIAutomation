package com.steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import junit.framework.Assert;

public class OutlineStepDefination {

	private static WebDriver driver = null;
	String webContent = null;

	@Given("^I am a user$")
	public void I_am_a_user() {
		System.setProperty("webdriver.chrome.driver", "C:/SandeepFiles/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.store.demoqa.com");
	}

	@When("^I enter invalid credential$")
	public void I_enter_invalid_credential() {
		driver.findElement(By.xpath(".//*[@id='account']/a")).click();
		driver.findElement(By.id("log")).sendKeys("testuser_1");
		driver.findElement(By.id("pwd")).sendKeys("Test@123");
		driver.findElement(By.id("login")).click();
	}

	@Then("^Error message is shown$")
	public void Error_message_is_shown() {
		driver.findElement(By.className("response")).getText().equals("ERROR: Invalid login credentials.");

	}

	@Given("^I have navigated to company site$")
	public void I_have_navigated_to_company_site() {
		System.setProperty("webdriver.chrome.driver", "C:/SandeepFiles/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.whitebay.in");
	}

	@When("^I can see the Home page$")
	public void I_can_see_the_Home_page() {
		webContent = driver.findElement(By.xpath("//*[@id='home']/div/div[2]/h1")).getText();
	}

	@Then("^I should see welcome message$")
	public void I_should_see_welcome_message() {
		webContent.equals("We leverage technology to accomplish great vision.");
		Assert.assertEquals("We leverage technology to accomplish great vision.", webContent);
	}

	public static void main(String[] args) {
		// Create a new instance of the Firefox driver
		// System.setProperty("webdriver.ie.driver",
		// "C://IE//IEDriverServer.exe");
		driver = new FirefoxDriver();

		// Put a Implicit wait, this means that any search for elements on the
		// page could take the time the implicit wait is set for before throwing
		// exception

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.store.demoqa.com");
		driver.findElement(By.xpath(".//*[@id='account']/a")).click();
		driver.findElement(By.id("log")).sendKeys("testuser_1");
		driver.findElement(By.id("pwd")).sendKeys("Test@123");
		driver.findElement(By.id("login")).click();
		System.out.println("Login Successfully");
		driver.findElement(By.xpath(".//*[@id='account_logout']/a")).click();
		System.out.println("LogOut Successfully");
		driver.quit();
	}
}