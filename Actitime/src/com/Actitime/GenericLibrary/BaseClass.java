package com.Actitime.GenericLibrary;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;

import com.Actitime.ObjectRepository.HomePage;
import com.Actitime.ObjectRepository.LoginPage;
@Listeners(ListnerImplementation.class)
public class BaseClass {
	public static WebDriver driver;
	public FileLibrary f=new FileLibrary();
	@BeforeSuite
	public void databaseConnection(){
		Reporter.log("Database is connected",true);
	}
  
	@BeforeTest
	public void launchBrowser(){
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	}
	
	@BeforeMethod
	public void login() throws InterruptedException, IOException {
		LoginPage lp=new LoginPage(driver);
		String URL = f.readPropertyFile("url");
	    driver.get(URL);
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String un = f.readPropertyFile("username");
        lp.getUn().sendKeys(un);
		String pwd = f.readPropertyFile("password");
		lp.getPwtxb().sendKeys(pwd);
		Thread.sleep(2000);
		lp.getLgbtn().click();
	}
	@AfterMethod
	public void logOut() {
		HomePage hp=new HomePage(driver);
		hp.getLogoutlink();
		Reporter.log("Logout successfull",true);
	}

	@AfterTest
	public void closeBrowser() {
		driver.close();
		Reporter.log("Browser is closed",true);
	}
	@AfterSuite
	public void databasedisconnect() {
	    Reporter.log("Database connection is closed",true);
	}
}
