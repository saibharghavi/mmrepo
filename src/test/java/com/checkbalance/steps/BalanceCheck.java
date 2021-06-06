package com.checkbalance.steps;

import com.dashboard.TestBase;
import com.pages.HomePage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class BalanceCheck {

	
       @Given("^Login to the exercise application with valid user$")
       public void Login_to_the_exercise_application() throws Exception {
    	   TestBase.initialization();
       }
       
       
       @And("^I enter values \"([^\"]*)\\\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" as the data$")
       public void Enter_Values_in_to_the_fields(String value1, String value2, String value3, String value4, String value5) throws Exception {
    	  HomePage.enterValues(value1, value2, value3, value4, value5);
    	  
       }

       @And("^I validate total balance matches sum of values$")
       public void Total_balance_matches_sumofValues() throws Exception{
    	   HomePage.verifyBalance();
       }

       @And("^I validate all the values are not null$")
       public void Validate_all_the_values_are_not_null() throws Exception{
    	   HomePage.verifyValues();
       }





}
