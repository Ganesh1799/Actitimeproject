package com.Actitime.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
@FindBy(id="username")
private WebElement un;
@FindBy(name="pwd")
private WebElement pwtxb;
@FindBy(xpath="//div[.='Login ']")
private WebElement lgbtn;

public LoginPage(WebDriver driver) {
	PageFactory.initElements(driver,this);
}
public WebElement getUn() {
	return un;
}
public WebElement getPwtxb() {
	return pwtxb;
}
public WebElement getLgbtn() {
	return lgbtn;
}
}
