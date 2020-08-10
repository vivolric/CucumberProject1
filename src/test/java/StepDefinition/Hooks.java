package StepDefinition;

import cucumber.api.java.After;
import Utilities.Driver;

public class Hooks {

    @After
    public void after(){

        Driver.QuitDriver();

    }

}