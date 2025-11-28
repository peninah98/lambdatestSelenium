package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertPage {
    private WebDriver driver;
    private By button = By.xpath("(//button[text()='Click Me'])");
    private By triggerConfirmButton = By.xpath("(//button[text()='Click Me'])");
    private By triggerPromptButton = By.xpath("(//button[text()='Click Me'])");
    private By results = By.id("result");
    private By confirmBox = By.id("confirm-demo");
    private By promptBox = By.id("prompt-demo");

    public AlertPage(WebDriver driver){
        this.driver = driver;
    }

    public void triggerAlert(){
        driver.findElement(button).click();
    }

    public void triggerConfirm(){
        driver.findElement(triggerConfirmButton).click();
    }

    public void triggerPrompt(){
        driver.findElement(triggerPromptButton).click();
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