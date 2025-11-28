package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FormSubmitPage {
    private WebDriver driver;
    private By firstValueInput = By.id("sum1");
    private By secondValueInput = By.id("sum2");
    private By getSumButton = By.xpath("//button[contains(text(), 'Get Sum')]");
    private By resultText = By.id("addmessage");

    public FormSubmitPage(WebDriver driver){
        this.driver = driver;
    }

    public void enterFirstValue(String value){
        driver.findElement(firstValueInput).clear();
        driver.findElement(firstValueInput).sendKeys(value);
    }

    public void enterSecondValue(String value){
        driver.findElement(secondValueInput).clear();
        driver.findElement(secondValueInput).sendKeys(value);
    }

    public void clickGetSumButton(){
        driver.findElement(getSumButton).click();
    }

    public String getResult(){
        return driver.findElement(resultText).getText();
    }

    public void submitForm(String firstValue, String secondValue){
        enterFirstValue(firstValue);
        enterSecondValue(secondValue);
        clickGetSumButton();
    }
}
