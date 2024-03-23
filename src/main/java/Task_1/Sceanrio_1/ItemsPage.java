package Task_1.Sceanrio_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.mail.FetchProfile;
import java.time.Duration;

public class ItemsPage {
    By firstItem=By.xpath("//div[@data-index='3']//h2 ");
    By addToCartButton=By.cssSelector("#add-to-cart-button");
    By productTitle_1 =By.xpath("//div[@data-index='3']//h2//span");
    WebDriver driver;

    public ItemsPage(WebDriver driver){
        this.driver=driver;
    }
    public addToCartPage selectFirstItem(){

        driver.findElement(firstItem).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.presenceOfElementLocated(addToCartButton));

        return  new addToCartPage(driver);
    }
    public String getProductTitle_1(){
        return  driver.findElement(productTitle_1).getText();
    }
}
