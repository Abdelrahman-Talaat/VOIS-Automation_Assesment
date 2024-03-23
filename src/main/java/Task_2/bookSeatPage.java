package Task_2;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.NoSuchElementException;

public class bookSeatPage {
    private WebDriver driver;
    JavascriptExecutor js;
    By popularRoute =By.id("fromPlaceName");

    By selectPopularRoute=By.xpath("//*[@id='routeSlider']/div[1]/div[2]/div[1]/div[1]/ul[1]/li[1]/a[1]");
    By sliderButton=By.xpath("//*[@id='routeSlider']/div[1]/a[2]/span[1]");
        By selectDate=By.xpath("//tr //td [7]//a[@class='ui-state-default']");
    By searchButton=By.xpath("//form[@id='bookingsForm']/div[1]/div[1]/div[2]/div[3]/button[1]");
    By selectSeatButton=By.xpath("//div[@class='select-service']//input[@id='SrvcSelectBtnForward0']");
    By coroverCloseBtn=By.xpath("//div[@id='corover-close-btn']");
    By customerDetailsTab=By.xpath("//a[@id='Forwardprofile-tab']");
    By mobileNoLabel=By.xpath("//label[@for='mobileNo']");
    By mobileNoField=By.xpath("//input[@name='mobileNo']");
    By emailIdField=By.xpath("//input[@name='email']");
    By selectSeat=By.xpath("(//li[@class='availSeatClassS'])[10]");
    By checkAgreementsBox=By.xpath("//input[@id='termsChk']");
    By makePaymentBtn=By.id("PgBtn");
    By gender=By.cssSelector("[value='25']");
    By passengerName=By.id("passengerNameForward0");
    By PassengerAge=By.id("passengerAgeForward0");
    By selectConcession=By.xpath("(//option[@value='1466060086837'])[1]");
    By UPI_QrBtn=By.xpath("//button[@method='upi']");
    By cardBtn=By.xpath("//button[@method='card']");
    By netBankingBtn=By.xpath("//button[@method='netbanking']");
    By walletBtn=By.xpath("//button[@method='wallet']");
    By UPI_IDBtn=By.id("upi-collect-list");
    By enterUpID=By.xpath("//input[@name='vpa-upi']");
    By backBtn=By.xpath("(//div[@id='header-wrapper']//div//div//span)[1]");
    By creditNumberField=By.xpath("//input[@name='card[number]']");
    By selectBank=By.id("bank-radio-SBIN");
    By selectWalletType=By.id("wallet-radio-amazonpay");


    public bookSeatPage (WebDriver driver){
        this.driver=driver;
        js= (JavascriptExecutor) driver;
    }

    public void scrollDown()  {

        js.executeScript("arguments[0].scrollIntoView()",driver.findElement(popularRoute));

    }
    public void SelectPopularRoute( ) {
        driver.findElement(sliderButton).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(selectPopularRoute));
       driver.findElement(selectPopularRoute).click();

    }
    public void selectDate(){
        driver.findElement(coroverCloseBtn).click();
        FluentWait wait=new FluentWait<>(driver).withTimeout(Duration.ofSeconds(5))
                .pollingEvery(Duration.ofSeconds(1)).ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.presenceOfElementLocated(selectDate));
        js.executeScript("arguments[0].click()",driver.findElement(selectDate));
    }
    public void clickSearchButton()  {
        driver.findElement(searchButton).click();
        driver.findElement(coroverCloseBtn).click();

    }
    public void clickSelectSeat(){

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(selectSeatButton));
        driver.findElement(selectSeatButton).click();
    }
    public void navigateToCustomerDetailsTab(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(customerDetailsTab));
        driver.findElement(customerDetailsTab).click();
        wait.until(ExpectedConditions.elementToBeClickable(mobileNoLabel));
    }
    public void enterCustomerData(String mobileNo , String email){
        driver.findElement(mobileNoField).sendKeys(mobileNo);
        driver.findElement(emailIdField).sendKeys(email);


    }
    public void selectSeat(){
        driver.findElement(selectSeat).click();
    }
    public void enterPassengerDetails( String passName , String passAge){
        driver.findElement(passengerName).sendKeys(passName);
        driver.findElement(gender).click();
        driver.switchTo().alert().dismiss();
        driver.findElement(PassengerAge).sendKeys(passAge);
        driver.findElement(selectConcession).click();
    }
    public void CheckAgreementsBox(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(checkAgreementsBox));
        driver.findElement(checkAgreementsBox).click();
    }
    public void clickMakePaymentBtn(){
        driver.findElement(makePaymentBtn).click();
    }
    public void fillPaymentData(String UpID, String CCNo){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(UPI_QrBtn));
        js.executeScript("arguments[0].click()",driver.findElement(UPI_QrBtn));
        /*driver.findElement(UPI_IDBtn).click();
        driver.findElement(enterUpID).sendKeys( UpID);
        driver.findElement(backBtn).click();
        driver.findElement(cardBtn).click();
        driver.findElement(creditNumberField).sendKeys(CCNo);
        driver.findElement(backBtn).click();
        driver.findElement(netBankingBtn).click();
        driver.findElement(selectBank).click();
        driver.findElement(backBtn).click();
        driver.findElement(walletBtn).click();
        driver.findElement(selectWalletType).click();
        driver.findElement(backBtn).click();*/

    }
}
