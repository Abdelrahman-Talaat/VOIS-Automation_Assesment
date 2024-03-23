package Task_1;

import Task_1.Sceanrio_1.ItemsPage;
import Task_1.Scenario_2.todaysDealsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
    private WebDriver driver;
    JavascriptExecutor js;
    By searchBox=By.id("twotabsearchtextbox");
    By changeAddressMessage=By.xpath("//input[@data-action-type='DISMISS']");
    By todayDeals=By.xpath("//a[@href='/gp/goldbox?ref_=nav_cs_gb']");





    public HomePage(WebDriver driver){
        this.driver=driver;
        js= (JavascriptExecutor) driver;
    }
    public ItemsPage enterSearchKey(String searchKey){
        driver.findElement(searchBox).sendKeys(searchKey);
        driver.findElement(searchBox).submit();
        return new ItemsPage(driver);
    }

    public void dismissChangeAddress(){
        driver.findElement(changeAddressMessage).click();
    }

    public todaysDealsPage navigateToTodayDeals(){

        driver.findElement(todayDeals).click();
        return new todaysDealsPage(driver);
    }







}

