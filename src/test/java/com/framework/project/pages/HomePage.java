package com.framework.project.pages;

//import javax.sql.rowset.WebRowSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	    private By mails=By.xpath("//div[@id=':a3']//b[3]");
	    private By checkBoxDelete=By.xpath("//div[@id=':3w']");
	    private By deleteClickButton=By.xpath("//div[@class='ar9 T-I-J3 J-J5-Ji']");
        protected WebDriver driver;
        HomePage(WebDriver driver){
        	this.driver=driver;
        	System.out.println("this is homepage");
        }
       /* public String mthd(){
        	String noOfMails=driver.findElement(mails).getText();
        	return noOfMails;
        }*/
       public HomePage secondMailDelete(){
    	   driver.findElement(checkBoxDelete).click();
    	   driver.findElement(deleteClickButton).click();
    	   return new HomePage(driver);
       }
}
