package Task_1_Test.Scenario_1_Test;

import com.google.common.io.Files;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;

public class Task1_BaseTest {
    public WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver=new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.get("https://www.amazon.com/");
        Cookie cookie = new Cookie("session-id", "147-5765903-5960848", ".amazon.com","/", null ,false,false);
        driver.manage().addCookie(cookie);
        driver.navigate().refresh();
        Dimension dimension=new Dimension(1024,768);
        driver.manage().window().setSize(dimension);

    }

    @AfterMethod
    public void recordFailureTest(ITestResult result) {
        if (ITestResult.FAILURE == result.getStatus()) {
            var camera = (TakesScreenshot) driver;
            File screenshot = camera.getScreenshotAs(OutputType.FILE);
            try {
                Files.move(screenshot, new File("resources/ScreenShots/" + result.getName() + ".png"));
            } catch (IOException e) {
                e.getStackTrace();
            }
        }

    }}
