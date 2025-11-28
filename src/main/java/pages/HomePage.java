package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    protected WebDriver driver;


    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public KeyPressPage clickKeyPress(){
        clickLink("Key Press");
        return new KeyPressPage(driver);
    }

    public UploadFilePage clickUploadFile(){
        clickLink("Upload File Demo");
        return new UploadFilePage(driver);
    }
    public AlertPage clickAlertPage(){
        clickLink("Javascript Alerts");
        return new AlertPage(driver);
    }

    public HoverPage clickHoverPage(){
        clickLink("Hover Demo");
        return new HoverPage(driver);
    }

    public FormSubmitPage clickFormSubmitPage(){
        clickLink("Simple Form Demo");
        return new FormSubmitPage(driver);
    }
//
//    public DropdownPage clickDropdownPage(){
//        clickLink("Select Dropdown List");
//        return new DropdownPage(driver);
//    }
    public DropdownPage clickDropdown() {
        clickLink("JQuery Select dropdown");
        return new DropdownPage(driver);
    }

public ModalPage clickModalPage(){
    clickLink("Window Popup Modal");
    return new ModalPage(driver);
}

    public void clickLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }
}
