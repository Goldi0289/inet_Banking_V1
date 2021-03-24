package com.inetbanking.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.inetbanking.pageObjects.AddCustomerPage;
import com.inetbanking.pageObjects.LoginPage;

public class TC_AddCustomerTest_003 extends BaseClass {
	
	@Test
	public void addNewCustomer() throws InterruptedException, IOException
	{
		LoginPage lp= new LoginPage(driver);
		lp.setUserName(username);
		logger.info("username is provided");
		lp.setPassword(password);
		logger.info("password is provided");
		lp.clickSubmit();
		
		Thread.sleep(3000);
		
		AddCustomerPage addcust= new AddCustomerPage(driver);	
		logger.info("providing customer details...");
		
		addcust.clickaddNewCustomer();
		addcust.custName("goldi");
		addcust.custgender("female");
		Thread.sleep(2000);
		addcust.custdob("15", "06", "1989");
		Thread.sleep(3000);
		addcust.custAddress("Panchsheel Wellingtoon");
		addcust.custCity("Ghaziabad");
		addcust.custState("UP");
		addcust.custPIN("201009");
		addcust.custTelephoneNo("8588803299");
		String email=randomString()+"@gmail.com";
		addcust.custEmailID(email);
		addcust.custPassword("12345");
		addcust.custsubmit();
		Thread.sleep(3000);
		
		logger.info("validation started....");
		
		boolean res=driver.getPageSource().contains("Customer Registered Successfully!!!");
		
		if(res== true)
		{
			Assert.assertTrue(true);
			logger.info("testcase is passed");
		}
		else
		{	
			logger.info("testcase is failed");
			captureScreen(driver, "addNewCustomer");
			Assert.assertTrue(false);
		}
	}
	
	
}







