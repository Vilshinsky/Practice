package com.company.QAFactory.Archive;

import com.company.Common.TestHelper;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class OsagoTests {
    @Before
    public void preconditionsApply() {
        TestHelper.setupChromeAndGo(OsagoPage.pageUrl);
    }
    @After
    public void postconditionsApply() {
        TestHelper.quit();
    }

    @Test
    public void shouldShowUtiForLightVehicleEngine1600() {
        OsagoPage.setVehicle("ëåãêîâîé àâòîìîáèëü");
        OsagoPage.setEngineCapacity("îáúåì äâèãàòåëÿ äî 1600 ñì? âêëþ÷èòåëüíî");
        Assert.assertTrue(OsagoPage.ExistInList());
        Assert.assertEquals("777 ãðí.", OsagoPage.checkAmount());
    }}
