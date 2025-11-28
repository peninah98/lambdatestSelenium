package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HoverPage {
    private WebDriver driver;
    private By hoverImage = By.xpath("//img[@alt='Image']");
    private By hoverText = By.xpath("//div[@class='hover-text']");

    public HoverPage(WebDriver driver){
        this.driver = driver;
    }

    public void hoverOverImage(){
        WebElement image = driver.findElement(hoverImage);
        Actions actions = new Actions(driver);
        actions.moveToElement(image).perform();
    }

    public String getHoverText(){
        return driver.findElement(hoverText).getText();
    }

    public String getImageSize(){
        WebElement image = driver.findElement(hoverImage);
        String width = image.getAttribute("width");
        String height = image.getAttribute("height");
        return width + "x" + height;
    }

    public boolean isImageDisplayed(){
        return driver.findElement(hoverImage).isDisplayed();
    }
}
