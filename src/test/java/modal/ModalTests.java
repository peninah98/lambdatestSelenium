package modal;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class ModalTests extends BaseTests {

    @Test
    public void testModalIsDisplayed(){
        var modalPage = homePage.clickModalPage();
//        assertTrue(homePage.clickDropdown().findDropDownElement())
    }

    @Test
    public void openModal(){
        var modalPage = homePage.clickModalPage();
        modalPage.clickModalLink();
    }
}
