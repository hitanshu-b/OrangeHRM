package org.example.TestScripts;

import io.qameta.allure.Description;
import org.example.BaseTest.CommonTestCase;
import org.example.Pages.LoginPage;
import org.testng.annotations.Test;

public class TC001 extends CommonTestCase {

    @Test
    @Description("Valid Login")
    public void validLogin(){
        LoginPage loginPage = new LoginPage();
        loginPage.openURL();
        loginPage.loginAction();
    }
}
