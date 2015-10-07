package com.company.QAFactory.Playtech;

import org.junit.Test;

/**
 * Created by Alexander on 26.09.2015.
 */
public class SlotCheatPutter {
    @Test
    public void run() {
        SlotCheatPage.setupChromeAndGo
                ("http://mobdev1-game-staging-ngm.playtechgaming.com/ngm/platform/index.html?game=arc&real=1&back_url=http%3A%2F%2Fmobdev1-staging-ngm.playtechgaming.com&hub=0&username=kievdev34&debug=1&password=123456#ONLINE_REAL");
        SlotCheatPage.setFullscreen();
        SlotCheatPage.autoCheatInput(new String[]{"1,1,1,1,1", "2,2,2,2,2", "3,3,3,3,3"});
        SlotCheatPage.quit();

    }
}
