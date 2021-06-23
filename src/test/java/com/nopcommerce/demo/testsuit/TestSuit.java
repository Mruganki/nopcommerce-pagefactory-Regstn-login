package com.nopcommerce.demo.testsuit;

import com.nopcommerce.demo.page.ComputerPage;
import com.nopcommerce.demo.page.HomePage;
import com.nopcommerce.demo.page.LoginPage;
import com.nopcommerce.demo.page.RegistrationPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestSuit extends TestBase {

    HomePage homePage;
    RegistrationPage registrationPage;
    LoginPage loginPage;
    ComputerPage computerPage;
    SoftAssert softAssert;


    @BeforeMethod(alwaysRun = true)
    public void testsetUp() {

        homePage = new HomePage();
        registrationPage = new RegistrationPage();
        loginPage = new LoginPage();
        computerPage = new ComputerPage();
        softAssert = new SoftAssert();
    }

    //Homepage Test
    @Test(groups = {"sanity","regression"})
    public void clickOnAllSelectMenuTabs(){

        homePage.selectMenu("Computers");
    }

    // Registration Test
    @Test(groups = {"sanity","regression"})
    public void navigatetoregistrationpage(){
        registrationPage.navigateToRegistrationLink();
    }
    @Test(groups = {"smoke","regression"})
    public void verifyErrormsgWithFirstnameEmpty()throws InterruptedException{
        registrationPage.verifyErrorMsgWithFirstNameEmpty();
        String expectedPagetext = "First name is required.";  //verify firstname empty msg on registrationpage
        String actualPageText = registrationPage.verifyErrorMsg();
        Assert.assertEquals( actualPageText,expectedPagetext );
        softAssert.assertTrue(true);
    }
 @Test(groups = {"regression"})
    public void succesfulRegistration() throws InterruptedException{
        registrationPage.navigateToRegistrationLink();
        registrationPage.selectGender();
        registrationPage.enterFirstName("Shopper");
        registrationPage.enterlastName("prime");
        registrationPage.selectDOB("12");
        registrationPage.selectMOB("5");
        registrationPage.selectYOB("1983");
        registrationPage.enterEmail("shopping22@gmail.com");
        registrationPage.enterPassword("prime123");
        registrationPage.enterConfirmPassWord("prime123");
        registrationPage.RegistrationButton();
     String expectedextOnRgstnpage = "Your registration completed";  //verify firstname empty msg on registrationpage
     String actualTextOnRgstnpage = registrationPage.verifyUsersuccefullyregistred();
     Assert.assertEquals(expectedextOnRgstnpage,actualTextOnRgstnpage );
     softAssert.assertTrue(true);
     registrationPage.clicklogout();
 }
 //Login Test
    @Test(groups = {"sanity","regression"})
    public void verifyuserNavigatetoLoginLink(){
        loginPage.navigateT0LoginLinkSucessfully();
    }
    @Test(groups = {"smoke","regression"})
    public void errorMsgWithInvalidCredentials(){
        loginPage.navigateT0LoginLinkSucessfully();
        loginPage.enterEmailAddress("shopping22@gmail.com");
        loginPage.enterPassword("0000");
        loginPage.clickLoginButton();
        String expectedErrortext = "Login was unsuccessful. Please correct the errors and try again.";  //verify login error msg
        String actualErrorText = loginPage.getErrorMsgText();
        Assert.assertEquals( actualErrorText,expectedErrortext );
        softAssert.assertTrue(true);
    }

    @Test(groups = {"regression"})
    public void loginSuccesfully(){
        loginPage.navigateT0LoginLinkSucessfully();
        loginPage.enterEmailAddress("shopping21@gmail.com");
        loginPage.enterPassword("prime123");
        loginPage.clickLoginButton();
        String expectedPagetextonHomepage = "Welcome to our store";
        String actualHomePageText = loginPage.getTextOnHomePage();
        Assert.assertEquals(  actualHomePageText,expectedPagetextonHomepage);
        softAssert.assertTrue(true);
    }
    //Computer Test
    @Test(groups = {"sanity","regression"})
    public void NavigateToDesktopLinkSuccessfully(){
       computerPage.mousehoverOnComputerstab();
       computerPage.navigatetoDesktopLink();
        String expectedTextDesktop = "Desktops";
        String actualTextDesktop = computerPage.userIsOnDesktopPage();
        Assert.assertEquals( actualTextDesktop,expectedTextDesktop);
        softAssert.assertTrue(true);
    }
    @Test(groups = {"smoke","regression"})
    public void NavigateToNotepadLinkSucessfully()throws InterruptedException{
        computerPage.mousehoverandclickOnComputerstab();
        computerPage.navigatetoNotepadLink();
        String expectedTextNotepad = "Notebooks";
        String actualTextNotepad = computerPage.UserIsOnNotePadPage();
        Assert.assertEquals(actualTextNotepad,expectedTextNotepad);
        softAssert.assertTrue(true);
    }
    @Test(groups = {"regression"})
    public void NavigatetoSoftwareLinkSucessfully()throws InterruptedException{
        computerPage.mousehoverandclickOnComputerstab();
        computerPage.navigatetoSoftwareLink();
        String expectedTextSoftware = "Software";
        String actualTextSoftware = computerPage.UserIsOnSoftwarePage();
        Assert.assertEquals(actualTextSoftware,expectedTextSoftware);
        softAssert.assertTrue(true);
    }
}
