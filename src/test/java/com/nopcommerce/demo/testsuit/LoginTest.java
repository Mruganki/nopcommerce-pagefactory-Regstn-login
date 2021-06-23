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

public class LoginTest extends TestBase {

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

    @Test(groups = {"sanity", "regression"})
    public void verifyuserNavigatetoLoginLink() {
        loginPage.navigateT0LoginLinkSucessfully();
    }

    @Test(groups = {"smoke", "regression"})
    public void errorMsgWithInvalidCredentials() {
        loginPage.navigateT0LoginLinkSucessfully();
        loginPage.enterEmailAddress("shopping21@gmail.com");
        loginPage.enterPassword("0000");
        loginPage.clickLoginButton();
        String expectedErrortext = "Login was unsuccessful. Please correct the errors and try again.";  //verify login error msg
        String actualErrorText = loginPage.getErrorMsgText();
        Assert.assertEquals(actualErrorText, expectedErrortext);
        softAssert.assertTrue(true);
    }

    @Test(groups = {"regression"})
    public void loginSuccesfully() {
        loginPage.navigateT0LoginLinkSucessfully();
        loginPage.enterEmailAddress("shopping21@gmail.com");
        loginPage.enterPassword("prime123");
        loginPage.clickLoginButton();
        String expectedPagetextonHomepage = "Welcome to our store";
        String actualHomePageText = loginPage.getTextOnHomePage();
        Assert.assertEquals(actualHomePageText, expectedPagetextonHomepage);
        softAssert.assertTrue(true);
    }
}