package Task_1.Sceanrio_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class carAccessories {
    private WebDriver driver;
    By searchBox=By.id("twotabsearchtextbox");
    By firstItem=By.xpath("//div[@data-index='3']//h2 ");
    By addToCartButton=By.cssSelector("#add-to-cart-button");
    By goToCArt=By.id("sw-gtc");

    By changeAddressMessage=By.xpath("//input[@data-action-type='DISMISS']");

    By productTitle_1 =By.xpath("//div[@data-index='3']//h2//span");

    By productTitle_2=By.className("a-truncate-cut");

    By productBrandName=By.xpath("//tr[@class='a-spacing-small po-brand']//td[2]");

    public carAccessories (WebDriver driver){
        this.driver=driver;
    }
    public void enterSearchKey(String searchKey){
        driver.findElement(searchBox).sendKeys(searchKey);
        driver.findElement(searchBox).submit();
    }
    public void selectFirstItem(){

        driver.findElement(firstItem).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.presenceOfElementLocated(addToCartButton));
    }

    public void clickAddToCartButton(){
        driver.findElement(addToCartButton).click();
    }

    public void navigateToCartPage(){
        driver.findElement(goToCArt).click();
    }

    public void dismissChangeAddress(){
        driver.findElement(changeAddressMessage).click();
    }

    public String getProductTitle_1(){
        return  driver.findElement(productTitle_1).getText();
    }

    public String getProductTitleAfterAddToCart(){
        return  driver.findElement(productTitle_2).getText();
    }

    public String getProductBrandName(){
        return  driver.findElement(productBrandName).getText();
    }

}

