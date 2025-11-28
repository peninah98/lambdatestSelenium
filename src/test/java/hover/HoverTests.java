package hover;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HoverTests extends BaseTests {

    @Test
    public void testImageIsDisplayed(){
        var hoverPage = homePage.clickHoverPage();
        Assert.assertTrue(hoverPage.isImageDisplayed(), "Image should be displayed");
    }

    @Test
    public void testImageSize(){
        var hoverPage = homePage.clickHoverPage();
        String imageSize = hoverPage.getImageSize();
        Assert.assertEquals(imageSize, "300x200", "Image size should be 300x200");
    }

}
