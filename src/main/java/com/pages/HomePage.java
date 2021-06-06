package com.pages;

import java.io.IOException;

import org.eclipse.jetty.util.log.Log;
import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.dashboard.TestBase;
import net.serenitybdd.core.annotations.findby.FindBy;

public class HomePage extends TestBase{
	
	@SuppressWarnings("null")
	private static double d1 = (Double) null;
	
	@SuppressWarnings("null")
	private static double d2 = (Double) null;
	
	@SuppressWarnings("null")
	private static double d3 = (Double) null;
	
	@SuppressWarnings("null")
	private static double d4 = (Double) null;
	
	@SuppressWarnings("null")
	private static double d5 = (Double) null;
	
	
	@FindBy(xpath = "//input[@id='txt_val_1']")
	static WebElement val1;
	
	@FindBy(xpath = "//input[@id='txt_val_2']")
	static WebElement val2;
	
	@FindBy(xpath = "//input[@id='txt_val_3']")
	static WebElement val3;
	
	@FindBy(xpath = "//input[@id='txt_val_4']")
	static WebElement val4;
	
	@FindBy(xpath = "//input[@id='txt_val_5']")
	static WebElement val5;
	
	@FindBy(xpath = "//input[@id='txt_ttl_val']")
	static float totalBalance;

    public HomePage() {
	PageFactory.initElements(driver, this);
    }
    
    public static void enterValues(String value1, String value2, String value3, String value4, String value5 ) {	
        
    	val1.sendKeys(value1);
    	val2.sendKeys(value2);
    	val3.sendKeys(value3);
    	val4.sendKeys(value4);
    	val5.sendKeys(value5); 
                
    	d1 = Double.parseDouble(value1);
    	d2 = Double.parseDouble(value2);
    	d3 = Double.parseDouble(value3);
    	d4 = Double.parseDouble(value4);
    	d5 = Double.parseDouble(value5);
    }
           
	public static void verifyBalance() {
		
    	double balance = d1 + d2 + d3 + d4 + d5;
    	
    	Assert.assertEquals(balance, totalBalance, 0);
    	
    }
	 
    public static void verifyValues() {
    	String firstValue = val1.getText();
    	String secondValue = val2.getText();
    	String thirdValue = val3.getText();
    	String fourthValue = val4.getText();
    	String fifthValue = val5.getText();
    	
	    	Assert.assertNotNull(firstValue);
	    	Assert.assertNotNull(secondValue);
	    	Assert.assertNotNull(thirdValue);
	    	Assert.assertNotNull(fourthValue);
	    	Assert.assertNotNull(fifthValue);
    }



}
