package bdd_final.base;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Base {

private static WebDriver driver;

    public void SetupBrowser(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://dev.insurance.tekschool-students.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }


public void QuitBrowser(){
        if(driver != null){
            driver.quit();
        }
}

    public WebDriver getDriver(){
        return driver;
    }
}
