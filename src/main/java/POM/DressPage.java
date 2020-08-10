package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Utilities.Driver;

import java.util.List;

public class DressPage extends ParentClass{
    public DressPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (css = "#block_top_menu > ul > li:nth-child(2) > a")
    public WebElement dressButton;

    @FindAll({
            @FindBy(css = "div.right-block > h5 > a")

    })
    public List<WebElement> dressList;

    @FindBy (css = "#add_to_cart>button")
    public WebElement addToCartButton;

    @FindBy (css = "div.button-container>a")
    public WebElement proceedToCheckOutButton;

    @FindBy (css = "p.cart_navigation>a")
    public WebElement proceedToCheckOutButton2;

    @FindBy (css = "p.cart_navigation>button")
    public WebElement proceedToCheckOutButton3;

    @FindBy (css = "#total_product")
    public WebElement totalProductFee;

    @FindBy (css = "#total_shipping")
    public WebElement totalShippingFee;

    @FindBy (css = "#total_price")
    public WebElement totalPrice;

    @FindBy (id = "uniform-cgv")
    public WebElement IagreeCheckBox;

    @FindBy (css = "a.bankwire")
    public  WebElement bankWireButton;

    @FindBy (css = "#cart_navigation>button")
    public  WebElement confirmOrderButton;

    @FindBy (css = ".box>br:nth-of-type(5)")
    public  WebElement referenceText;

    @FindBy (css = "a.button-exclusive")
    public  WebElement backtoOrderButton;

    @FindBy (css = "a.color-myaccount")
    public  WebElement referenceCode;

    @FindBy (css = "textarea.form-control")
    public  WebElement myMessage;

    @FindBy (css = "a.color-myaccount")
    private WebElement clickOnReference;

    @FindBy (css = "#block-order-detail>:nth-child(9)>table>:last-child>tr>:last-child")
    public WebElement myText ;

    WebElement myElement;
    public void findElementAndClickFunction(String ElementName) {

        switch (ElementName) {
            case "dressButton":
                myElement = dressButton;
                break;
            case "addToCartButton":
                myElement = addToCartButton;
                break;
            case "proceedToCheckOutButton":
                myElement = proceedToCheckOutButton;
                break;
            case "proceedToCheckOutButton2":
                myElement = proceedToCheckOutButton2;
                break;
            case "proceedToCheckOutButton3":
                myElement = proceedToCheckOutButton3;
                break;
            case "IagreeCheckBox":
                myElement = IagreeCheckBox;
                break;
            case "bankWireButton":
                myElement = bankWireButton;
                break;
            case "confirmOrderButton":
                myElement = confirmOrderButton;
                break;
            case "backtoOrderButton":
                myElement = backtoOrderButton;
                break;
            case "clickOnReference":
                myElement = clickOnReference;
                break;
        }
        clickFunction(myElement);
    }



    public void findElementAndVerifyElementContainText(String elementName , String WhichText){

        switch (elementName){
            case "myText":
                myElement = myText;
                break;
        }
        ElementContainsText(myElement,WhichText);

    }



}
