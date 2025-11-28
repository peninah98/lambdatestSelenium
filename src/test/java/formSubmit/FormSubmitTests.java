package formSubmit;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FormSubmitTests extends BaseTests {

    @Test
    public void testAddTwoNumbers(){
        var formPage = homePage.clickFormSubmitPage();
        formPage.submitForm("12", "32");
        String result = formPage.getResult();
        Assert.assertEquals(result, "44", "Sum of 12 + 32 should be 44");
    }

    @Test
    public void testAddZeroAndNumber(){
        var formPage = homePage.clickFormSubmitPage();
        formPage.submitForm("0", "50");
        String result = formPage.getResult();
        Assert.assertEquals(result, "50", "Sum of 0 + 50 should be 50");
    }

    @Test
    public void testAddNegativeNumbers(){
        var formPage = homePage.clickFormSubmitPage();
        formPage.submitForm("-10", "-20");
        String result = formPage.getResult();
        Assert.assertEquals(result, "-30", "Sum of -10 + -20 should be -30");
    }

    @Test
    public void testAddLargeNumbers(){
        var formPage = homePage.clickFormSubmitPage();
        formPage.submitForm("999", "1");
        String result = formPage.getResult();
        Assert.assertEquals(result, "1000", "Sum of 999 + 1 should be 1000");
    }

    @Test
    public void testNonPositiveInput(){
        var formPage = homePage.clickFormSubmitPage();
        formPage.submitForm("Test", "Selenium");
        String result = formPage.getResult();
        Assert.assertEquals(result, "Entered value is not a number", "Error");
    }
}