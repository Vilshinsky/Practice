package com.company.QAFactory.Playtech;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class SlotCheatPage {
    public static WebDriver driver;
    public static void setupChromeAndGo(String link) {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(link);
    }
    public static void waitSec(long seconds) {
        try {
            Thread.sleep(seconds*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void waitMsec(long msec) {
        try {
            Thread.sleep(msec*100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void get(String url) {
        driver.get(url);
    }
    public static void quit() {
        driver.quit();
    }
    public static void setFullscreen() {
        driver.manage().window().maximize();
    }
    public static WebElement waitElementByXpath(String target) {
        for (int i = 0; i < 250; i++)    {
            if (driver.findElements(By.xpath(target)).size() > 0) {
                break;
            }
            waitMsec(1);
        }
        return driver.findElement(By.xpath(target));
    }

    public static WebElement waitElementDisplayed(String target) {
        for (int i = 0; i < 250; i++)    {
            if (waitElementByXpath(target).isDisplayed()) {
                break;
            }
            waitMsec(1);
        }
        return waitElementByXpath(target);
    }
    public static void setClipboardData(String string) {
        StringSelection stringSelection = new StringSelection(string);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
    }

    public static WebElement findWrapper() {
        waitElementDisplayed("//div[@id='wrapper']");
        return waitElementByXpath("//div[@id='wrapper']");
    }

    public static void clickYes() {
        waitSec(10);
        Actions actions = new Actions(driver);
        actions.moveToElement(findWrapper(), 720, 600).click().build().perform();
        waitSec(2);
    }
    public static void clickPanelLeft() {
        waitSec(2);
        Actions actions = new Actions(driver);
        actions.moveToElement(findWrapper(), 940, 465).click().build().perform();
        waitSec(2);
    }
    public static void clickDebug() {
        waitSec(2);
        Actions actions = new Actions(driver);
        actions.moveToElement(findWrapper(), 960, 70).click().build().perform();
        waitSec(2);
    }
    public static void clickInput() {
        waitSec(2);
        Actions actions = new Actions(driver);
        actions.moveToElement(findWrapper(), 730, 290).click().build().perform();
        waitSec(2);
    }
    public static void clickFire() {
        Actions actions = new Actions(driver);
        actions.moveToElement(findWrapper(), 1135, 295).click().build().perform();
    }

    public static void autoCheatInput(String [] cheatsMassive) {
        String[] useCheat = cheatsMassive;
        int a = cheatsMassive.length - 1;
        for(int i = 0; i <= a ; i++) {
            clickDebug();
            clickInput();
            setClipboardData(useCheat[i]);
            try {
                Robot robot = new Robot();
                robot.keyPress(KeyEvent.VK_CONTROL);
                robot.keyPress(KeyEvent.VK_A);
                robot.keyRelease(KeyEvent.VK_A);
                robot.keyRelease(KeyEvent.VK_CONTROL);
                robot.keyPress(KeyEvent.VK_DELETE);
                robot.keyRelease(KeyEvent.VK_DELETE);
                robot.keyPress(KeyEvent.VK_CONTROL);
                robot.keyPress(KeyEvent.VK_V);
                robot.keyRelease(KeyEvent.VK_V);
                robot.keyRelease(KeyEvent.VK_CONTROL);
            } catch (AWTException e) {
                e.printStackTrace();
            }
            clickFire();
        }
    }


    public static void clickBetDecrease(int clicks) {
        for(int i = 1; i <= clicks ; i++) {
            Actions actions = new Actions(driver);
            actions.moveToElement(findWrapper(), 305, 470).click().build().perform();
            waitSec(2);
        }
    }
    public static void clickOkAceVentura() {
        Actions actions = new Actions(driver);
        actions.moveToElement(findWrapper(), 940, 725).click().build().perform();
        waitSec(2);
    }
}
