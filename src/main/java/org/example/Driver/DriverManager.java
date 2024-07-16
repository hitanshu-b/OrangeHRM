package org.example.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.Objects;

public class DriverManager {

    public static final ThreadLocal<WebDriver> dr = new ThreadLocal<>();

    public static void setDriver(WebDriver driverRef){
        dr.set(driverRef);
    }

    public static WebDriver getDriver(){
        return dr.get();
    }

    public static void unLoad(){
        dr.remove();
    }

    @BeforeMethod
    public static void init(){
        if(Objects.isNull(DriverManager.getDriver())){
            WebDriver driver = new EdgeDriver();
            setDriver(driver);
        }
    }

    @AfterMethod
    public static void down(){
        if(Objects.nonNull(DriverManager.getDriver())){
            getDriver().quit();
            unLoad();
        }
    }

}
