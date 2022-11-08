package com.globant;


import org.testng.annotations.Test;

public class LoginTestCaseESPN extends Loggers {




    @Test (dataProvider = "LoginInfo", priority = 1)
    public void SuccessfulLogIn (String email, String Password){
        log.info("Login Process");
        log.info("Set up the mouse pointer on person icon in the top right corner");
        log.info("Set up the mouse pointer on log in option");
        log.info("Click to login option");
        log.info("Set up the mouse pointer on Username or Email Address field");
        log.info("Click on Username or Email Address field");
        log.info("Type" + email + " on Username/Email Address field");
        log.info("Set up the mouse pointer on Password field");
        log.info("Click on Password field");
        log.info("Type" + Password + " password field");
        log.info("Set up the mouse pointer on Log in button");
        log.info("Click on Log in button");
        log.info("Double check the granted access");
        System.out.println();
    }

    @Test (dataProvider = "InvalidInfo", priority = 1)
    public void UnsuccessfulLogIn (String email, String Password){
        log.info("Login Process");
        log.info("Set up the mouse pointer on person icon in the top right corner");
        log.info("Set up the mouse pointer on log in option");
        log.info("Click to login option");
        log.info("Set up the mouse pointer on Username or Email Address field");
        log.info("Click on Username or Email Address field");
        log.info("Type" + email + " on Username/Email Address field");
        log.info("Set up the mouse pointer on Password field");
        log.info("Click on Password field");
        log.info("Type" + Password + " password field");
        log.info("Set up the mouse pointer on Log in button");
        log.info("Click on Log in button");
        log.info("Check if the system shows you the following message" +
                " 'The credentials you entered are incorrect. " +
                "Reminder: Passwords are case sensitive.'");
        System.out.println();
    }

}

