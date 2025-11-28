package dropdown;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class DropdownTests extends BaseTests {
    @Test
    public void testSelectionOption(){
        var dropDownPage = homePage.clickDropdown();

    }
    @Test
    public void testDropdownIsDisplayed(){
        var dropdownPage = homePage.clickDropdown();
        Assert.assertTrue(dropdownPage.findDropDownElement().getOptions().size() > 0,
                "Dropdown should be displayed with options");
    }

    @Test
    public void testSelectSingleOption(){
        var dropdownPage = homePage.clickDropdown();
        dropdownPage.selectFromDropDown("India");
        List<String> selected = dropdownPage.getSectedOptions();
        Assert.assertEquals(selected.size(), 1, "Only one option should be selected");
        Assert.assertEquals(selected.get(0), "India", "Selected option should be India");
    }

    @Test
    public void testSelectMultipleOptions(){
        var dropdownPage = homePage.clickDropdown();
        dropdownPage.selectFromDropDown("Australia");
        dropdownPage.selectFromDropDown("Japan");

        List<String> selected = dropdownPage.getSectedOptions();
        Assert.assertTrue(selected.contains("Australia"), "Australia should be selected");
        Assert.assertTrue(selected.contains("Japan"), "Japan should be selected");
    }

    @Test
    public void testDropdownOptionsCount(){
        var dropdownPage = homePage.clickDropdown();
        int optionCount = dropdownPage.findDropDownElement().getOptions().size();
        Assert.assertTrue(optionCount > 0, "Dropdown should contain options");
    }

    @Test
    public void testDropdownContainsSpecificOption(){
        var dropdownPage = homePage.clickDropdown();
        boolean hasUSA = dropdownPage.findDropDownElement()
                .getOptions()
                .stream()
                .anyMatch(e -> e.getText().equals("United States of America"));

        Assert.assertTrue(hasUSA, "Dropdown should contain United States of America");
    }
}
