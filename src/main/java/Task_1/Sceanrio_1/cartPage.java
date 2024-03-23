package Task_1.Sceanrio_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class cartPage {


    By productTitle_2=By.className("a-truncate-cut");
    WebDriver driver;
    public cartPage(WebDriver driver){
        this.driver=driver;
    }
    public String getProductTitleAfterAddToCart(){

        return  driver.findElement(productTitle_2).getText();
    }
}
