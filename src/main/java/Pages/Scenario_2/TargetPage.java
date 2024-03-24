package Pages.Scenario_2;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TargetPage {
    WebDriver driver;
    By selectItem=By.xpath("(//div[@data-testid='deal-card'])[1]/div//a");
    By addToCartBtn=By.id("dealsx_atc_btn");

    public TargetPage (WebDriver driver){
        this.driver=driver;
    }
    @Step("select item from the target page")
    public void selectItem(){
        driver.findElement(selectItem).click();
    }
    @Step("click on add to cart button for item selected from the target page")
    public void clickAddToCart(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(addToCartBtn));
        driver.findElement(addToCartBtn).click();
    }
}
