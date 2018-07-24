package com.cucumber.dblogging.ResultLogging.stepdefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;


import static org.testng.Assert.assertTrue;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.cucumber.dblogging.ResultLogging.stepdefs.DemoAmazonHomePage;
import com.cucumber.dblogging.ResultLogging.Utilities.ConfigurationReader;
import com.cucumber.dblogging.ResultLogging.Utilities.Driver;


public class TestLogStep {

	private WebDriver driver = Driver.getDriver();
	private DemoAmazonHomePage demoHomePage = new DemoAmazonHomePage();
	private String keyword;

	@Given("^I am on amazon home page$")
	public void i_am_on_amazon_home_page() {
		driver.get(ConfigurationReader.getProperty("url"));
		assertTrue(driver.getTitle().startsWith("Amazon.com"));

	}

	@Given("^I search for (.*)$")
	public void i_search_for(String keyword) {
		this.keyword = keyword;
		demoHomePage.searchBox.sendKeys(keyword + Keys.ENTER);
		System.out.println("Searching for " + keyword);
	}

	@Then("^Search result should be displayed$")
	public void search_result_should_be_displayed() {
		assertTrue(driver.getTitle().endsWith(keyword));
		driver.quit();

	}

}