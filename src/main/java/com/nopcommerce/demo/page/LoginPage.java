package com.nopcommerce.demo.page;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class LoginPage extends Utility {

    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());//pagefactory model on the top of each class

    @FindBy(xpath = "//a[@class ='ico-login']")
    WebElement loginLink;

    @FindBy(xpath = "//input[@id='Email']")
    WebElement emailField;

    @FindBy(xpath = "//input[@id='Password']")
    WebElement passwordField;

    @FindBy(xpath ="//button[@class ='button-1 login-button']")
    WebElement loginButton;

    @FindBy(xpath ="//div[@class='message-error validation-summary-errors']")
    WebElement errorMsgText;

    @FindBy(xpath ="//div[@class ='topic-block-title']")
    WebElement verifytexOnHomePage;


    public void navigateT0LoginLinkSucessfully(){
        Reporter.log("click on Login link"+loginLink.toString()+"<br>");
        clickOnElement(loginLink);
        log.info("click on Login link "+loginLink.toString());
    }

  public void enterEmailAddress(String email){
      Reporter.log("Enter Email"+emailField.toString()+"<br>");
        sendTextToElement(emailField,email);
      log.info("Enter Email "+emailField.toString());
  }
  public void enterPassword(String password){
      Reporter.log("Enter Password"+passwordField.toString()+"<br>");
        sendTextToElement(passwordField,password);
        log.info("Enter Password "+passwordField.toString());
    }
    public void clickLoginButton(){
        Reporter.log("click on Login Button"+loginButton.toString()+"<br>");
        clickOnElement(loginButton);
        log.info("click on Login Button "+loginButton.toString());
    }

    public String getErrorMsgText(){
        Reporter.log("click on Login link"+loginLink.toString()+"<br>");
        return getTextFromElement(errorMsgText);

    }
    public String getTextOnHomePage(){
        Reporter.log("click on Login link"+loginLink.toString()+"<br>");
        return getTextFromElement(verifytexOnHomePage);
    }


}
