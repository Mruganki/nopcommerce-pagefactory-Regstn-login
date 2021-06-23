package com.nopcommerce.demo.page;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class RegistrationPage extends Utility {

    private static final Logger log = LogManager.getLogger(RegistrationPage.class.getName());//pagefactory model on the top of each class

    @FindBy(xpath = "//a[@class='ico-register']")
    WebElement registrationLink;

    @FindBy(xpath = "//button[@id='register-button']")
    WebElement registerButton;

    @FindBy(xpath = "//span[@id='FirstName-error']")
    WebElement firstNameErrorMsg;

    @FindBy(xpath = "//input[@id='gender-male']")
    WebElement radioButtonforGender;

    @FindBy(id = "FirstName")
    WebElement firstNameField;

    @FindBy(id = "LastName")
    WebElement lastNameField;
    @FindBy(xpath = "//select[@name='DateOfBirthDay']")
    WebElement dayofBirth;
    @FindBy(xpath = "//select[@name='DateOfBirthMonth']")
    WebElement monthofBirth;
    @FindBy(xpath = "//select[@name='DateOfBirthYear']")
    WebElement yearofBirth;

    @FindBy(id = "Email")
    WebElement emailField;
    @FindBy(id = "Password")
    WebElement passWordField;
    @FindBy(id = "ConfirmPassword")
    WebElement confirmPasswordField;

    @FindBy(xpath = "//div[@class ='result']")
    WebElement verifyRegisteredText;

    @FindBy(xpath = "//a[@class='ico-logout']")
    WebElement logout;




    public void navigateToRegistrationLink(){
        Reporter.log("Click on Registration Link"+registrationLink.toString()+"<br>");
        clickOnElement(registrationLink);
        log.info("Click on Registration Link "+registrationLink.toString());
    }

    public void verifyErrorMsgWithFirstNameEmpty()throws InterruptedException {
        Reporter.log("Click on Registration Link" + registrationLink.toString() + "<br>");
        clickOnElement(registrationLink);
        log.info("Click on Registration Link " + registrationLink.toString());
        Reporter.log("Click on Registration Button" + registerButton.toString() + "<br>");
        Thread.sleep(2000);
        mouseHoverToElement(registerButton);
        clickOnElement(registerButton);
        log.info("Click on Registration Button " + registerButton.toString());
    }
    public String verifyErrorMsg(){
        Reporter.log("Vefify firstname field error msg "+firstNameErrorMsg.toString()+"<br>");
        log.info("verify error msg with first name empty "+firstNameErrorMsg.toString());
        return getTextFromElement(firstNameErrorMsg);
    }
    public void selectGender()throws InterruptedException{
        Reporter.log("click Gender Male"+radioButtonforGender.toString()+"<br>");
        Thread.sleep(2000);
        clickOnElement(radioButtonforGender);
        log.info("Click on gender Male" +radioButtonforGender.toString());
    }

    public void enterFirstName(String firstname){
        Reporter.log("Enter firstname "+firstNameField.toString()+"<br>");
        sendTextToElement(firstNameField,firstname);
        log.info("Enter firstname "+firstNameField.toString());
    }
    public void enterlastName(String lastname){
        Reporter.log("Enter lastname "+lastNameField.toString()+"<br>");
        sendTextToElement(lastNameField,lastname);
        log.info("Enter lastname "+lastNameField.toString());
    }

    public void selectDOB(String value){
        Reporter.log("Enter day of birthdate "+dayofBirth.toString()+"<br>");
        selectByValueFromDropDown(dayofBirth,value);
        log.info("");
    }
    public void selectMOB(String month){
        Reporter.log("Enter month of birth "+monthofBirth.toString()+"<br>");
        selectByValueFromDropDown(monthofBirth,month);
        log.info("Enter month of birth "+monthofBirth.toString());
    }
    public void selectYOB(String year){
        Reporter.log("Enter month of birth "+monthofBirth.toString()+"<br>");
        selectByValueFromDropDown(yearofBirth,year);
        log.info("");
    }
    public void enterEmail(String email){
        Reporter.log("Enter email "+emailField.toString()+"<br>");
        sendTextToElement(emailField,email);
        log.info("Enter email "+emailField.toString());
    }
    public void enterPassword(String password){
        Reporter.log("Enter password "+passWordField.toString()+"<br>");
        sendTextToElement(passWordField,password);
        log.info("Enter password "+passWordField.toString());
    }
    public void enterConfirmPassWord(String confirmpassword){
        Reporter.log("Enter confirmpassword "+confirmPasswordField.toString()+"<br>");
        sendTextToElement(confirmPasswordField,confirmpassword);
        log.info("Enter confirmpassword "+confirmPasswordField.toString());
    }
    public void RegistrationButton(){
        Reporter.log("click on Registration button "+registerButton.toString()+"<br>");
        clickOnElement(registerButton);
        log.info("click on Registration button "+registerButton.toString());
    }

    public String verifyUsersuccefullyregistred(){
        Reporter.log("Vefify User on registered page "+ verifyRegisteredText.toString()+"<br>");
        log.info("verify error msg with first name empty "+verifyRegisteredText.toString());
        return getTextFromElement(verifyRegisteredText);
    }
    public void clicklogout()throws InterruptedException{
        Reporter.log("click on logout "+logout.toString()+"<br>");
        Thread.sleep(2000);
       mouseHoverToElementAndClick(logout);
        log.info("click on logout "+logout.toString());
    }

}
