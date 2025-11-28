package alert;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertTests extends BaseTests {

    @Test
    public void acceptAlert(){
        var alertPage = homePage.clickAlertPage();
        alertPage.triggerAlert();
        String alertText = alertPage.getAlertText();
        Assert.assertEquals(alertText, "I am an alert box!", "Alert message not match");
        alertPage.acceptAlert();
    }
}