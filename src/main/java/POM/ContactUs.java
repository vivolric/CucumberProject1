package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Utilities.Driver;

public class ContactUs extends ParentClass {

    public ContactUs() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "a[title='Contact Us']")
    private WebElement contactUsButton;

    @FindBy (xpath = "//select[@id='id_contact']//option[2]")
    private WebElement Option2;

    @FindBy (xpath = "//select[@id='id_contact']//option[3]")
    private WebElement Option3;

    @FindBy (css = "#message")
    private WebElement Message;

    @FindBy (css = "#submitMessage")
    private WebElement SubmitMessage;

    @FindBy (css = "p[class='alert alert-success']")
    private WebElement SuccessMessage;



    WebElement myElement;

    public void findElementAndClickFunction(String ElementName) {

        switch (ElementName) {
            case "contactUsButton":
                myElement = contactUsButton;
                break;
            case "Option2":
                myElement = Option2;
                break;
            case "Option3":
                myElement = Option3;
                break;
            case "SubmitMessage":
                myElement = SubmitMessage;
                break;
        }

            clickFunction(myElement);
        }

    public void findElementAndSenKeys(String ElementName, String value) {

        switch (ElementName) {
            case "Message":
                myElement = Message;
                break;
        }

        sendKeysFunction(myElement, value);
    }

    public void findElementAndVerifyElementContainText(String elementName , String WhichText){

        switch (elementName){
            case "SuccessMessage":
                myElement = SuccessMessage;
                break;
        }
        ElementContainsText(myElement,WhichText);

    }

}
