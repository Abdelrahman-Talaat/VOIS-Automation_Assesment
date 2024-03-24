package Pages.Sceanrio_1;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AddToCartPage {
    By productBrandName=By.xpath("//tr[@class='a-spacing-small po-brand']//td[2]");
    By addToCartButton=By.cssSelector("#add-to-cart-button");
    By goToCArt=By.id("sw-gtc");
    WebDriver driver;

    public AddToCartPage(WebDriver driver){
        this.driver=driver;
    }
    public String getProductBrandName(){
        return  driver.findElement(productBrandName).getText();
    }
    @Step("click add to cart button")
    public void clickAddToCartButton(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.presenceOfElementLocated(addToCartButton));
        driver.findElement(addToCartButton).click();
    }

    @Step("navigate to cart page")
    public CartPage navigateToCartPage(){
        driver.findElement(goToCArt).click();
        return  new CartPage(driver);
    }

}
