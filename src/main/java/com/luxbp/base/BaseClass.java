package com.luxbp.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.*;
import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseClass {
    public static Properties prop;
    public static WebDriver driver;
    protected static ThreadLocal<ChromeDriver> driver1 = new ThreadLocal<>();
    public static ExtentReports extent;
    static ExtentSparkReporter reporter;
    static ExtentTest BrowserTest;


    @BeforeSuite
    public void startReport(){
        extent = new ExtentReports();
        reporter = new ExtentSparkReporter("target/Test-Output/Report.html");
        extent.attachReporter(reporter);
    }
    @BeforeMethod
    public static void launchApp() {
        loadConfig();
        BrowserTest = extent.createTest("Browser test", "This is to test if browser opened successfully");
        WebDriverManager.chromedriver().setup();
        String browserName = prop.getProperty("BrowserType");

        if (browserName.equalsIgnoreCase("Chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            BrowserTest.log(Status.INFO, "Starting Chrome Browser");
            BrowserTest.pass("Chrome Browser opened successfully");
            BrowserTest.fail("Other Browser not opened");
        } else if (browserName.equalsIgnoreCase("FireFox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
            BrowserTest.log(Status.INFO, "Starting Firefox Browser");
            BrowserTest.pass("Firefox Browser opened successfully");
            BrowserTest.fail("Other Browser not opened");
        } else if (browserName.equalsIgnoreCase("IE")) {
            WebDriverManager.iedriver().setup();
            driver = new InternetExplorerDriver();
            BrowserTest.log(Status.INFO, "Starting Internet Explorer Browser");
            BrowserTest.pass("Internet Explorer Browser opened successfully");
            BrowserTest.fail("Other Browser not opened");
        }
        else if (browserName.equalsIgnoreCase("Safari")) {
            driver = new SafariDriver();
            BrowserTest.log(Status.INFO, "Starting Safari Browser");
            BrowserTest.pass("Safari Browser opened successfully");
            BrowserTest.fail("Other Browser not opened");
        }
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(20000, TimeUnit.MILLISECONDS);
            driver.get(prop.getProperty("devurl"));
            BrowserTest.log(Status.INFO, "Navigating to sign in page");
            BrowserTest.pass("Successfully opened Sign in page");

    }
    public static void loadConfig() {
        try {
            prop = new Properties();
            FileInputStream ip = new FileInputStream(
                    System.getProperty("user.dir") + "/Configuration/Config.properties");
            prop.load(ip);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public WebDriver getDriver() {
        return driver1.get();
    }

    @AfterMethod
    public void tearDown() {
        System.out.println("Closing browser...");
        driver.quit();
    }
    @AfterSuite
    public void closeReport(){
        extent.flush();
    }
    }
