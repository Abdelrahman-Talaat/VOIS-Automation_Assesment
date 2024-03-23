package Task_2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class bookSeatPage {
    private WebDriver driver;
    JavascriptExecutor js;
    By popularRoute =By.id("fromPlaceName");

    By selectPopularRoute=By.xpath("//*[@id='routeSlider']/div[1]/div[2]/div[1]/div[1]/ul[1]/li[1]/a[1]");
    By sliderButton=By.xpath("//*[@id='routeSlider']/div[1]/a[2]/span[1]");
    By selectDate=By.xpath("//tr //td [2]//a[@class='ui-state-default']");
    By searchButton=By.xpath("//form[@id='bookingsForm']/div[1]/div[1]/div[2]/div[3]/button[1]");
    By selectSeatButton=By.id("//div[@class='select-service']//input[@id='SrvcSelectBtnForward0']");

    By coroverCloseBtn=By.xpath("//div[@id='corover-close-btn']");
    public bookSeatPage (WebDriver driver){
        this.driver=driver;
        js= (JavascriptExecutor) driver;
    }

    public void scrollDown()  {

        js.executeScript("arguments[0].scrollIntoView()",driver.findElement(popularRoute));

    }
    public void SelectPopularRoute( ) throws InterruptedException {
        driver.findElement(sliderButton).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(selectPopularRoute));
       driver.findElement(selectPopularRoute).click();
    }
    public void selectDate(){
        driver.findElement(selectDate).click();
    }
    public void clickSearchButton() throws InterruptedException {
        driver.findElement(searchButton).click();
        driver.findElement(coroverCloseBtn).click();
        Thread.sleep(4);
        driver.findElement(selectSeatButton).isDisplayed();
    }
    public void clickSelectSeat(){

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(selectSeatButton));
        driver.findElement(selectSeatButton).click();
    }


}
