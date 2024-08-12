package bdd_final.utilities;

import bdd_final.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.beans.Visibility;
import java.time.Duration;

public class SeleniumUtility extends Base {

    private WebDriverWait getWait(){
        return new WebDriverWait(getDriver(),Duration.ofSeconds(20)); //Implicate wait methode
    }


public void ClickOnElement(By locator){
    getWait().until(ExpectedConditions.elementToBeClickable(locator)).click(); //Click Method
}

public void ElementIsEnabled(By locator){
      boolean Enabled =  getWait().until(ExpectedConditions.visibilityOfElementLocated(locator)).isEnabled();
}

public void DisplayElement(By locator){
    boolean displayed = getWait().until(ExpectedConditions.visibilityOfElementLocated(locator)).isDisplayed();
}

public void SendText(By locator, String value ){
    WebElement sendText = getDriver().findElement(locator);// Sending Text to boxes in a webpage
    sendText.sendKeys(value);
}

}




