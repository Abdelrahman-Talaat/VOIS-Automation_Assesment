package Task_1.Sceanrio_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class addToCartPage {
    By productBrandName=By.xpath("//tr[@class='a-spacing-small po-brand']//td[2]");
    By addToCartButton=By.cssSelector("#add-to-cart-button");
    By goToCArt=By.id("sw-gtc");
    WebDriver driver;

    public addToCartPage (WebDriver driver){
        this.driver=driver;
    }
    public String getProductBrandName(){
        return  driver.findElement(productBrandName).getText();
    }
    public void clickAddToCartButton(){
        driver.findElement(addToCartButton).click();
    }
    public cartPage navigateToCartPage(){
        driver.findElement(goToCArt).click();
        return  new cartPage(driver);
    }

}
