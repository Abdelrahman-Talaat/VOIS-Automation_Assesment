package Pages;

import Pages.Sceanrio_1.ItemsPage;
import Pages.Scenario_2.TodaysDealsPage;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AmazonHomePage {
    private WebDriver driver;
    JavascriptExecutor js;
    By searchBox=By.id("twotabsearchtextbox");
    By changeAddressMessage=By.xpath("//input[@data-action-type='DISMISS']");
    By todayDeals=By.xpath("//a[@href='/gp/goldbox?ref_=nav_cs_gb']");
    public AmazonHomePage(WebDriver driver){
        this.driver=driver;
        js= (JavascriptExecutor) driver;
    }
    @Step("enter search key in the home page ")
    public ItemsPage enterSearchKey(String searchKey){
        driver.findElement(searchBox).sendKeys(searchKey);
        driver.findElement(searchBox).submit();
        return new ItemsPage(driver);
    }
    @Step("dismiss change address alert")
    public void dismissChangeAddress(){
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
            wait.until(ExpectedConditions.presenceOfElementLocated(changeAddressMessage));
            driver.findElement(changeAddressMessage).click();

        } catch (Exception e) {


        }

    }
    @Step("navigate to today's deals from the home page")
    public TodaysDealsPage navigateToTodayDeals(){

        driver.findElement(todayDeals).click();
        return new TodaysDealsPage(driver);
    }







}

