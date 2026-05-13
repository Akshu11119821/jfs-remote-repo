package com.app.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver.testng.annotations.AfterClass;import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * --------------------------------------------------------
 * Selenium Test Script for Login & Logout Functionality
 * --------------------------------------------------------
 * Author       : Akshaya
 * Created Date : 08/05/2026
 * Description  : This test validates login and logout
 *                functionality of the web application
 * --------------------------------------------------------
 */

public class LoginLogoutTest {

    WebDriver driver;

    /**
     * This method launches the browser and opens the application
     */
    @BeforeClass
    public void setUp() {
        // Set ChromeDriver path
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

        // Launch Chrome Browser
        driver = new ChromeDriver();

        // Maximize window
        driver.manage().window().maximize();

        // Open Application URL
        driver.get("http://localhost:8080/LoginApp/login.html");
    }

    /**
     * Test Case: Verify Login Functionality
     */
    @Test(priority = 1)
    public void testLogin() {

        // Enter Username
        driver.findElement(By.id("username")).sendKeys("admin");

        // Enter Password
        driver.findElement(By.id("password")).sendKeys("admin123");

        // Click Login Button
        driver.findElement(By.id("loginBtn")).click();

        // Validate successful login using dashboard text
        String expectedTitle = "Dashboard";
        String actualTitle = driver.getTitle();

        Assert.assertEquals(actualTitle, expectedTitle,
                "Login Failed - Dashboard not displayed");
    }

    /**
     * Test Case: Verify Logout Functionality
     */
    @Test(priority = 2)
    public void testLogout() {

        // Click Logout Button
        driver.findElement(By.id("logoutBtn")).click();

        // Validate user redirected to login page
        String expectedTitle = "Login Page";
        String actualTitle = driver.getTitle();

        Assert.assertEquals(actualTitle, expectedTitle,
                "Logout Failed - Login page not displayed");
    }

    /**
     * This method closes the browser
     */
    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
import org.testng.Assert;
