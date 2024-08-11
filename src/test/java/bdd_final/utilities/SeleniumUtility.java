package bdd_final.utilities;

import bdd_final.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SeleniumUtility extends Base {

    private WebDriverWait getWait(){
        return new WebDriverWait(getDriver(),Duration.ofSeconds(20)); //Implicate wait methode
    }


public void ClickOnElement(By locator){
    getWait().until(ExpectedConditions.elementToBeClickable(locator)).click(); //Click Method
}

public void DisplayElement(By locator){
    boolean displayed = getWait().until(ExpectedConditions.visibilityOfElementLocated(locator)).isDisplayed();
}




}
