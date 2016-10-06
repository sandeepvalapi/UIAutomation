// package outline;
//
// import java.util.concurrent.TimeUnit;
//
// import org.openqa.selenium.By;
// import org.openqa.selenium.WebDriver;
// import org.openqa.selenium.firefox.FirefoxDriver;
//
// import cucumber.annotation.en.Given;
// import cucumber.annotation.en.Then;
// import cucumber.annotation.en.When;
// import cucumber.runtime.PendingException;
//
// public class stepdefinition {
//
// private static WebDriver driver = null;
//
// @Given("^I am a user$")
// public void I_am_a_user() {
// driver = new FirefoxDriver();
//
// //Put a Implicit wait, this means that any search for elements on the page
// could take the time the implicit wait is set for before throwing exception
//
// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
// //Launch the Online Store Website
//
// driver.get("http://www.google.com");
// }
//
// @When("^I enter invalid credential$")
// public void I_enter_invalid_credential() {
// driver.findElement(By.xpath(".//*[@id='account']/a")).click();
//
// // Find the element that's ID attribute is 'log' (Username)
//
// // Enter Username on the element found by above desc.
//
// driver.findElement(By.id("log")).sendKeys("testuser_1");
//
// // Find the element that's ID attribute is 'pwd' (Password)
//
// // Enter Password on the element found by the above desc.
//
// driver.findElement(By.id("pwd")).sendKeys("Test@123");
//
// // Now submit the form. WebDriver will find the form for us from the element
//
// driver.findElement(By.id("login")).click();
// }
//
// @Then("^Error message is shown$")
// public void Error_message_is_shown() {
// driver.findElement(By.className("response")).getText().equals("ERROR: Invalid
// login credentials.");
//
// // Close the driver
//
// driver.quit();
//
// }
// }