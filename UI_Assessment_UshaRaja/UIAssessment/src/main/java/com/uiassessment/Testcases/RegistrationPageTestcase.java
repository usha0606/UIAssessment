package com.uiassessment.Testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.uiassessment.PageElements.HomePage;
import com.uiassessment.PageElements.RegistrationPage;
import com.uiassessment.UIAssessment.TestData;

public class RegistrationPageTestcase extends TestData{
	
	HomePage homepage = new HomePage();
	RegistrationPage regPage = new RegistrationPage();
	
	@Test(priority = 0)
	public void RegisterOnWebsite() throws InterruptedException {
		homepage.ClickonLogin();
		homepage.ClickonContinueButton();
		regPage.enterFirstname(firstname);
		regPage.enterLastname(lastname);
		regPage.enterEmailID(mailid);
		regPage.enterCountryname(countryname);
		regPage.enterAddress(address);
		regPage.enterCity(cityname);
		regPage.enterZipCode(postalcode);
		regPage.enterStateName(index);
		regPage.enterLoginname(username);
		regPage.enterPassword(newpassword);
		regPage.enterpasswordConfirmation(newpassword);
		regPage.clickOnSubscription(index);
		regPage.clickOnAgreetoTC();
		regPage.clickonRegistrationContinue();
		String actualTitle = homepage.getScreenTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	@Test(priority =1)
	public void validateLandingScreen() {
		String actualMessage = homepage.getScreenMessage();
		Assert.assertEquals(actualMessage, expectedMessgae );
	}
	@Test(priority = 2)
	public void VerifyUserAddedtheItemtoCart() {
		String actualShoppingCartPageTitle = homepage.clickWomenFragranceOptionandAddItem();
		Assert.assertEquals(actualShoppingCartPageTitle,expectedshoppingCartTitle);
	}
	@Test(priority = 3)
	public void verifyUserincheckoutpage() {
		String actualCheckoutPageTile = homepage.proceedTOCheckout();
		Assert.assertEquals(actualCheckoutPageTile, expectedCheckoutPageTile );		
	}
	
	@Test(priority = 4)
	public void verifyItemsintoCart() {
		String actualItemintoCart = homepage.itemAddedIntoCart();
		Assert.assertEquals(actualItemintoCart, expectedItemintoCart );
	}

}
