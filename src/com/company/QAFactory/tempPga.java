package com.company.QAFactory;


import com.company.Common.TestHelper;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class tempPga {
    @Test
    public void tttest() {
        TestHelper.setupChromeAndGo("http://qa-www.pgatour.ctmsp.com/");
        TestHelper.waitSec(2);
        TestHelper.waitElementByXpath("//*[@class='login-button log-in']").click();
        List<WebElement> texts = TestHelper.driver.findElements(By.xpath("//*[@class='gigya-screen-dialog']//*[text()]"));
        for (WebElement w : texts) {
            System.out.println(w.getText());
        }
    }
}
