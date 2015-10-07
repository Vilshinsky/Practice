package com.company.QAFactory.Archive;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

/**
 * Created by Alexander on 26.09.2015.
 */
public class Massives {
    public static void sdasdsd() {

    }
    public static void slp (long sec) {
        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void main (String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
        ChromeDriver dvr = new ChromeDriver();
        dvr.get("http://www.socionika.info/tabl.html");
        WebElement table1 = dvr.findElement(By.xpath("//td[text()='Ваш тип']/../../.."));
        List<WebElement> rows1 = table1.findElements(By.tagName("tr"));
        List<WebElement> cells1 = table1.findElements(By.tagName("td"));
        List<WebElement> hrefs1 = table1.findElements(By.tagName("a"));
        Assert.assertEquals(37, rows1.size());
        Assert.assertEquals(313, cells1.size());
        Assert.assertEquals(304, hrefs1.size());
        WebElement gmailLink = dvr.findElement(By.linkText("Gmail"));
        WebElement partGmailLink = dvr.findElement(By.partialLinkText("Про "));
        Assert.assertEquals("https://mail.google.com/mail/?tab=wm", gmailLink.getAttribute("href"));
        System.out.println("Button name is" + partGmailLink.getText());


    }
    @Test
    public void test3() {

        Assert.assertEquals(10, sumAll(new int[]{1, 4, 2, 3, 0}));
    }

    @Test
    public void testFailed() {

        Assert.assertEquals(38, sumAll(new int[]{1, 41, 2}));
    }

    public static int sumAll22(int[] a) {
        int res = 0;
        for (int e : a) {
            res = res + e;
        }
        return res;
    }

    public static int sumAll24(int[] a) {
        int res = 0;
        for (int i = 0; i < a.length; i++) {
            int e = a[i];
            res = res + e;
        }
        return res;
    }
    public static void main1 (String[] ttt) {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
        WebDriver gcd = new ChromeDriver();

    }
    @Test
    public void test1() {
        Assert.assertEquals(20, 10 + 10);
        Assert.assertEquals(true, 1 == 1);          //OR Assert.assertTrue(1 == 1);
    }
    @Test
    public void Test3() {
        Assert.assertEquals(10, sumAll(new int[]{1, 4, 2, 3, 0}));
    }
    @Test
    public void Test3Failed() {
        Assert.assertEquals(38, sumAll(new int[]{1, 41, 2}));
    }
    public static int sumAll(int[] a) {
        int res = 0;
        for (int e : a) {
            res += e;                              //res1 = res + e; res2 = res1(res + e) + e1;
        }
        return res;
    }
    // OR!
    public static int sumAll2(int[] a) {
        int res = 0;
        for (int i = 0; i < a.length; i++) {
            res = res + a[i];
        }
        return res;
    }

}
