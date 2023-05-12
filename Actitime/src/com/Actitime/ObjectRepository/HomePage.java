package com.Actitime.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(xpath="//div[.='Tasks']")
	private WebElement task;
	
	@FindBy(xpath="//div[.='Reports']")
	private WebElement reporter;
	
	@FindBy(xpath="//div[.='Users']")
	private WebElement users;
	
	@FindBy(xpath="//div[.='Time-Track']")
	private WebElement Timetrack;
	
	@FindBy(linkText ="Logout")
	private WebElement logoutlink;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getTask() {
		return task;
	}

	public WebElement getReporter() {
		return reporter;
	}

	public WebElement getUsers() {
		return users;
	}

	public WebElement getTimetrack() {
		return Timetrack;
	}

	public WebElement getLogoutlink() {
		return logoutlink;
	}
	
}
