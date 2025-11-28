package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ModalPage {
    private WebDriver driver;
    private By.ByLinkText modalLink = (By.ByLinkText) By.linkText("Follow On Twitter");

    public ModalPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickModalLink(){
        driver.findElement(modalLink).click();
    }


}
