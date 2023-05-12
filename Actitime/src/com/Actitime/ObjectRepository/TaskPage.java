package com.Actitime.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskPage {
@FindBy(xpath="//div[.='Add New']")
private WebElement addnewbtn;
@FindBy(xpath="//div[.='+ New Customer']")
private WebElement newcustbtn;
@FindBy(xpath="//input[@class='inputFieldWithPlaceholder newNameField inputNameField']")
private WebElement custnametxb;
@FindBy(xpath="(//textarea[@class='textarea'])[9]")
private WebElement desctxb;
@FindBy(xpath="(//div[@class='dropdownButton'])[15]")
private WebElement selcustlb;
@FindBy(xpath="(//div[.='CreateCustomer'])[2]")
private WebElement creatcustlbbtn;
@FindBy(xpath="//div[.='Create Customer']")
private WebElement creatcustbtn;
@FindBy(xpath="(//div[.='Cancel'])[27]")
private WebElement cancelbtn;

public TaskPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public WebElement getAddnewbtn() {
	return addnewbtn;
}
public WebElement getNewcustbtn() {
	return newcustbtn;
}
public WebElement getCustnametxb() {
	return custnametxb;
}
public WebElement getDesctxb() {
	return desctxb;
}
public WebElement getSelcustlb() {
	return selcustlb;
}
public WebElement getCreatcustlbbtn() {
	return creatcustlbbtn;
}
public WebElement getCreatcustbtn() {
	return creatcustbtn;
}
public WebElement getCancelbtn() {
	return cancelbtn;
}
}

