package Tests.Scenario_2_Test;

import Pages.AmazonHomePage;
import Pages.Scenario_2.TargetPage;
import Pages.Scenario_2.TodaysDealsPage;
import Tests.BaseTest;
import org.testng.annotations.Test;

public class TodayDealsTest extends BaseTest {
    AmazonHomePage amazonHomePage;
    TodaysDealsPage todaysDealsPage;
    TargetPage targetPage;
    @Test(description = " GC - testing add to cart functionality from today's deals page")
    public void todaysDeals()  {
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
