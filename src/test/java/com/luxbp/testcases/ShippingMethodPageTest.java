package com.luxbp.testcases;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.luxbp.base.BaseClass;
import com.luxbp.pageobjects.ShippingMethod;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ShippingMethodPageTest extends BaseClass {

    @Test(dataProvider = "logincredentials", dataProviderClass = com.luxbp.utility.LuxBPDataProvider.class, description = "Shipping Method Order(s) with only R+Co brand products (only retail $)", groups={"ShippingMethod"})
    public void ShippingMethodTestRplusCo(String username, String password) throws Throwable {
        ShippingInformationPageTest ShippingInfo = new ShippingInformationPageTest();
        ExtentTest shippingMethodRcoDollarReport = extent.createTest("Shipping Method of R+Co brand products (only retail $)","This is to test the shipping method module");

        ShippingInfo.ShippingInformationTestRplusCo(username, password);         //This function validates Shipping Info module\

        shippingMethodRcoDollarReport.log(Status.INFO,"Shipping Information R+Co brand products (only retail $) executed...");

        ShippingMethod shippingMethod = new ShippingMethod();
        shippingMethod.clickFirstContinueBtn();         //This will click the first continue button.
        shippingMethodRcoDollarReport.log(Status.INFO,"Shipping Method R+Co brand products (only retail $) executed ...");

        try {
            String shippingMethodInfo = shippingMethod.validateShippingMethodInfo() ;
            Assert.assertEquals(shippingMethodInfo, "SHIPPING METHOD "+ shippingMethodInfo);
            System.out.println("Shipping Method R+Co brand products (only retail $) info executed Successfully");
            shippingMethodRcoDollarReport.pass("Shipping Method R+Co brand products (only retail $) executed successfully");
        } catch (AssertionError firstContinueBtnException) {
            System.out.println("Shipping Method R+Co brand products (only retail $) failed due to " + firstContinueBtnException);
            shippingMethodRcoDollarReport.fail("Shipping Method R+Co brand products (only retail $) failed to execute"+ firstContinueBtnException);
        }
        shippingMethodRcoDollarReport.info("Shipping Method R+Co brand products (only retail $) ends");
    }

    @Test(dataProvider = "logincredentials", dataProviderClass = com.luxbp.utility.LuxBPDataProvider.class, description = "Shipping Method Order(s) with only R+Co brand products (only NFR points product)", groups={"ShippingMethod"})
    public void ShippingMethodTestRplusCoPoints(String username, String password) throws Throwable {
        ShippingInformationPageTest ShippingInfo = new ShippingInformationPageTest();
        ExtentTest shippingMethodRcoPointsReport = extent.createTest("Shipping Method Order(s) with only R+Co brand products (only NFR points product)","This is to test the shipping method module");

        ShippingInfo.ShippingInformationTestRplusCoPoints(username, password);         //This function validates Shipping Info module\
        shippingMethodRcoPointsReport.log(Status.INFO,"Shipping Info Order(s) with only R+Co brand products (only NFR points product) executed...");

        ShippingMethod shippingMethod = new ShippingMethod();
        shippingMethod.clickFirstContinueBtn();         //This will click the first continue button.
        shippingMethodRcoPointsReport.log(Status.INFO,"Shipping Method Order(s) with only R+Co brand products (only NFR points product) executed...");

        try {
            String shippingMethodInfo = shippingMethod.validateShippingMethodInfo() ;
            Assert.assertEquals(shippingMethodInfo, "SHIPPING METHOD " + shippingMethodInfo);
            System.out.println("Shipping Method Order(s) with only R+Co brand products (only NFR points product) executed Successfully");
            shippingMethodRcoPointsReport.pass("Shipping Method Order(s) with only R+Co brand products (only NFR points product) executed successfully");
        } catch (AssertionError firstContinueBtnException) {
            System.out.println("Shipping Method tab failed due to " + firstContinueBtnException);
            shippingMethodRcoPointsReport.fail("Shipping Method module failed to execute"+ firstContinueBtnException);
        }
        shippingMethodRcoPointsReport.info("Shipping Method Order(s) with only R+Co brand products (only NFR points product) ends");
    }

    @Test(dataProvider = "logincredentials", dataProviderClass = com.luxbp.utility.LuxBPDataProvider.class, description = "Shipping Method Order(s) with only R+Co brand products (both $ and points product)", groups={"ShippingMethod"})
    public void ShippingMethodTestRplusCoBoth(String username, String password) throws Throwable {
        ShippingInformationPageTest ShippingInfo = new ShippingInformationPageTest();
        ExtentTest shippingMethodrcoBothReport = extent.createTest("Shipping Method Order(s) with only R+Co brand products (both $ and points product)","This is to test the shipping method module");
        ShippingInfo.ShippingInformationTestRplusCoBoth(username, password);         //This function validates Shipping Info module\

        shippingMethodrcoBothReport.log(Status.INFO,"Shipping Information Order(s) with only R+Co brand products (both $ and points product) executed...");

        ShippingMethod shippingMethod = new ShippingMethod();
        shippingMethod.clickFirstContinueBtn();         //This will click the first continue button.
        shippingMethodrcoBothReport.log(Status.INFO,"Shipping Method Order(s) with only R+Co brand products (both $ and points product) executed...");

        try {
            String shippingMethodInfo = shippingMethod.validateShippingMethodInfo() ;
            Assert.assertEquals(shippingMethodInfo, "SHIPPING METHOD");
            System.out.println("Shipping Method info executed Successfully " + shippingMethodInfo);
            shippingMethodrcoBothReport.pass("Shipping Method module executed successfully");
        } catch (AssertionError firstContinueBtnException) {
            System.out.println("Shipping Method tab failed due to " + firstContinueBtnException);
            shippingMethodrcoBothReport.fail("Shipping Method module failed to execute"+ firstContinueBtnException);
        }
        shippingMethodrcoBothReport.info("Shipping Method Order(s) with only R+Co brand products (both $ and points product) test ends");
    }

    @Test(dataProvider = "logincredentials", dataProviderClass = com.luxbp.utility.LuxBPDataProvider.class, description = "Shipping Method Order(s) with  R+Co brand SAME product (both $ and points product)", groups={"ShippingMethod"})
    public void ShippingMethodTestRplusCoBothSameItem(String username, String password) throws Throwable {
        ShippingInformationPageTest ShippingInfo = new ShippingInformationPageTest();
        ExtentTest shippingMethodrcoBothReport = extent.createTest("Shipping Method Order(s) with only R+Co brand SAME products (both $ and points product)","This is to test the shipping method module");
        ShippingInfo.ShippingInformationTestRplusCoBothSameItem(username, password);         //This function validates Shipping Info module\

        shippingMethodrcoBothReport.log(Status.INFO,"Shipping Information Order(s) with only R+Co brand SAME products (both $ and points product) executed...");

        ShippingMethod shippingMethod = new ShippingMethod();
        shippingMethod.clickFirstContinueBtn();         //This will click the first continue button.
        shippingMethodrcoBothReport.log(Status.INFO,"Shipping Method Order(s) with only R+Co brand SAME products (both $ and points product) executed...");

        try {
            String shippingMethodInfo = shippingMethod.validateShippingMethodInfo() ;
            Assert.assertEquals(shippingMethodInfo, "SHIPPING METHOD");
            System.out.println("Shipping Method info executed Successfully " + shippingMethodInfo);
            shippingMethodrcoBothReport.pass("Shipping Method module executed successfully");
        } catch (AssertionError firstContinueBtnException) {
            System.out.println("Shipping Method tab failed due to " + firstContinueBtnException);
            shippingMethodrcoBothReport.fail("Shipping Method module failed to execute"+ firstContinueBtnException);
        }
        shippingMethodrcoBothReport.info("Shipping Method Order(s) with only R+Co brand SAME products (both $ and points product) test ends");
    }

    @Test(dataProvider = "logincredentials", dataProviderClass = com.luxbp.utility.LuxBPDataProvider.class, description = "Shipping Method Order(s) with only R-Bleu brand products", groups={"ShippingMethod"})
    public void ShippingMethodTestRBleu(String username, String password) throws Throwable {
        ExtentTest shippingMethodRbleuReport = extent.createTest("Shipping Method Order(s) with only R-Bleu brand products","This is to test the shipping method module");

        ShippingInformationPageTest ShippingInfo = new ShippingInformationPageTest();
        ShippingInfo.ShippingInformationTestRbleu(username, password);         //This function validates Shipping Info module
        shippingMethodRbleuReport.log(Status.INFO,"Shipping Information Order(s) with only R-Bleu brand products executed...");

        ShippingMethod shippingMethod = new ShippingMethod();
        shippingMethod.clickFirstContinueBtn();         //This will click the first continue button.
        shippingMethodRbleuReport.log(Status.INFO,"Shipping Method Order(s) with only R-Bleu brand products executed...");

        try {
            String shippingMethodInfo = shippingMethod.validateShippingMethodInfo() ;
            Assert.assertEquals(shippingMethodInfo, "SHIPPING METHOD");
            System.out.println("Shipping Method Order(s) with only R-Bleu brand products executed Successfully " + shippingMethodInfo);
            shippingMethodRbleuReport.pass("Shipping Method Order(s) with only R-Bleu brand products executed successfully");
        } catch (AssertionError firstContinueBtnException) {
            System.out.println("Shipping Method tab failed due to " + firstContinueBtnException);
            shippingMethodRbleuReport.fail("Shipping Method Order(s) with only R-Bleu brand products failed to execute"+ firstContinueBtnException);
        }
        shippingMethodRbleuReport.info("Shipping Method Order(s) with only R-Bleu brand products test ends");
    }
    @Test(dataProvider = "logincredentials",dataProviderClass = com.luxbp.utility.LuxBPDataProvider.class, description = "Shipping Method Order(s) with only R+Co Bleu brand products (only NFR points product)", groups={"ShippingMethod"})
    public void ShippingMethodTestRBleuPoints(String username, String password) throws Throwable {
        ExtentTest shippingMethodRbleuPointsReport = extent.createTest("Shipping Method Order(s) with only R+Co Bleu brand products (only NFR points product","This is to test the shipping method module");

        ShippingInformationPageTest ShippingInfo = new ShippingInformationPageTest();
        ShippingInfo.ShippingInformationTestRbleuPoints(username, password);         //This function validates Shipping Info module
        shippingMethodRbleuPointsReport.log(Status.INFO,"Shipping Information R+Co Bleu brand products (only NFR points product executed...");


        ShippingMethod shippingMethod = new ShippingMethod();
        shippingMethod.clickFirstContinueBtn();         //This will click the first continue button.
        shippingMethodRbleuPointsReport.log(Status.INFO,"Shipping Method R+Co Bleu brand products (only NFR points product) executed...");

        try {
            String shippingMethodInfo = shippingMethod.validateShippingMethodInfo() ;
            Assert.assertEquals(shippingMethodInfo, "SHIPPING METHOD");
            System.out.println("Shipping Method info executed Successfully " + shippingMethodInfo);
            shippingMethodRbleuPointsReport.pass("Shipping Method R+Co Bleu brand products (only NFR points product) executed successfully");
        } catch (AssertionError firstContinueBtnException) {
            System.out.println("Shipping Method R+Co Bleu brand products (only NFR points product) failed due to " + firstContinueBtnException);
            shippingMethodRbleuPointsReport.fail("Shipping Method R+Co Bleu brand products (only NFR points product) failed to execute"+ firstContinueBtnException);
        }
        shippingMethodRbleuPointsReport.info("Shipping Method R+Co Bleu brand products (only NFR points product) test ends");
    }

    @Test(dataProvider = "logincredentials", dataProviderClass = com.luxbp.utility.LuxBPDataProvider.class, description = "Shipping Method Order(s) with only R+Co Bleu brand products (both $ and points product)", groups={"ShippingMethod"})
    public void ShippingInformationTestRbleuBoth(String username, String password) throws Throwable {
        ExtentTest shippingMethodRbleuBothReport = extent.createTest("Shipping Method Order(s) with only R+Co Bleu brand products (both $ and points product)","This is to test the shipping method module");

        ShippingInformationPageTest ShippingInfo = new ShippingInformationPageTest();
        ShippingInfo.ShippingInformationTestRbleuBoth(username, password);         //This function validates Shipping Info module
        shippingMethodRbleuBothReport.log(Status.INFO,"Shipping Information R+Co Bleu brand products (both $ and points product executed...");


        ShippingMethod shippingMethod = new ShippingMethod();
        shippingMethod.clickFirstContinueBtn();         //This will click the first continue button.
        shippingMethodRbleuBothReport.log(Status.INFO,"Shipping Method R+Co Bleu brand products (both $ and points product executed...");

        try {
            String shippingMethodInfo = shippingMethod.validateShippingMethodInfo() ;
            Assert.assertEquals(shippingMethodInfo, "SHIPPING METHOD");
            System.out.println("Shipping Method executed Successfully  "+ shippingMethodInfo );
            shippingMethodRbleuBothReport.pass("Shipping Method R+Co Bleu brand products (both $ and points product executed successfully");
        } catch (AssertionError firstContinueBtnException) {
            System.out.println("Shipping Method R+Co Bleu brand products (both $ and points product failed due to " + firstContinueBtnException);
            shippingMethodRbleuBothReport.fail("Shipping Method R+Co Bleu brand products (both $ and points product failed to execute"+ firstContinueBtnException);
        }
        shippingMethodRbleuBothReport.info("Shipping Method R+Co Bleu brand products (both $ and points product test ends");
    }

    @Test(dataProvider = "logincredentials", dataProviderClass = com.luxbp.utility.LuxBPDataProvider.class, description = "Shipping Method Order(s) with  Rbleu brand SAME product (both $ and points product)", groups={"ShippingMethod"})
    public void ShippingMethodTestRbleuBothSameItem(String username ,String password) throws Throwable {
        ShippingInformationPageTest ShippingInfo = new ShippingInformationPageTest();
        ExtentTest shippingMethodrcoBothReport = extent.createTest("Shipping Method Order(s) with only R+Co brand SAME products (both $ and points product)","This is to test the shipping method module");
        ShippingInfo.ShippingInformationTestRbleuBothSameItem(username, password);         //This function validates Shipping Info module\

        shippingMethodrcoBothReport.log(Status.INFO,"Shipping Information Order(s) with only Rbleu brand SAME products (both $ and points product) executed...");

        ShippingMethod shippingMethod = new ShippingMethod();
        shippingMethod.clickFirstContinueBtn();         //This will click the first continue button.
        shippingMethodrcoBothReport.log(Status.INFO,"Shipping Method Order(s) with only Rbleu SAME products (both $ and points product) executed...");

        try {
            String shippingMethodInfo = shippingMethod.validateShippingMethodInfo() ;
            Assert.assertEquals(shippingMethodInfo, "SHIPPING METHOD");
            System.out.println("Shipping Method info executed Successfully " + shippingMethodInfo);
            shippingMethodrcoBothReport.pass("Shipping Method module executed successfully");
        } catch (AssertionError firstContinueBtnException) {
            System.out.println("Shipping Method tab failed due to " + firstContinueBtnException);
            shippingMethodrcoBothReport.fail("Shipping Method module failed to execute"+ firstContinueBtnException);
        }
        shippingMethodrcoBothReport.info("Shipping Method Order(s) with only Rbleu SAME products (both $ and points product) test ends");
    }

    @Test(dataProvider = "logincredentials",dataProviderClass = com.luxbp.utility.LuxBPDataProvider.class, description = "Shipping Method Order(s) with only R+Color brand products", groups={"ShippingMethod"})
    public void ShippingInformationTestRcolor(String username, String password) throws Throwable {
        ExtentTest shippingMethodRcolorReport = extent.createTest("Shipping Method Order(s) with only R+Color brand products","This is to test the shipping method module");

        ShippingInformationPageTest ShippingInfo = new ShippingInformationPageTest();
        ShippingInfo.ShippingInformationTestRcolor(username, password);         //This function validates Shipping Info module
        shippingMethodRcolorReport.log(Status.INFO,"Shipping Information Order(s) with only R+Color brand products executed...");

        ShippingMethod shippingMethod = new ShippingMethod();
        shippingMethod.clickFirstContinueBtn();         //This will click the first continue button.
        shippingMethodRcolorReport.log(Status.INFO,"Shipping Method Order(s) with only R+Color brand products executed...");

        try {
            String shippingMethodInfo = shippingMethod.validateShippingMethodInfo() ;
            Assert.assertEquals(shippingMethodInfo, "SHIPPING METHOD");
            System.out.println("Shipping Method info executed Successfully " + shippingMethodInfo);
            shippingMethodRcolorReport.pass("Shipping Method Order(s) with only R+Color brand products executed successfully");
        } catch (AssertionError firstContinueBtnException) {
            System.out.println("Shipping Method Order(s) with only R+Color brand products failed due to " + firstContinueBtnException);
            shippingMethodRcolorReport.fail("Shipping Method Order(s) with only R+Color brand products failed to execute"+ firstContinueBtnException);
        }
        shippingMethodRcolorReport.info("Shipping Method Order(s) with only R+Color brand products test ends");
    }
    @Test(dataProvider = "logincredentials", dataProviderClass = com.luxbp.utility.LuxBPDataProvider.class, description = "Shipping Method Order(s) with only V-76 brand products", groups={"ShippingMethod"})
    public void ShippingInformationTestV76(String username, String password) throws Throwable {
        ExtentTest shippingMethodV76Report = extent.createTest("Shipping Method Order(s) with only V-76 brand products","This is to test the shipping method module");

        ShippingInformationPageTest ShippingInfo = new ShippingInformationPageTest();
        ShippingInfo.ShippingInformationTestV76(username, password);         //This function validates Shipping Info module
        shippingMethodV76Report.log(Status.INFO,"Shipping Information Order(s) with only V-76 brand products executed...");


        ShippingMethod shippingMethod = new ShippingMethod();
        shippingMethod.clickFirstContinueBtn();         //This will click the first continue button.
        shippingMethodV76Report.log(Status.INFO,"Shipping Method Order(s) with only V-76 brand products executed...");

        try {
            String shippingMethodInfo = shippingMethod.validateShippingMethodInfo() ;
            Assert.assertEquals(shippingMethodInfo, "SHIPPING METHOD");
            System.out.println("Shipping Method info executed Successfully " + shippingMethodInfo);
            shippingMethodV76Report.pass("Shipping Method Order(s) with only V-76 brand products executed successfully");
        } catch (AssertionError firstContinueBtnException) {
            System.out.println("Shipping Method Order(s) with only V-76 brand products failed due to " + firstContinueBtnException);
            shippingMethodV76Report.fail("Shipping Method Order(s) with only V-76 brand products failed to execute"+ firstContinueBtnException);
        }
        shippingMethodV76Report.info("Shipping Method Order(s) with only V-76 brand products test ends");
    }
    @Test(dataProvider = "logincredentials", dataProviderClass = com.luxbp.utility.LuxBPDataProvider.class, description = "Shipping Method Order(s) with only V-76 brand products POINTS", groups={"ShippingMethod"})
    public void ShippingInformationTestV76Points(String username, String password) throws Throwable {
        ExtentTest shippingMethodV76PointsReport = extent.createTest("Shipping Method Order(s) with only V-76 brand products POINTS","This is to test the shipping method module");

        ShippingInformationPageTest ShippingInfo = new ShippingInformationPageTest();
        ShippingInfo.ShippingInformationTestV76Points(username, password);         //This function validates Shipping Info module
        shippingMethodV76PointsReport.log(Status.INFO,"Shipping Information Order(s) with only V-76 brand products POINTS executed...");


        ShippingMethod shippingMethod = new ShippingMethod();
        shippingMethod.clickFirstContinueBtn();         //This will click the first continue button.
        shippingMethodV76PointsReport.log(Status.INFO,"Shipping Method Order(s) with only V-76 brand products POINTS executed...");

        try {
            String shippingMethodInfo = shippingMethod.validateShippingMethodInfo() ;
            Assert.assertEquals(shippingMethodInfo, "SHIPPING METHOD");
            System.out.println("Shipping Method info executed Successfully " + shippingMethodInfo);
            shippingMethodV76PointsReport.pass("Shipping Method Order(s) with only V-76 brand products POINTS executed successfully");
        } catch (AssertionError firstContinueBtnException) {
            System.out.println("Shipping Method Order(s) with only V-76 brand products POINTS failed due to " + firstContinueBtnException);
            shippingMethodV76PointsReport.fail("Shipping Method Order(s) with only V-76 brand products POINTS failed to execute"+ firstContinueBtnException);
        }
        shippingMethodV76PointsReport.info("Shipping Method Order(s) with only V-76 brand products POINTS test ends");
    }

    @Test(dataProvider = "logincredentials", dataProviderClass = com.luxbp.utility.LuxBPDataProvider.class, description = "Shipping Method Order(s) with only V-76 brand products BOTH", groups={"ShippingMethod"})
    public void ShippingInformationTestV76Both(String username, String password) throws Throwable {
        ExtentTest shippingMethodV76BothReport = extent.createTest("Shipping Method Order(s) with only V-76 brand products BOTH","This is to test the shipping method module");

        ShippingInformationPageTest ShippingInfo = new ShippingInformationPageTest();
        ShippingInfo.ShippingInformationTestV76Both(username, password);         //This function validates Shipping Info module
        shippingMethodV76BothReport.log(Status.INFO,"Shipping Information Order(s) with only V-76 brand products BOTH executed...");


        ShippingMethod shippingMethod = new ShippingMethod();
        shippingMethod.clickFirstContinueBtn();         //This will click the first continue button.
        shippingMethodV76BothReport.log(Status.INFO,"Shipping Method Order(s) with only V-76 brand products BOTH executed...");

        try {
            String shippingMethodInfo = shippingMethod.validateShippingMethodInfo() ;
            Assert.assertEquals(shippingMethodInfo, "SHIPPING METHOD");
            System.out.println("Shipping Method info executed Successfully "+ shippingMethodInfo);
            shippingMethodV76BothReport.pass("Shipping Method Order(s) with only V-76 brand products BOTH executed successfully");
        } catch (AssertionError firstContinueBtnException) {
            System.out.println("Shipping Method Order(s) with only V-76 brand products BOTH failed due to " + firstContinueBtnException);
            shippingMethodV76BothReport.fail("Shipping Method Order(s) with only V-76 brand products BOTH failed to execute"+ firstContinueBtnException);
        }
        shippingMethodV76BothReport.info("Shipping Method Order(s) with only V-76 brand products BOTH test ends");
    }
    @Test(dataProvider = "logincredentials", dataProviderClass = com.luxbp.utility.LuxBPDataProvider.class, description = "Shipping Method Order(s) with V76 brand SAME product (both $ and points product)", groups={"ShippingMethod"})
    public void ShippingMethodTestV76BothSameItem(String username, String password) throws Throwable {
        ShippingInformationPageTest ShippingInfo = new ShippingInformationPageTest();
        ExtentTest shippingMethodrcoBothReport = extent.createTest("Shipping Method Order(s) with only V76 brand SAME products (both $ and points product)","This is to test the shipping method module");
        ShippingInfo.ShippingInformationTestV76BothSameItem(username, password);         //This function validates Shipping Info module\

        shippingMethodrcoBothReport.log(Status.INFO,"Shipping Information Order(s) with only V76 brand SAME products (both $ and points product) executed...");

        ShippingMethod shippingMethod = new ShippingMethod();
        shippingMethod.clickFirstContinueBtn();         //This will click the first continue button.
        shippingMethodrcoBothReport.log(Status.INFO,"Shipping Method Order(s) with only V76 brand SAME products (both $ and points product) executed...");

        try {
            String shippingMethodInfo = shippingMethod.validateShippingMethodInfo() ;
            Assert.assertEquals(shippingMethodInfo, "SHIPPING METHOD");
            System.out.println("Shipping Method info executed Successfully " + shippingMethodInfo);
            shippingMethodrcoBothReport.pass("Shipping Method module executed successfully");
        } catch (AssertionError firstContinueBtnException) {
            System.out.println("Shipping Method tab failed due to " + firstContinueBtnException);
            shippingMethodrcoBothReport.fail("Shipping Method module failed to execute"+ firstContinueBtnException);
        }
        shippingMethodrcoBothReport.info("Shipping Method Order(s) with only V76 brand SAME products (both $ and points product) test ends");
    }
}
