package Pages.Scenario_2;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TodaysDealsPage {

    WebDriver driver;
    JavascriptExecutor js;
    By headPhoneCheckBox=By.xpath("//input[@data-csa-c-element-id='filter-department-172541']");
    By groceryCheckBox=By.xpath("//input[@data-csa-c-element-id='filter-department-16310101']");
    By discountValue=By.xpath("//span[@aria-label='Discount filter']//a[@data-csa-c-element-id='filter-discount-10-']");
    By pageNavigation =By.xpath("//a[@href='#' and contains(text(),'Next')]");
    public TodaysDealsPage(WebDriver driver){
        this.driver=driver;
        js= (JavascriptExecutor) driver;
    }
    @Step("check items from filter")
    public void checkItems(){
        driver.findElement(headPhoneCheckBox).click();
        driver.findElement(groceryCheckBox).click();


    }
    @Step("select discount value")
    public void selectDiscountValue()  {
        driver.findElement(discountValue).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.urlToBe("https://www.amazon.com/gp/goldbox?ref_=nav_cs_gb&deals-widget=%257B%2522version%2522%253A1%252C%2522viewIndex%2522%253A0%252C%2522presetId%2522%253A%25224BECF583092A5BE4F3F278C0F2900B75%2522%252C%2522discountRanges%2522%253A%255B%257B%2522sectionText%2522%253A%2522Discount%2522%252C%2522optionText%2522%253A%252210%2525%2520off%2520or%2520more%2522%252C%2522from%2522%253A10%252C%2522to%2522%253Anull%252C%2522selected%2522%253Atrue%257D%252C%257B%2522sectionText%2522%253A%2522Discount%2522%252C%2522optionText%2522%253A%252225%2525%2520off%2520or%2520more%2522%252C%2522from%2522%253A25%252C%2522to%2522%253Anull%252C%2522selected%2522%253Afalse%257D%252C%257B%2522sectionText%2522%253A%2522Discount%2522%252C%2522optionText%2522%253A%252250%2525%2520off%2520or%2520more%2522%252C%2522from%2522%253A50%252C%2522to%2522%253Anull%252C%2522selected%2522%253Afalse%257D%252C%257B%2522sectionText%2522%253A%2522Discount%2522%252C%2522optionText%2522%253A%252270%2525%2520off%2520or%2520more%2522%252C%2522from%2522%253A70%252C%2522to%2522%253Anull%252C%2522selected%2522%253Afalse%257D%255D%252C%2522departments%2522%253A%255B%252216310101%2522%252C%2522172541%2522%255D%252C%2522sorting%2522%253A%2522FEATURED%2522%257D"));
    }
    @Step("move to the target page")
    public TargetPage moveToPage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(pageNavigation)));
        driver.navigate().refresh();
        js.executeScript("arguments[0].scrollIntoView()",driver.findElement(pageNavigation));
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(pageNavigation)));
        driver.findElement(pageNavigation).click();
        wait.until(ExpectedConditions.urlToBe("https://www.amazon.com/gp/goldbox?ref_=nav_cs_gb&deals-widget=%257B%2522version%2522%253A1%252C%2522viewIndex%2522%253A60%252C%2522presetId%2522%253A%25224BECF583092A5BE4F3F278C0F2900B75%2522%252C%2522discountRanges%2522%253A%255B%257B%2522sectionText%2522%253A%2522Discount%2522%252C%2522optionText%2522%253A%252210%2525%2520off%2520or%2520more%2522%252C%2522from%2522%253A10%252C%2522to%2522%253Anull%252C%2522selected%2522%253Atrue%257D%252C%257B%2522sectionText%2522%253A%2522Discount%2522%252C%2522optionText%2522%253A%252225%2525%2520off%2520or%2520more%2522%252C%2522from%2522%253A25%252C%2522to%2522%253Anull%252C%2522selected%2522%253Afalse%257D%252C%257B%2522sectionText%2522%253A%2522Discount%2522%252C%2522optionText%2522%253A%252250%2525%2520off%2520or%2520more%2522%252C%2522from%2522%253A50%252C%2522to%2522%253Anull%252C%2522selected%2522%253Afalse%257D%252C%257B%2522sectionText%2522%253A%2522Discount%2522%252C%2522optionText%2522%253A%252270%2525%2520off%2520or%2520more%2522%252C%2522from%2522%253A70%252C%2522to%2522%253Anull%252C%2522selected%2522%253Afalse%257D%255D%252C%2522departments%2522%253A%255B%252216310101%2522%252C%2522172541%2522%255D%252C%2522sorting%2522%253A%2522FEATURED%2522%257D"));
        return new TargetPage(driver);
    }
}
