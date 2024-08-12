package bdd_final.steps;

import bdd_final.page.HomePage;
import bdd_final.utilities.SeleniumUtility;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainPageValidationTest extends SeleniumUtility {

  /*  @Given("Navigate to home TEK insurance app home page validate TEK Insurance App title")
    public void navigate_to_home_tek_insurance_app_home_page_validate_tek_insurance_app_title() {
     WebElement element = getDriver().findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/h2"));
   boolean display =  element.isDisplayed();


    } */

    @Given("Navigate to home TEK insurance app home page validate TEK Insurance App title")
    public void navigate_to_home_tek_insurance_app_home_page_validate_tek_insurance_app_title(){
        DisplayElement(HomePage.TEK_INSURANCE_APP_VALIDATION_LINK);
    }



    @Then("Validate primary account button exist")
        public void validate_primary_account_button_exist() {
        ElementIsEnabled(HomePage.PRIMARY_ACCOUNT_BUTTON_VALIDATION_LINK);


}


}
