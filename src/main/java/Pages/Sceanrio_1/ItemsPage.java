package Pages.Sceanrio_1;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ItemsPage {
    By firstItem=By.xpath("//div[@data-index='3']//h2 ");
    By addToCartButton=By.cssSelector("#add-to-cart-button");
    By productTitle_1 =By.xpath("//div[@data-index='3']//h2//span");
    WebDriver driver;

    public ItemsPage(WebDriver driver){
        this.driver=driver;
    }
    @Step("select first item in the page")
    public AddToCartPage selectFirstItem(){

        driver.findElement(firstItem).click();


        return  new AddToCartPage(driver);
    }
    @Step("get selected product title from item page")
    public String getProductTitle_1(){
        return  driver.findElement(productTitle_1).getText();
    }
}
