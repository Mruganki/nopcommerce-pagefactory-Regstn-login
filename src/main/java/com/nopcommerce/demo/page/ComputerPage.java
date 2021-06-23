package com.nopcommerce.demo.page;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ComputerPage extends Utility {

    private static final Logger log = LogManager.getLogger(RegistrationPage.class.getName());//pagefactory model on the top of each class

    @FindBy(xpath = "//a[text()='Computers ']")
    WebElement computers;
    @FindBy(xpath = "//body[1]/div[6]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]")
    WebElement desktop;
    @FindBy(xpath = "//body[1]/div[6]/div[3]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[2]/a[1]")
    WebElement notepad;
    @FindBy(xpath = "//body[1]/div[6]/div[3]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[3]/a[1]")
    WebElement software;
    @FindBy(xpath = "//h1[text()='Desktops']")
    WebElement desktoptext;
    @FindBy(xpath = "//h1[text()='Notebooks']")
    WebElement notebooktext;
    @FindBy(xpath = "//h1[text()='Software']")
    WebElement softwaretext;



    public void mousehoverOnComputerstab() {
        Reporter.log("hover on computers tab" + computers.toString() + "<br>");
        mouseHoverToElement(computers);
        log.info("hover on computers tab" + computers.toString());
    }
    public void navigatetoDesktopLink(){
        Reporter.log("Click on Desktop Link"+desktop.toString()+"<br>");
        clickOnElement(desktop);
        log.info("Click on Desktop Link"+desktop.toString());
    }
    public String userIsOnDesktopPage (){
        Reporter.log("verify User is on Desktop PAge "+desktoptext.toString()+"<br>");
        log.info("verify User is on Desktop PAge"+desktoptext.toString());
        return getTextFromElement(desktoptext);
    }

    public void mousehoverandclickOnComputerstab() {
        Reporter.log("hover and click on computers tab" + computers.toString() + "<br>");
       mouseHoverToElementAndClick(computers);
        log.info("hover and click on computers tab" + computers.toString());
    }

    public void navigatetoNotepadLink()throws InterruptedException{
        Reporter.log("Click on notepad Link"+notepad.toString()+"<br>");
        Thread.sleep(2000);
        mouseHoverToElement(notepad);
        clickOnElement(notepad);
        log.info("Click on notepad Link"+notepad.toString());
    }


    public String UserIsOnNotePadPage(){
        Reporter.log("verify user is on Notepad page "+ notebooktext.toString()+"<br>");
        log.info("verify user is on Notepad page"+notebooktext.toString());
        return getTextFromElement(notebooktext);
    }



    public void navigatetoSoftwareLink()throws InterruptedException{
        Reporter.log("Click on Software link"+software.toString()+"<br>");
        Thread.sleep(2000);
        mouseHoverToElement(software);
        clickOnElement(software);
        log.info("Click on software Link"+software.toString());
    }


   public String UserIsOnSoftwarePage(){
        Reporter.log("verify user is on software page "+softwaretext.toString()+"<br>");
        log.info("verify user is on software page"+softwaretext.toString());
        return getTextFromElement(softwaretext);
    }









}
