package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertPage {
    private WebDriver driver;
    By button = By.xpath("(//button[text()='Click Me'])[1]");
    private By triggerConfirmButton = By.xpath("(//button[text()='Click Me'])[2]");
    private By triggerPropmtButton = By.xpath("(//button[text()='Click Me'])[3]");
    private By results =   By.id("result");
    private By comfirmBox = By.id("confirm-demo");
    private By promptBox = By.id("prompt-demo");

    public AlertPage(WebDriver driver){
        this.driver = driver;
    }

    public void  triggleAlert(){
        driver.findElement(button).click();
    }
    public void triggleConfirm(){
        driver.findElement(triggerConfirmButton).click();
    }
    public void trigglePrompt(){
        driver.findElement(triggerPropmtButton).click();
    }
    public void acceptAlert(){
        driver.switchTo().alert().accept();
    }
    public void dismissAlert(){
        driver.switchTo().alert().dismiss();
    }
    public void sendKeysToAlert(String text){
        driver.switchTo().alert().sendKeys(text);
    }
    public String getAlertText(){
        return driver.switchTo().alert().getText();
    }

}
