package keys;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class KeysTests extends BaseTests {


    // test for single key string
    @Test
    public void testKeys(){
        var keyPage = homePage.clickKeyPress();
        keyPage.enterText("A");
        Assert.assertEquals(keyPage.getResult(), "A");
    }

    @Test
    public void testNumberKey(){
        var keyPage = homePage.clickKeyPress();
        keyPage.enterText("5");
        Assert.assertEquals(keyPage.getResult(), "5");
    }
}
