package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class DropdownPage {

    private  WebDriver driver;
    private By dropdown = By.id("JQuery Select dropdown");

    public DropdownPage(WebDriver driver){
        this.driver = driver;
    }

    public void selectFromDropDown(String option) {
        findDropDownElement().selectByVisibleText(option);
    }
    public List<String> getSectedOptions(){
        List<WebElement> selectedElements =  findDropDownElement().getAllSelectedOptions();
        return selectedElements.stream().map(e->e.getText()).collect(Collectors.toList());
    }

    public Select findDropDownElement(){
        return new Select(driver.findElement(dropdown));
    }




















//    private By countryDropdown = By.id("country");
//    private By selectedValue = By.id("select2-country-container");
//    private WebDriver driver;
////    private WebDriverWait wait;
//
//    private By countryDropdown = By.id("country");
//    private By selectedValue = By.id("select2-country-container");
//
//    public DropdownPage(WebDriver driver){
//        this.driver = driver;
//    }
//
//    public boolean isDropdownDisplayed(){
//        return driver.findElement(countryDropdown).isDisplayed();
//    }

//    public void selectCountry(String countryName){
//        WebElement dropdown = driver.findElement(countryDropdown);
//        Select select = new Select(dropdown);
//        select.selectByVisibleText(countryName);
//    }
//
//    public String getSelectedCountry(){
//        return driver.findElement(selectedValue).getText();
//    }
//
//    public String getDropdownPlaceholder(){
//        WebElement placeholder = driver.findElement(selectedValue);
//        return placeholder.getAttribute("title");
//    }


}
