package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class KeyPressPage {
    private WebDriver driver;
    By inputField = By.id("my_field");
    By result = By.id("result");

    public KeyPressPage(WebDriver driver){
        this.driver = driver;
    }

public void enterText(String text){
    driver.findElement(inputField).sendKeys(text);
}

public String getResult(){
    String fullText = driver.findElement(result).getText();
    return fullText.replace("You entered: ", "");
}

}
