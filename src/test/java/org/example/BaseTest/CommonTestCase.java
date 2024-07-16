package org.example.BaseTest;

import org.example.Driver.DriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class CommonTestCase {

    @BeforeMethod
    public void openBrowser(){
        DriverManager.init();
    }

    @AfterMethod
    public void closeBrowser(){
        DriverManager.unLoad();
    }
}
