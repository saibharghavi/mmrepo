package com.checkbalance.runner;

import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = {"POMBDDMassMutual/resources/features/checkbalance.feature"},glue = "/com/checkbalance/steps",monochrome=true)

public class BalanceCheckRunner {

}
