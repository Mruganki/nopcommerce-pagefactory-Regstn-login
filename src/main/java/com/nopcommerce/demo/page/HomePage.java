package com.nopcommerce.demo.page;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class HomePage extends Utility {


    private static final Logger log = LogManager.getLogger(HomePage.class.getName());//pagefactory model on the top of each class

    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[1]/a[1]")
    WebElement computers;

    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[1]/a[1]")
    WebElement electronics;

    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[3]/a[1]")
    WebElement apparel;

    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[4]/a[1]")
    WebElement digitaldownloads;

    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[5]/a[1]")
    WebElement books;

    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[6]/a[1]")
    WebElement jewelry;

    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[7]/a[1]")
    WebElement giftcards;




    public  void selectMenu(String menu) {
        if (menu.equalsIgnoreCase("Computers")) {
            Reporter.log("Clicking on all Top Menu Tabs" + computers.toString()+ "<br>");
            clickOnElement(computers);
            log.info("Clicking on all Top Menu Tabs" + computers.toString());

        } else if (menu.equalsIgnoreCase("Electronics")) {
            Reporter.log("Clicking on all Top Menu Tabs" + electronics.toString()+ "<br>");
            clickOnElement(electronics);
            log.info("Clicking on all Top Menu Tabs" + electronics.toString());

        } else if (menu.equalsIgnoreCase("Apparel ")) {
            Reporter.log("Clicking on all Top Menu Tabs" + apparel.toString()+ "<br>");
            clickOnElement(apparel);
            log.info("Clicking on all Top Menu Tabs " + apparel.toString());

        } else if (menu.equalsIgnoreCase("Digital downloads ")) {
            Reporter.log("Clicking on all Top Menu Tabs" + digitaldownloads.toString()+ "<br>");
            clickOnElement(digitaldownloads);
            log.info("Clicking on all Top Menu Tabs " + digitaldownloads.toString());
        } else if (menu.equalsIgnoreCase("Books ")) {
            Reporter.log("Clicking on all Top Menu Tabs" + books.toString()+ "<br>");
            clickOnElement(books);
            log.info("Clicking on all Top Menu Tabs " + books.toString());
        } else if (menu.equalsIgnoreCase("Jewelry ")) {
            Reporter.log("Clicking on all Top Menu Tabs" + jewelry.toString()+ "<br>");
            clickOnElement(jewelry);
            log.info("Clicking on all Top Menu Tabs" + jewelry.toString());
        } else if (menu.equalsIgnoreCase("Gift Cards ")) {
            Reporter.log("Clicking on all Top Menu Tabs" + jewelry.toString()+ "<br>");
            clickOnElement(giftcards);
            log.info("Clicking on all Top Menu Tabs " + jewelry.toString());
        }

    }

}
