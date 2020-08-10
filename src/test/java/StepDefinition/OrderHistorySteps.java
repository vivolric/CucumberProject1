package StepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import POM.DressPage;
import POM.ParentClass;

public class OrderHistorySteps {

    DressPage dressPage = new DressPage ();
    ParentClass parentClass = new ParentClass();

    @Given("^Navigate to dresses page$")
    public void navigateToDressesPage() {
        dressPage.findElementAndClickFunction("dressButton");

    }

    @Then("^Click on the any item from the page, add to cart, send a message and proceed to check out$")
    public void clickOnTheAnyItemFromThePageAddToCartAndProceedToCheckOut() {
        dressPage.clickFunction(dressPage.dressList.get(parentClass.random(dressPage.dressList.size())));
        dressPage.findElementAndClickFunction("addToCartButton");
        dressPage.findElementAndClickFunction("proceedToCheckOutButton");
        dressPage.findElementAndClickFunction("proceedToCheckOutButton2");
        dressPage.myMessage.sendKeys("My last order");
        dressPage.findElementAndClickFunction("proceedToCheckOutButton3");

    }

    @Then("^Click on the I agree, proceed to checkout button$")
    public void clickOnTheIAgreeProceedToCheckoutButton() {
        dressPage.findElementAndClickFunction("IagreeCheckBox");
        dressPage.findElementAndClickFunction("proceedToCheckOutButton3");

    }

    @Then("^Click on Pay by bank wire, and i confirm my order button$")
    public void clickOnPayByBankWireAndIConfirmMyOrderButton() {
        dressPage.findElementAndClickFunction("bankWireButton");
        dressPage.findElementAndClickFunction("confirmOrderButton");
    }

    @Then("^Back to orders and Click on Reference Number$")
    public void getTextOfReferenceAndBackToOrders() {
        dressPage.findElementAndClickFunction("backtoOrderButton");
        dressPage.findElementAndClickFunction("clickOnReference");
    }

    @Then("^Verify my last order$")
    public void verifyMyLastOrder() {
        dressPage.findElementAndVerifyElementContainText("myText","My last order");
    }
}
