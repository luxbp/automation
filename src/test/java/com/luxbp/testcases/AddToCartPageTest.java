package com.luxbp.testcases;

import com.luxbp.base.BaseClass;
import com.luxbp.brands.RbleuTest.AddToCartPageRbleuBothTest;
import com.luxbp.brands.RbleuTest.AddToCartPageRbleuSameItemTest;
import com.luxbp.brands.RbleuTest.AddToCartPageRbleuTest;
import com.luxbp.brands.RcoTest.*;
import com.luxbp.brands.RbleuTest.AddToCartPageRbleuPointsTest;
import com.luxbp.brands.RcolorTest.AddToCartPageRcolorTest;
import com.luxbp.brands.V76Test.AddToCartPageV76BothTest;
import com.luxbp.brands.V76Test.AddToCartPageV76PointsTest;
import com.luxbp.brands.V76Test.AddToCartPageV76SameItemTest;
import com.luxbp.brands.V76Test.AddToCartPageV76Test;
import org.testng.annotations.Test;

public class AddToCartPageTest extends BaseClass {

    @Test(priority = 1, dataProvider = "logincredentials", dataProviderClass = com.luxbp.utility.LuxBPDataProvider.class, groups = {"AddToCart"}, description = "Order(s) with only R+Co brand products (only retail $)")
    public void addToCartRplusCoDollar(String username, String password) throws Throwable {
        AddToCartPageRplusCoTest rCoDollar = new AddToCartPageRplusCoTest();
        rCoDollar.addToCartPageRplusCoTestDollar(username, password);
    }

    @Test(priority = 2, groups = {"AddToCart"}, dataProvider = "logincredentials", dataProviderClass = com.luxbp.utility.LuxBPDataProvider.class,description = "Order(s) with only R+Co brand products (only NFR points product)")
    public void addToCartRplusCoPoints(String username, String password) throws Throwable {
        AddToCartRcoPointsTest redeem = new AddToCartRcoPointsTest();
        redeem.addToCartPageRplusCoTestPoints(username, password);
    }

    @Test(priority = 3, dataProvider = "logincredentials", dataProviderClass = com.luxbp.utility.LuxBPDataProvider.class,groups = {"AddToCart"}, description = "Order(s) with only R+Co brand products BOTH")
    public void addToCartRplusCoPointsBoth(String username, String password) throws Throwable {
        AddToCartPageRcoBothTest rCoBoth = new AddToCartPageRcoBothTest();
        rCoBoth.addToCartPageRcoTestBoth(username, password);
    }

    @Test(priority = 4, groups = {"AddToCart"}, dataProvider = "logincredentials", dataProviderClass = com.luxbp.utility.LuxBPDataProvider.class,description = "Order(s) with only R+Co brand same product buy from BOTH NFR Point as well as Retail $")
    public void addToCartRplusCoItemBoth(String username, String password) throws Throwable {
        AddToCartPageRcoSameItemBothTest rCoBothMethod = new AddToCartPageRcoSameItemBothTest();
        rCoBothMethod.addToCartPageRcoSameItemBothTest(username, password);
    }

    @Test(priority = 5, groups = {"AddToCart"}, dataProvider = "logincredentials", dataProviderClass = com.luxbp.utility.LuxBPDataProvider.class,description = "Order(s) with only R=Bleu brand products")
    public void addToCartRbleuDollar(String username, String password) throws Throwable {
        AddToCartPageRbleuTest rBleu = new AddToCartPageRbleuTest();
        rBleu.addToCartPageRbleuTestDollar(username, password);
    }

    @Test(priority = 6, groups = {"AddToCart"}, dataProvider = "logincredentials", dataProviderClass = com.luxbp.utility.LuxBPDataProvider.class,description = "Order(s) with only R-Bleu brand products (only NFR points product)")
    public void AddToCartPageRbleuPointsTest(String username, String password) throws Throwable {
        AddToCartPageRbleuPointsTest rBleuPoints = new AddToCartPageRbleuPointsTest();
        rBleuPoints.AddToCartPageRbleuPointTest(username, password);
    }

    @Test(priority = 7, groups = {"AddToCart"},dataProvider = "logincredentials", dataProviderClass = com.luxbp.utility.LuxBPDataProvider.class, description = "Order(s) with only R-Bleu brand products BOTH")
    public void AddToCartPageRbleuBothTest(String username, String password) throws Throwable {
        AddToCartPageRbleuBothTest rBleuBoth = new AddToCartPageRbleuBothTest();
        rBleuBoth.addToCartPageRbleuTestBoth(username, password);
    }

    @Test(priority = 8, groups = {"AddToCart"}, dataProvider = "logincredentials", dataProviderClass = com.luxbp.utility.LuxBPDataProvider.class,description = "Order(s) with only R-Bleu brand same product BOTH NFR points and retail $")
    public void addToCartPageRbleuSameItemBothTest(String username ,String password) throws Throwable {
        AddToCartPageRbleuSameItemTest rBleuSameItem = new AddToCartPageRbleuSameItemTest();
        rBleuSameItem.addToCartPageRbleuSameItemBothTest(username, password);
    }

    @Test(priority = 9, groups = {"AddToCart"}, dataProvider = "logincredentials", dataProviderClass = com.luxbp.utility.LuxBPDataProvider.class, description = "Order(s) with only R+Color brand products")
    public void addToCartPageRcolorTestDollar(String username, String password) throws Throwable {
        AddToCartPageRcolorTest rColor = new AddToCartPageRcolorTest();
        rColor.addToCartPageRcolorTestDollar(username, password);
    }

    @Test(priority = 10, groups = {"AddToCart"}, dataProvider = "logincredentials", dataProviderClass = com.luxbp.utility.LuxBPDataProvider.class,description = "Order(s) with only V-76 brand products")
    public void addToCartV76Dollar(String username, String password) throws Throwable {
        AddToCartPageV76Test v76 = new AddToCartPageV76Test();
        v76.addToCartPageV76Dollar(username, password);
    }

    @Test(priority = 11, groups = {"AddToCart"}, dataProvider = "logincredentials",dataProviderClass = com.luxbp.utility.LuxBPDataProvider.class,description = "Order(s) with only V-76 brand products POINTS")
    public void addToCartV76Points(String username, String password) throws Throwable {
        AddToCartPageV76PointsTest v76Points = new AddToCartPageV76PointsTest();
        v76Points.addToCartPageV76TestPoints(username, password);
    }

    @Test(dataProvider = "logincredentials", dataProviderClass = com.luxbp.utility.LuxBPDataProvider.class,priority = 12, groups = {"AddToCart"}, description = "Order(s) with only V-76 brand products BOTH")
    public void addToCartV76Both(String username, String password) throws Throwable {
        AddToCartPageV76BothTest v76Points = new AddToCartPageV76BothTest();
        v76Points.addToCartPageV76TestBoth(username, password);
    }

    @Test(dataProvider = "logincredentials", dataProviderClass = com.luxbp.utility.LuxBPDataProvider.class,priority = 13, groups = {"AddToCart"}, description = "Order(s) with only V-76 brand products BOTH")
    public void addToCartPageV76SameItemBothTest(String username,String password) throws Throwable {
        AddToCartPageV76SameItemTest v76Item = new AddToCartPageV76SameItemTest();
        v76Item.addToCartPageV76SameItemBothTest(username, password);
    }
}
