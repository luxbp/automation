package com.mystore.testcases;

import com.mystore.base.BaseClass;
import com.mystore.brands.RbleuTest.AddToCartPageRbleuBothTest;
import com.mystore.brands.RbleuTest.AddToCartPageRbleuTest;
import com.mystore.brands.RcoTest.AddToCartPageRbleuPointsTest;
import com.mystore.brands.RcoTest.AddToCartPageRcoBothTest;
import com.mystore.brands.RcoTest.AddToCartPageRplusCoTest;
import com.mystore.brands.RcoTest.AddToCartRcoPointsTest;
import com.mystore.brands.RcolorTest.AddToCartPageRcolorTest;
import com.mystore.brands.V76Test.AddToCartPageV76BothTest;
import com.mystore.brands.V76Test.AddToCartPageV76PointsTest;
import com.mystore.brands.V76Test.AddToCartPageV76Test;
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

    @Test(priority = 4, groups={"AddToCart"}, description = "Order(s) with only R=Bleu brand products")
    public void addToCartRbleuDollar() throws Throwable {
        AddToCartPageRbleuTest rBleu = new AddToCartPageRbleuTest();
        rBleu.addToCartPageRbleuTestDollar();
    }
    @Test(priority = 5, groups={"AddToCart"}, description = "Order(s) with only R-Bleu brand products (only NFR points product)")
    public void AddToCartPageRbleuPointsTest() throws Throwable {
        AddToCartPageRbleuPointsTest rBleuPoints = new AddToCartPageRbleuPointsTest();
        rBleuPoints.AddToCartPageRbleuPointsTest();
    }

    @Test(priority = 6, groups={"AddToCart"}, description = "Order(s) with only R-Bleu brand products BOTH")
    public void AddToCartPageRbleuBothTest() throws Throwable {
        AddToCartPageRbleuBothTest rBleuBoth = new AddToCartPageRbleuBothTest();
        rBleuBoth.addToCartPageRbleuTestBoth();
    }


    @Test(priority = 7, groups={"AddToCart"}, description = "Order(s) with only R+Color brand products")
    public void addToCartPageRcolorTestDollar() throws Throwable {
        AddToCartPageRcolorTest rColor = new AddToCartPageRcolorTest();
        rColor.addToCartPageRcolorTestDollar();
    }

    @Test(priority = 8, groups={"AddToCart"}, description = "Order(s) with only V-76 brand products")
    public void addToCartV76Dollar() throws Throwable {
        AddToCartPageV76Test v76 = new AddToCartPageV76Test();
        v76.addToCartPageV76Dollar();
    }

    @Test(priority = 9, groups={"AddToCart"}, description = "Order(s) with only V-76 brand products POINTS")
    public void addToCartV76Points() throws Throwable {
        AddToCartPageV76PointsTest v76Points = new AddToCartPageV76PointsTest();
        v76Points.addToCartPageV76TestPoints();
    }

    @Test(priority = 10, groups={"AddToCart"}, description = "Order(s) with only V-76 brand products BOTH")
    public void addToCartV76Both() throws Throwable {
        AddToCartPageV76BothTest v76Points = new AddToCartPageV76BothTest();
        v76Points.addToCartPageV76TestBoth();
    }
}
