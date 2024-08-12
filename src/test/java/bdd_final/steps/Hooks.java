package bdd_final.steps;

import bdd_final.utilities.SeleniumUtility;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends SeleniumUtility {


    @Before
    public void BeforeEachScenario(){
        SetupBrowser();
    }


/* @After
  public void AfterEachScenario(){
    QuitBrowser();
  } **/
}
