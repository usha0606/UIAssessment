package com.uiassessment.PageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.uiassessment.UIAssessment.TestBase;
import com.uiassessment.UIAssessment.TestData;

public class RegistrationPage extends TestBase {
	
	By firstName = By.id("AccountFrm_firstname");
	By lastName = By.id("AccountFrm_lastname");
	By email = By.id("AccountFrm_email");
	By Address1 = By.id("AccountFrm_address_1");
	By city = By.id("AccountFrm_city");
	By state = By.id("AccountFrm_zone_id");
	By zipcode = By.id("AccountFrm_postcode");
	By country = By.id("AccountFrm_country_id");
	By loginName = By.id("AccountFrm_loginname");
	By password = By.id("AccountFrm_password");
	By passwordConfirmation = By.id("AccountFrm_confirm");
	By subscribe = By.name("newsletter");
	By agreetoTC  = By.id("AccountFrm_agree");
	By registrationContinue = By.xpath("//button[@title=\"Continue\"]");

	TestData testdata = new TestData();
	
	public void enterFirstname(String firstname) {
		driver.findElement(firstName).sendKeys(firstname);
	}
	
	public void enterLastname(String lastname) {
		driver.findElement(lastName).sendKeys(lastname);
	}
	public void enterEmailID(String mailid) {
		driver.findElement(email).sendKeys(mailid);
	}
	public void enterAddress(String address) {
		driver.findElement(Address1).sendKeys(address);
	}
	public void enterCity(String cityname) {
		driver.findElement(city).sendKeys(cityname);
	}
	public void enterStateName(int index) {
		WebElement stauevalues = driver.findElement(state);
		Select value = new Select(stauevalues);
		try {		
		value.selectByIndex(index);	
		}
		catch(StaleElementReferenceException e) {
			value.selectByVisibleText("Alaska");
		}
	}
	public void enterZipCode(String postalcode) {
		driver.findElement(zipcode).sendKeys(postalcode);
	}
	public void enterCountryname(String countryname) {
		WebElement countryvalues = driver.findElement(country);
		Select value = new Select(countryvalues);
		value.selectByVisibleText(countryname);
	}
	public void enterLoginname(String username) {
		driver.findElement(loginName).sendKeys(username);
	}
	public void enterPassword(String newpassword) {
		driver.findElement(password).sendKeys(newpassword);
	}
	public void enterpasswordConfirmation(String newpassword) {
		driver.findElement(passwordConfirmation).sendKeys(newpassword);
	}
	public void clickOnSubscription(int index) {
		driver.findElements(subscribe).get(index).click();
	}
	public void clickOnAgreetoTC() {
		driver.findElement(agreetoTC).click();
	}
	public void clickonRegistrationContinue() {
		driver.findElement(registrationContinue).click();
	}	

}
