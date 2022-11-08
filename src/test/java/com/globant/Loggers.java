package com.globant;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.*;


public class Loggers {
    protected static Logger log = LoggerFactory.getLogger(Loggers.class);

    @DataProvider (name = "LoginInfo")
    public Object [][] getLoginInfo() {
        return new Object[][] {{"email0@email.com0", "password"}, {"email01@email.com1", "password1"}, {"email2@email.com", "password2"}};
    }

    @DataProvider (name = "InvalidInfo")
    public Object [][] getInvalidInfo() {
        return new Object[][] {{"email3@email.com", "password3"}, {"email4@email.com", "password4"}, {"email5@email.com", "password5"}};
    }

    @BeforeSuite
    public void registerAccount() {
        log.info("Open Browser");
        log.info("Go to https://www.espnqa.com/?_adbock=true&src=com");
        log.info("Put mouse cursor over the person icon in the navigation bar");
        log.info("If an account has not been created, select 'Log In' option");
        log.info("If needed, select 'Sign Up' option");
        log.info("If needed, create an account");
        log.info("Close Browser");
        System.out.println();
    }

    @BeforeTest
    public void openBrowser() {
        log.info("Open Browser");
        System.out.println();
    }

    @BeforeMethod
    public void cleanCookies() {
        log.info("Go to https://www.espnqa.com/?_adbock=true&src=com");
        log.info("Select 'View site information' button");
        log.info("Click on 'Cookies' option");
        log.info("Remove all cookies");
        System.out.println();
    }

    @AfterTest
    public void closeBrowser() {
        log.info("Close Browser");
        System.out.println();
    }
}

