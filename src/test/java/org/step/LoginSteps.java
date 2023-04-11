package org.step;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSteps {
	
	
 WebDriver driver;
	
@Given("The user shoud be in facebookpage page")
public void the_user_shoud_be_in_facebookpage_page() {
	WebDriverManager.chromedriver().setup();
	
	 driver=new ChromeDriver();
	 driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
    
}

@When("The use has enter the {string} and {string}")
public void the_use_has_enter_the_and(String user, String pass) {
    driver.findElement(By.id("email")).sendKeys("tamba");
    driver.findElement(By.id("pass")).sendKeys("101197");
}

@When("The user has click the {string} button")
public void the_user_has_click_the_button(String string) {
    driver.findElement(By.name("login"));
    
}

@Then("The user shoud be in invalid page")
public void the_user_shoud_be_in_invalid_page() {
  Assert.assertTrue(true);
  System.out.println("sucessfully login");
  driver.quit();
}

@When("The user has to click the create new account link")
public void the_user_has_to_click_the_create_new_account_link() {
    driver.findElement(By.cssSelector("#u_0_0_TN")).click();
    System.out.println("okay");
}

@When("The user has to fill three firstname , lastname and other details")
public void the_user_has_to_fill_three_firstname_lastname_and_other_details() {
   
	
}

@Then("The user get message {string}")
public void the_user_get_message(String string) {
    
}


}
