package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Utilities.Driver;

import java.util.ArrayList;
import java.util.List;

public class Specials extends ParentClass {

    public Specials() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "a[title='Specials']")
    private WebElement Specials;

    @FindAll({
            @FindBy(css = "div.left-block>div>:last-child>:last-child")}
    )
    private List<WebElement> items;

    WebElement myElement;

    public void findElementAndClickFunction(String ElementName) {

        switch (ElementName) {
            case "Specials":
                myElement = Specials;
                break;
        }
        clickFunction(myElement);
    }

    public void findElementAndVerifyElementContainText(String WhichText) {
        waiting(3000);
        for (WebElement item : items) {
            ElementContainsText(item, WhichText);
        }

    }
}

