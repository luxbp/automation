package com.luxbp.testcases;

import com.luxbp.base.BaseClass;
import com.luxbp.brands.RbleuTest.AddToCartPageRbleuBothTest;
import com.luxbp.brands.RbleuTest.AddToCartPageRbleuSameItemTest;
import com.luxbp.brands.RbleuTest.AddToCartPageRbleuTest;
import com.luxbp.brands.RcoTest.*;
import com.luxbp.brands.RcoTest.AddToCartPageRbleuPointsTest;
import com.luxbp.brands.RcolorTest.AddToCartPageRcolorTest;
import com.luxbp.brands.V76Test.AddToCartPageV76BothTest;
import com.luxbp.brands.V76Test.AddToCartPageV76PointsTest;
import com.luxbp.brands.V76Test.AddToCartPageV76SameItemTest;
import com.luxbp.brands.V76Test.AddToCartPageV76Test;
import org.testng.annotations.Test;

public class AddToCartPageTest extends BaseClass {

    @Test(priority = 1, groups={"AddToCart"}, description = "Order(s) with only R+Co brand products (only retail $)")
    public void addToCartRplusCoDollar() throws Throwable {
        AddToCartPageRplusCoTest rCoDollar= new AddToCartPageRplusCoTest();
        rCoDollar.addToCartPageRplusCoTestDollar();
        }

    @Test(priority = 2, groups={"AddToCart"}, description = "Order(s) with only R+Co brand products (only NFR points product)")
    public void addToCartRplusCoPoints() throws Throwable {
        AddToCartRcoPointsTest redeem = new AddToCartRcoPointsTest();
        redeem.addToCartPageRplusCoTestPoints();
    }

    @Test(priority = 3, groups={"AddToCart"}, description = "Order(s) with only R+Co brand products BOTH")
    public void addToCartRplusCoPointsBoth() throws Throwable {
        AddToCartPageRcoBothTest rCoBoth = new AddToCartPageRcoBothTest();
        rCoBoth.addToCartPageRcoTestBoth();
    }

    @Test(priority = 4, groups={"AddToCart"}, description = "Order(s) with only R+Co brand same product buy from BOTH NFR Point as well as Retail $")
    public void addToCartRplusCoItemBoth() throws Throwable {
        AddToCartPageRcoSameItemBothTest rCoBothMethod = new AddToCartPageRcoSameItemBothTest();
        rCoBothMethod.addToCartPageRcoSameItemBothTest();
    }

    @Test(priority = 5, groups={"AddToCart"}, description = "Order(s) with only R=Bleu brand products")
    public void addToCartRbleuDollar() throws Throwable {
        AddToCartPageRbleuTest rBleu = new AddToCartPageRbleuTest();
        rBleu.addToCartPageRbleuTestDollar();
    }
    @Test(priority = 6, groups={"AddToCart"}, description = "Order(s) with only R-Bleu brand products (only NFR points product)")
    public void AddToCartPageRbleuPointsTest() throws Throwable {
        AddToCartPageRbleuPointsTest rBleuPoints = new AddToCartPageRbleuPointsTest();
        rBleuPoints.AddToCartPageRbleuPointsTest();
    }

    @Test(priority = 7, groups={"AddToCart"}, description = "Order(s) with only R-Bleu brand products BOTH")
    public void AddToCartPageRbleuBothTest() throws Throwable {
        AddToCartPageRbleuBothTest rBleuBoth = new AddToCartPageRbleuBothTest();
        rBleuBoth.addToCartPageRbleuTestBoth();
    }
    @Test(priority = 8, groups={"AddToCart"}, description = "Order(s) with only R-Bleu brand same product BOTH NFR points and retail $")
    public void addToCartPageRbleuSameItemBothTest() throws Throwable {
        AddToCartPageRbleuSameItemTest rBleuSameItem = new AddToCartPageRbleuSameItemTest();
        rBleuSameItem.addToCartPageRbleuSameItemBothTest();
    }

    @Test(priority = 9, groups={"AddToCart"}, description = "Order(s) with only R+Color brand products")
    public void addToCartPageRcolorTestDollar() throws Throwable {
        AddToCartPageRcolorTest rColor = new AddToCartPageRcolorTest();
        rColor.addToCartPageRcolorTestDollar();
    }

    @Test(priority = 10, groups={"AddToCart"}, description = "Order(s) with only V-76 brand products")
    public void addToCartV76Dollar() throws Throwable {
        AddToCartPageV76Test v76 = new AddToCartPageV76Test();
        v76.addToCartPageV76Dollar();
    }

    @Test(priority = 11, groups={"AddToCart"}, description = "Order(s) with only V-76 brand products POINTS")
    public void addToCartV76Points() throws Throwable {
        AddToCartPageV76PointsTest v76Points = new AddToCartPageV76PointsTest();
        v76Points.addToCartPageV76TestPoints();
    }

    @Test(priority = 12, groups={"AddToCart"}, description = "Order(s) with only V-76 brand products BOTH")
    public void addToCartV76Both() throws Throwable {
        AddToCartPageV76BothTest v76Points = new AddToCartPageV76BothTest();
        v76Points.addToCartPageV76TestBoth();
    }
    @Test(priority = 13, groups={"AddToCart"}, description = "Order(s) with only V-76 brand products BOTH")
    public void addToCartPageV76SameItemBothTest() throws Throwable {
        AddToCartPageV76SameItemTest v76Item = new AddToCartPageV76SameItemTest();
        v76Item.addToCartPageV76SameItemBothTest();
    }
}
