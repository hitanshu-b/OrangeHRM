package org.example.Pages;

import org.example.Base.CommonFunctions;
import org.example.Utils.PropertyReader;
import org.openqa.selenium.By;

public class LoginPage extends CommonFunctions {

    public LoginPage(){

    }

    // Page Locators for Login Page
    By username = By.name("username");
    By password = By.xpath("//input[@name='password']");
    By loginButton = By.xpath("//button[@type='submit']");

    // Page Locators for Admin Page
    By adminClick = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/aside[1]/nav[1]/div[2]/ul[1]/li[1]/a[1]/span[1]");


    // Page Actions
    public String loginAction(){
        enterInput(username,PropertyReader.readKey("username"));
        enterInput(password,PropertyReader.readKey("password"));
        clickElement(loginButton);
        return getElement();
    }
}
