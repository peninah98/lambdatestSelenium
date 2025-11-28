package uploadFile;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.nio.file.Paths;

public class UploadFileTests extends BaseTests {

    // Supported files
    // For this test case you have to use the path of file from your local machine
    @Test
    public void testUploadFile(){
        var uploadFilePage = homePage.clickUploadFile();
        uploadFilePage.uploadFile("C:/Users/penin/Downloads/Penine-Ngizwenayo-Transcript.pdf");
        Assert.assertEquals(uploadFilePage.getUploadedFileName(), "File Successfully Uploaded");
    }

    @Test
    public void testUploadFileWithProjectResource(){
        var uploadFilePage = homePage.clickUploadFile();
        // Get the file path from project resources
        String filePath = Paths.get("src/main/resources/testfile.pdf").toAbsolutePath().toString();
        uploadFilePage.uploadFile(filePath);
        Assert.assertEquals(uploadFilePage.getUploadedFileName(), "File Successfully Uploaded");
    }

    // Test case for the unsupported files
    @Test
    public void testUploadWithWrongFileExtension(){
        var uploadFilePage = homePage.clickUploadFile();
        String filePath = Paths.get("src/main/resources/home.html").toAbsolutePath().toString();
        uploadFilePage.uploadFile(filePath);
        Assert.assertEquals(uploadFilePage.getUploadedFileName(), "File type should be pdf, png, jpeg or jpg");
    }


}
