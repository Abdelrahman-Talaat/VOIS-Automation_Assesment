package Task_1_Test.Scenario_2_Test;

import Task_1_Test.Scenario_1_Test.Task1_BaseTest;
import Task_1.Scenario_2.todaysDeals;
import org.testng.annotations.Test;

public class todayDealsTest extends Task1_BaseTest {
    todaysDeals todaysDealsPage;
    @Test
    public void todaysDeals() throws InterruptedException {
        todaysDealsPage=new todaysDeals(driver);
        todaysDealsPage.dismissChangeAddress();
        todaysDealsPage.navigateToTodayDeals();
        todaysDealsPage.checkItems();
        todaysDealsPage.selectDiscountValue();
        Thread.sleep(5);
        todaysDealsPage.scrollDown();
       todaysDealsPage.moveToPage();


    }
}
