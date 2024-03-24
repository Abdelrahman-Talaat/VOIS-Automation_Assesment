package Pages.Sceanrio_1;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {


    By productTitle_2=By.className("a-truncate-cut");
    WebDriver driver;
    public CartPage(WebDriver driver){
        this.driver=driver;
    }
    @Step("get selected product title from cart page")
    public String getProductTitleAfterAddToCart(){

        return  driver.findElement(productTitle_2).getText();
    }
}
