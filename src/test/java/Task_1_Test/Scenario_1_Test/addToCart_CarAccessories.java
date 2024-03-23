package Task_1_Test.Scenario_1_Test;

import Task_1.HomePage;
import Task_1.Sceanrio_1.ItemsPage;
import Task_1.Sceanrio_1.addToCartPage;
import Task_1.Sceanrio_1.cartPage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class addToCart_CarAccessories extends Task1_BaseTest {
    HomePage homePagePage;
    ItemsPage itemsPage;
    addToCartPage addToCartPage;
    cartPage cartPage;
    @Test
    public void carAccessories( ){
    homePagePage =new HomePage(driver);
    homePagePage.dismissChangeAddress();
    itemsPage=homePagePage.enterSearchKey("car accessories ");
    String productTitle_1=itemsPage.getProductTitle_1();
    addToCartPage=itemsPage.selectFirstItem();
    String productBrandName= addToCartPage.getProductBrandName();
    addToCartPage.clickAddToCartButton();
     cartPage=addToCartPage.navigateToCartPage();
    String productTitle_2= cartPage.getProductTitleAfterAddToCart();
    Assert.assertTrue((productBrandName+" "+productTitle_1).contains(productTitle_2.replace("…","")));


    }


}
