package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UploadFilePage {
    private WebDriver driver;
  private  By fileInput = By.id("file");
//  private By   errorMessageSection = By.id("error");
  private By   successMessageSection = By.id("error");


    public UploadFilePage(WebDriver driver){
        this.driver = driver;
    }

    public void uploadFile(String filePath){
        driver.findElement(fileInput).sendKeys(filePath);
    }

    public String getUploadedFileName(){
      return  driver.findElement(successMessageSection).getText();
    }




}
