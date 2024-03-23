package Task_1.Scenario_2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class todaysDeals {
    WebDriver driver;
    JavascriptExecutor js;
    By changeAddressMessage=By.xpath("//input[@data-action-type='DISMISS']");
    By todayDeals=By.xpath("//a[@href='/gp/goldbox?ref_=nav_cs_gb']");
    By headPhoneCheckBox=By.xpath("//input[@data-csa-c-element-id='filter-department-172541']");
    By groceryCheckBox=By.xpath("//input[@data-csa-c-element-id='filter-department-16310101']");
    By pageNavigation =By.xpath("//ul//li[@class='a-last']");
   /* //ul//li[@class='a-last']*/
    By discountValue=By.xpath("//span[@aria-label='Discount filter']//a[@data-csa-c-element-id='filter-discount-10-']");
    public todaysDeals(WebDriver driver){
        this.driver=driver;
        js= (JavascriptExecutor) driver;
    }
    public void navigateToTodayDeals(){

        driver.findElement(todayDeals).click();
    }
    public void dismissChangeAddress(){
        driver.findElement(changeAddressMessage).click();
    }

    public void checkItems(){
        driver.findElement(headPhoneCheckBox).click();
        driver.findElement(groceryCheckBox).click();


    }
    public void selectDiscountValue(){
        driver.findElement(discountValue).click();
    }
    public void scrollDown()  {

        js.executeScript("arguments[0].scrollIntoView()",driver.findElement(pageNavigation));

    }
    public void moveToPage()  {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(pageNavigation)));
        driver.findElement(pageNavigation).click();
    }
}
