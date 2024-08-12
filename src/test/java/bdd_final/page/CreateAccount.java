package bdd_final.page;

import bdd_final.utilities.SeleniumUtility;
import org.openqa.selenium.By;

public class CreateAccount extends SeleniumUtility {
    public static final By CREATE_ACCOUNT_BUTTON_LINK = By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/a");
    public static final By VALIDATE_CREATE_PRIMARY_ACCOUNT_HOLDER_TEXT_ON_THE_TOP = By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/h2");
    public static final By ENTER_EMAIL_ADDRESS_LINK = By.id("email");
    public static final By ENTER_FIRST_NAME_LINK =By.id("firstName");
}
