package com.company.QAFactory.Playtech;

import org.junit.Test;

public class SlotCheatPutter {
    @Test
    public void run() {
        SlotCheatPage.setupChromeAndGo
                ("http://mobdev1-game-staging-ngm.playtechgaming.com/ngm/platform/index.html?game=ashace&real=1&back_url=http%3A%2F%2Fmobdev1-staging-ngm.playtechgaming.com&hub=0&username=kievdev12&debug=1&password=123456#ONLINE_REAL");
        SlotCheatPage.setFullscreen();
        SlotCheatPage.clickYes();
        SlotCheatPage.clickOkAceVentura();
        SlotCheatPage.clickBetDecrease(10);
        SlotCheatPage.clickPanelLeft();
        SlotCheatPage.autoCheatInput(new String[]{"1,1,1,1,1", "2,2,2,2,2", "3,3,3,3,3"});
        SlotCheatPage.quit();
    }
}
