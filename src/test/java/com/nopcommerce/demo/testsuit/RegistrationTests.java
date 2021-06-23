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

public class RegistrationTests extends TestBase {

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
    public void succesfulRegistration()throws InterruptedException{
        registrationPage.navigateToRegistrationLink();
        registrationPage.selectGender();
        registrationPage.enterFirstName("Shopper");
        registrationPage.enterlastName("prime");
        registrationPage.selectDOB("12");
        registrationPage.selectMOB("5");
        registrationPage.selectYOB("1983");
        registrationPage.enterEmail("shopping21@gmail.com");
        registrationPage.enterPassword("prime123");
        registrationPage.enterConfirmPassWord("prime123");
        registrationPage.RegistrationButton();
        String expectedextOnRgstnpage = "Your registration completed";  //verify firstname empty msg on registrationpage
        String actualTextOnRgstnpage = registrationPage.verifyUsersuccefullyregistred();
        Assert.assertEquals(expectedextOnRgstnpage,actualTextOnRgstnpage );
        softAssert.assertTrue(true);
        registrationPage.clicklogout();
    }


}
