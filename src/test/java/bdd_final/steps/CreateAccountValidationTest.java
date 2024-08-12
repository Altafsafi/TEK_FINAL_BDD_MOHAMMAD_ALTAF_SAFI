package bdd_final.steps;

import bdd_final.page.CreateAccount;
import bdd_final.page.HomePage;
import bdd_final.utilities.SeleniumUtility;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CreateAccountValidationTest extends SeleniumUtility {

    @Given("Navigate to home TEK insurance app")
    public void Navigate_To_Home_TEK_Insurance_APP(){
        DisplayElement(HomePage.TEK_INSURANCE_APP_VALIDATION_LINK);
    }

    @Then("Click on create account button validate Create Primary Account Holder text")
    public void Click_On_Create_Account_Button(){
        ClickOnElement(CreateAccount.CREATE_ACCOUNT_BUTTON_LINK);
        DisplayElement(CreateAccount.VALIDATE_CREATE_PRIMARY_ACCOUNT_HOLDER_TEXT_ON_THE_TOP);
    }
    @Then("fill the account info")
    public void Fill_The_Account_Info(){
        SendText(CreateAccount.ENTER_EMAIL_ADDRESS_LINK , "AltafSafi@gmail.com" );
        SendText(CreateAccount.ENTER_FIRST_NAME_LINK, "Altaf Safi");
    }


}
