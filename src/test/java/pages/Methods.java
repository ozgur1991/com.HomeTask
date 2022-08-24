package pages;

import org.jetbrains.annotations.NotNull;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.Driver;

import java.util.ArrayList;
import java.util.List;

public class Methods {
    public static String title;
    public static Actions actions = new Actions(Driver.getDriver());
    public List<String> productsClicked = new ArrayList<>();



    public void get(String url) {
        Driver.getDriver().get(url);
    }

    public void click(@NotNull WebElement element) {
        element.click();

    }

    public void sendKeys(WebElement element,String text) {
        element.sendKeys(text);
    }

    public void makeAssertion(String text1,String text2) {
        //Assert.assertTrue(text2.contains(text1));
        Assert.assertEquals(text1,text2);
    }

    public String getTitle() {
        title =  Driver.getDriver().getTitle();
        return title;
    }



    public static void hoverAnElement(WebElement element) {
        actions.moveToElement(element).perform();
    }


}
