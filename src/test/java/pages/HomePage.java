package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.ArrayList;
import java.util.List;


public abstract class HomePage extends Methods {

    public HomePage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@class='shopping_cart']//a[1]")
    public WebElement cart;

    @FindBy(xpath = "//span[@class='cross']")
    public WebElement closeThePopUp;

//    @FindBy(xpath = "//*[@id='layer_cart']")
//    public WebElement addCartPopUp;
//
//    @FindBy(xpath = "(//*[@id='homefeatured']//*[@class='right-block'])//*[@class='product-name']")
//    public List<WebElement> productNamesDisplayed;

    @FindBy(xpath = "//*[@class='cart-info']//*[@class='product-name']//a")
    public List<WebElement> productNamesinCart;


    public WebElement returnTheProductWithNo(int index) {
        return Driver.getDriver().findElement(By.xpath("(//*[@id='homefeatured']//*[@class='product_img_link'])[" + index + "]"));
    }

    public WebElement addTheProductOfNoToTheCart(int index) {
        return Driver.getDriver().findElement(By.xpath("(//*[@data-id-product='" + index + "'])[1]"));
    }

    public WebElement returnTheProductName(int index) {
        return Driver.getDriver().findElement(By.xpath("(//*[@id='homefeatured']//*[@class='right-block'])[" + index + "]//*[@class='product-name']"));
    }

    public void addTheProductClicked(int index) {
        String[] arr = returnTheProductName(index).getAttribute("href").split("&");
        // productsClicked.add(returnTheProductName(index).getAttribute("href"));
        productsClicked.add(arr[0]);

    }

    public List<String> getTheProductNamesInCart() {
        List<String> listOfProductNamesInCart = new ArrayList<>();

        for (WebElement each :productNamesinCart) {
            String[] arr=each.getAttribute("href").split("&");
            listOfProductNamesInCart.add(arr[0]);
        }
        return listOfProductNamesInCart;
    }


    }






