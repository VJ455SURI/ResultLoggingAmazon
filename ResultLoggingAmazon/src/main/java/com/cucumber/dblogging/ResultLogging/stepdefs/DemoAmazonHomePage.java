package com.cucumber.dblogging.ResultLogging.stepdefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.dblogging.ResultLogging.Utilities.Driver;

public class DemoAmazonHomePage {

	    private WebDriver driver;

	    public DemoAmazonHomePage() {
	    	this.driver = Driver.getDriver();
	    	PageFactory.initElements(driver, this);
	    }
	    
	    @FindBy(id="twotabsearchtextbox")
	    public WebElement searchBox;
	}

