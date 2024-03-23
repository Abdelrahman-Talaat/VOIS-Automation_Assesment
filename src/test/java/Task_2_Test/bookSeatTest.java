package Task_2_Test;

import Task_2.bookSeatPage;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class bookSeatTest extends Task_2_BaseTest{
    bookSeatPage bookSeatPage;
    @Test
    public void bookSeat()  {
      bookSeatPage=new bookSeatPage(driver);
      bookSeatPage.scrollDown();
      bookSeatPage.SelectPopularRoute();
      bookSeatPage.selectDate();
      bookSeatPage.clickSearchButton();
      bookSeatPage.clickSelectSeat();
      bookSeatPage.navigateToCustomerDetailsTab();
      bookSeatPage.enterCustomerData("6789125987","abdelrahmantalaat@gmail.com");
      bookSeatPage.selectSeat();
      bookSeatPage.enterPassengerDetails("Abdelrahman","20");
      bookSeatPage.CheckAgreementsBox();
      bookSeatPage.clickMakePaymentBtn();
      bookSeatPage.fillPaymentData("6789125987","123456789012");
    }
}
