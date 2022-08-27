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
         arrProductLink = returnTheProductName(index).getAttribute("href").split("&");
         productsClicked.add(arrProductLink[0]);

    }

    public List<String> getTheProductNamesInCart() {
        List<String> listOfProductNamesInCart = new ArrayList<>();

        for (WebElement each :productNamesinCart) {
             arrProductInCartLink=each.getAttribute("href").split("&");
            listOfProductNamesInCart.add(arrProductInCartLink[0]);
        }
        return listOfProductNamesInCart;
    }


    }






