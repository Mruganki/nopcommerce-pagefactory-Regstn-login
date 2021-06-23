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

public class ComputerTest extends TestBase {

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
