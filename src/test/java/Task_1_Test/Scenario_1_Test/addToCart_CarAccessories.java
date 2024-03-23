package Task_1_Test.Scenario_1_Test;

import Task_1.Sceanrio_1.carAccessories;
import org.testng.Assert;
import org.testng.annotations.Test;


public class addToCart_CarAccessories extends Task1_BaseTest {
    carAccessories carAccessoriesPage;
    @Test
    public void carAccessories( String searchKey){
    carAccessoriesPage=new carAccessories(driver);
    carAccessoriesPage.dismissChangeAddress();
    carAccessoriesPage.enterSearchKey("car accessories ");
    String productTitle_1=carAccessoriesPage.getProductTitle_1();
    carAccessoriesPage.selectFirstItem();
    String productBrandName= carAccessoriesPage.getProductBrandName();
    carAccessoriesPage.clickAddToCartButton();
    carAccessoriesPage.navigateToCartPage();
    String productTitle_2=carAccessoriesPage.getProductTitleAfterAddToCart();
    Assert.assertTrue((productBrandName+" "+productTitle_1).contains(productTitle_2.replace("…","")));


    }


}
