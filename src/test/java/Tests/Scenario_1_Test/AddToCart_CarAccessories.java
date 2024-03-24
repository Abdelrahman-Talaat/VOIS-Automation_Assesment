package Tests.Scenario_1_Test;

import Pages.AmazonHomePage;
import Pages.Sceanrio_1.ItemsPage;
import Pages.Sceanrio_1.AddToCartPage;
import Pages.Sceanrio_1.CartPage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class AddToCart_CarAccessories extends Task1_BaseTest {
    AmazonHomePage amazonHomePagePage;
    ItemsPage itemsPage;
    AddToCartPage addToCartPage;
    CartPage cartPage;
    ReadJson readJson;
    String searchKey;

    @Test (description = " GC - testing add to cart functionality")
    public void carAccessories( ){
    readJson = new ReadJson();
    searchKey =  readJson.getJsonValue("resources/serchKey.json" , "searchKey");
    amazonHomePagePage =new AmazonHomePage(driver);
    amazonHomePagePage.dismissChangeAddress();
    itemsPage= amazonHomePagePage.enterSearchKey(searchKey);
    String productTitle_1=itemsPage.getProductTitle_1();
    addToCartPage=itemsPage.selectFirstItem();
    String productBrandName= addToCartPage.getProductBrandName();
    addToCartPage.clickAddToCartButton();
     cartPage=addToCartPage.navigateToCartPage();
    String productTitle_2= cartPage.getProductTitleAfterAddToCart();
    Assert.assertTrue((productBrandName+" "+productTitle_1).contains(productTitle_2.replace("…","")),"Product added to cart doesn't match with the selected one");

    }


}
