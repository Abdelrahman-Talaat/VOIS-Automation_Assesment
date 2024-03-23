package Task_1_Test.Scenario_2_Test;

import Task_1.HomePage;
import Task_1.Scenario_2.TargetPage;
import Task_1.Scenario_2.todaysDealsPage;
import Task_1_Test.Scenario_1_Test.Task1_BaseTest;
import org.testng.annotations.Test;

public class todayDealsTest extends Task1_BaseTest {
    HomePage homePage;
    todaysDealsPage todaysDealsPage;
    TargetPage targetPage;
    @Test
    public void todaysDeals() throws InterruptedException {
        homePage=new HomePage(driver);
        homePage.dismissChangeAddress();
        todaysDealsPage=homePage.navigateToTodayDeals();
        todaysDealsPage.checkItems();
        todaysDealsPage.selectDiscountValue();
        targetPage=todaysDealsPage.moveToPage();
        targetPage.selectItem();
        targetPage.clickAddToCart();

    }
}
