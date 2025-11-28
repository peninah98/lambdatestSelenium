package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    protected WebDriver driver;
    By keyPressesLink = By.linkText("Key Press");

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public KeyPressPage clickKeyPress(){
        clickLink("Key Press");
        return new KeyPressPage(driver);

    }
    public void clickLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }
}
