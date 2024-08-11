package bdd_final.page;

import bdd_final.utilities.SeleniumUtility;
import org.openqa.selenium.By;

public class HomePage extends SeleniumUtility {
    public static final By TEK_INSURANCE_APP_VALIDATION_LINK = By.xpath("//*[@id=\"root\"]/div/div[1]/div/h2");
    public static final By PRIMARY_ACCOUNT_BUTTON_VALIDATION_LINK = By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/a");
}
