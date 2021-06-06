package com.dashboard;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
   public static WebDriver driver;
   public static Properties prop;
   
   public void properBase() {
	   try {
		   prop = new Properties();
		   FileInputStream fis = new FileInputStream("C:\\Users\\khmathangi\\Desktop\\MassMutual\\POMBDDMassMutual\\src\\main\\java\\com\\BalanceCheck\\Config\\config.properties");
	       prop.load(fis);
	       } catch (IOException e) {
		   e.getMessage();
	   }
   }
   
   public static void initialization() {

		   System.setProperty("webdriver.chrome.driver", "C:\\Users\\khmathangi\\Desktop\\MassMutual\\POMBDDMassMutual\\drivers");
		   driver = new ChromeDriver();

		   driver.manage().window().maximize();
		   driver.manage().deleteAllCookies();
		   driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		   driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
           
		   driver.get(prop.getProperty("url"));
}
}
