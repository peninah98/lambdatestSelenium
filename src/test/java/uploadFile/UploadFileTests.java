package uploadFile;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UploadFileTests extends BaseTests {

    @Test
    public void testUploadFile(){
        var uploadFilePage = homePage.clickUploadFile();
        uploadFilePage.uploadFile("C:/Users/penin/Downloads/Penine-Ngizwenayo-Transcript.pdf");
        Assert.assertEquals(uploadFilePage.getUploadedFileName(), "File Successfully Uploaded");
    }


}
