package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage {
	
	WebDriver ldriver;
	
	public AddCustomerPage(WebDriver rdriver)
	{
		ldriver= rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(how=How.XPATH, using= "/html/body/div[3]/div/ul/li[2]/a")
	@CacheLookup
	WebElement lnkAddNewCustomer;
	
	@FindBy(how=How.NAME, using= "name")
	@CacheLookup
	WebElement txtCustomerName;
	
	@FindBy(how = How.NAME, using = "rad1")
	@CacheLookup
	WebElement rdGender;
	
	@FindBy(how=How.ID_OR_NAME, using= "dob")
	@CacheLookup
	WebElement txtdob;
	
	@FindBy(how=How.NAME, using= "addr")
	@CacheLookup
	WebElement txtaddress;
	
	@FindBy(how=How.NAME, using= "city")
	@CacheLookup
	WebElement txtCity;
	
	@FindBy(how=How.NAME, using= "state")
	@CacheLookup
	WebElement txtState;
	
	@FindBy(how=How.NAME, using= "pinno")
	@CacheLookup
	WebElement txtPin;
	
	@FindBy(how=How.NAME, using= "telephoneno")
	@CacheLookup
	WebElement txtTelephone;
	
	@FindBy(how=How.NAME, using="emailid")
	@CacheLookup
	WebElement txtEmail;
	
	@FindBy(how=How.NAME, using="password")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(how=How.NAME, using="sub")
	@CacheLookup
	WebElement btnSubmit;
	
	public void clickaddNewCustomer()
	{
		lnkAddNewCustomer.click();
	}
	
	public void custName(String cname)
	{
		txtCustomerName.sendKeys(cname);
	}
	
	public void custgender(String cgender) {
		rdGender.click();
	}
	
	public void custdob(String mm, String dd, String yy)
	{
		txtdob.sendKeys(mm);
		txtdob.sendKeys(dd);
		txtdob.sendKeys(yy);
	}
	
	
	public void custAddress(String caddress)
	{
		txtaddress.sendKeys(caddress);
	}
	
	public void custCity(String ccity)
	{
		txtCity.sendKeys(ccity);
	}
	
	public void custState(String cstate)
	{
		txtState.sendKeys(cstate);
	}
	
	public void custPIN(String cpin)
	{
		txtPin.sendKeys(String.valueOf(cpin));
	}
	
	public void custTelephoneNo(String ctelephoneno)
	{
		txtTelephone.sendKeys(ctelephoneno);
	}
	
	
	public void custEmailID(String cemail)
	{
		txtEmail.sendKeys(cemail);
	}
	
	public void custPassword(String cpassword)
	{
		txtPassword.sendKeys(cpassword);
	}
	
	public void custsubmit()
	{
		btnSubmit.click();
	}
}

















