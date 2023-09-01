package com.uiassessment.PageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.uiassessment.UIAssessment.TestData;

public class HomePage extends TestData {
	
	By loginOrRegister = By.xpath("//a[text()='Login or register']");
	By continueButton = By.xpath("//button[@title='Continue']");	
	By welcomeMessage = By.xpath("//a/div[@class=\"menu_text\"]");
	By fragrance = By.xpath("//section[@id='categorymenu']/nav/ul/li[5]/a");
	By womenfragrance = By.xpath("//section[@id='categorymenu']/nav/ul/li[5]/div/ul[1]/li[2]");
	By fragranceItem1 = By.xpath("//a[contains(@title,'Forbidden euphoria Eau de Parfum Spray ')]");
	By addToCart = By.xpath("//ul[@class=\"productpagecart\"]/li/a");
	By checkout = By.xpath("//div[@class='pull-right mb20']/a[@title='Checkout']");
	By itemInCart = By.xpath("//a[@class=\"checkout_heading\"]");
	
	public void ClickonLogin() {
		driver.findElement(loginOrRegister).click();
	}
	
	public void ClickonContinueButton() {
		driver.findElement(continueButton).click();
	}
	
	public String getScreenMessage() {
		String message = driver.findElement(welcomeMessage).getText();
		return message;
	}
	
	public String getScreenTitle() {
		String title = driver.getTitle();
		return title;
	}
	
	public String clickWomenFragranceOptionandAddItem() {
		Actions act = new Actions(driver);
		WebElement element = driver.findElement(fragrance);
		WebElement womenFrag = driver.findElement(womenfragrance);
		act.moveToElement(element).build().perform();
		act.click(womenFrag);
		driver.findElement(womenfragrance).click();
		driver.findElement(fragranceItem1).click();
		driver.findElement(addToCart).click();
		String shipCartPageTitle = driver.getTitle();
		return shipCartPageTitle;
	}
	
	public String proceedTOCheckout() {
		driver.findElement(checkout).click();;
		String cheoutPageTitle = driver.getTitle();
		return cheoutPageTitle;
	}
	
	public String itemAddedIntoCart() {
		String itemname = driver.findElement(itemInCart).getText();
		return itemname;
	}
	
}
