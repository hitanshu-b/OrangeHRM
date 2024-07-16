package org.example.Base;

import org.example.Utils.PropertyReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.example.Driver.DriverManager.getDriver;


public class CommonFunctions {

    public CommonFunctions(){}

    public void openURL(){
        getDriver().get(PropertyReader.readKey("url"));
    }

    public void clickElement(By by){
        getDriver().findElement(by).click();
    }

    public void clickElement(WebElement element1){
        element1.click();
    }

    public void enterInput(By by, String key){
        getDriver().findElement(by).sendKeys(key);
    }

    public void enterInput(WebElement element, String key){
        element.sendKeys(key);
    }

    public String getElement(){
        return getDriver().getTitle();
    }
}
