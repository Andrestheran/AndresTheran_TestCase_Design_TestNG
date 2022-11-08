package com.globant;


import org.testng.annotations.Test;

public class DeactivateAccountTestCaseESPN extends Loggers {

    @Test (dataProvider = "LoginInfo",priority = 3)
    public void deactivateAccount (String email, String Password){
        System.out.println();
        log.info("Account deactivation");
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

        System.out.println();
        log.info("Set up the mouse pointer on person icon in the top right corner");
        log.info("Set up the mouse pointer on ESPN profile button");
        log.info("Click on ESPN profile button");
        log.info("Set up the mouse pointer on 'Delete Account'  button ");
        log.info("Click on 'Delete Account' button");
        log.info("Set up the mouse pointer on 'Yes, Delete this account' button");
        log.info("Click on 'Yes, Delete this account' button");
        log.info("Set up the mouse pointer on  OK button");
        log.info("Click on 'OK' button");
        System.out.println();
        System.out.println();
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
        log.info("You should see the following message 'It looks like the account for " + email +
                " has been deactivated. Please contact ESPN Customer Care " +
                "if you believe this was in error or try another account.' is shown");
        System.out.println();

    }


}
