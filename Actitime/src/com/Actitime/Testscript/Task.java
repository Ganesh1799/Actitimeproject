package com.Actitime.Testscript;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.Actitime.GenericLibrary.BaseClass;
import com.Actitime.ObjectRepository.HomePage;
import com.Actitime.ObjectRepository.TaskPage;

public class Task extends BaseClass {
@Test
private void creatCustomer() throws IOException, InterruptedException {
	HomePage h=new HomePage(driver);
	h.getTask().click();
	TaskPage tp=new TaskPage(driver);
	tp.getAddnewbtn().click();
	Thread.sleep(2000);
	tp.getNewcustbtn().click();
	String cname =f.readExcelFile("Sheet1", 1, 1);
	tp.getCustnametxb().sendKeys(cname);
	Thread.sleep(2000);
	String cdesc=f.readExcelFile("Sheet1", 1, 2);
	tp.getDesctxb().sendKeys(cdesc);
	Thread.sleep(2000);
    tp.getCreatcustbtn().click();
    String expectedresult = cname;
    String actualresult = driver.findElement(By.xpath("(//div[.='"+cname+"'])[2]")).getText();
    SoftAssert as=new SoftAssert();
    as.assertEquals(expectedresult, actualresult);
    Thread.sleep(2000);
}
}
