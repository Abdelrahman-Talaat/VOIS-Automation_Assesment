package Tests.Scenario_2_Test;

import Pages.AmazonHomePage;
import Pages.Scenario_2.TargetPage;
import Pages.Scenario_2.TodaysDealsPage;
import Tests.Scenario_1_Test.Task1_BaseTest;
import org.testng.annotations.Test;

public class TodayDealsTest extends Task1_BaseTest {
    AmazonHomePage amazonHomePage;
    TodaysDealsPage todaysDealsPage;
    TargetPage targetPage;
    @Test
    public void todaysDeals() throws InterruptedException {
        amazonHomePage =new AmazonHomePage(driver);
        amazonHomePage.dismissChangeAddress();
        todaysDealsPage= amazonHomePage.navigateToTodayDeals();
        todaysDealsPage.checkItems();
        todaysDealsPage.selectDiscountValue();
        targetPage=todaysDealsPage.moveToPage();
        targetPage.selectItem();
        targetPage.clickAddToCart();

    }
}
