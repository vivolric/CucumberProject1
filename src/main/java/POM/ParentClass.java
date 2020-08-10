package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import Utilities.Driver;

import java.util.Random;

public class ParentClass {

//    In this class we need two things one is driver second one is a WebDriverWait

    WebDriver driver;
    WebDriverWait wait;

    public ParentClass(){

        driver = Driver.getDriver();
        wait = new WebDriverWait(driver,10);

    }

    //    Click on element method
    public void clickFunction(WebElement element){

        waitUntilClickable(element);
        element.click();

    }

    public void sendKeysFunction(WebElement element , String value){

        waitUntilVisible(element);
        element.clear();
        element.sendKeys(value);

    }

    public void waitUntilVisible(WebElement elementToWait){

        wait.until(ExpectedConditions.visibilityOf(elementToWait));

    }


    public void waitUntilClickable(WebElement elmentToWait){

        wait.until(ExpectedConditions.elementToBeClickable(elmentToWait));
    }

    public void ElementContainsText(WebElement element , String myText){

        waitUntilVisible(element);
        Assert.assertTrue(element.getText().contains(myText));
    }

    public void waiting(int howLong){
        try {
            Thread.sleep(howLong);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public int random (int max){

        Random random = new Random();

        return random.nextInt(max-1)+1;
    }

}

