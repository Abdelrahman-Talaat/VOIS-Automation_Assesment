package Task_2_Test;

import Task_2.bookSeatPage;
import org.testng.annotations.Test;

public class bookSeatTest extends Task_2_BaseTest{
    bookSeatPage bookSeatPage;
    @Test
    public void bookSeat() throws InterruptedException {
      bookSeatPage=new bookSeatPage(driver);
      bookSeatPage.scrollDown();
      bookSeatPage.SelectPopularRoute();
      bookSeatPage.selectDate();
      bookSeatPage.clickSearchButton();
      bookSeatPage.clickSelectSeat();
    }
}
