package StepDefinition;

import cucumber.api.java.en.Then;
import POM.Specials;

public class SpecialsSteps {

   Specials specials = new Specials();

    @Then("^Navigaye to SpecialsPage$")
    public void navigate_to_SpecialsPage()  {
        specials.findElementAndClickFunction("Specials");

    }


    @Then("^Verify items has a discount$")
    public void verifyItemsHasADiscount() {
        specials.findElementAndVerifyElementContainText("-");
    }
}
