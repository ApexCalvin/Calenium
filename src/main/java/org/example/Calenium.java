package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Calenium {
    private static final WebDriver driver = new ChromeDriver();

    public static void launch(String website) {
        driver.get(website);
        driver.manage().window().maximize();
    }

    public static void click_byId(String objectName) {
        driver.findElement(By.id(objectName)).click();
    }

    public static void click_byName(String objectName) {
        driver.findElement(By.name(objectName)).click();
    }

    public static void type_byId(String objectName, String content) {
        driver.findElement(By.id(objectName)).sendKeys(content);
    }

    public static void type_byName(String objectName, String content) {
        driver.findElement(By.name(objectName)).sendKeys(content);
    }

    public static void select_fromDropDown(String objectName, String option) {
        WebElement dropdown = driver.findElement(By.name(objectName));
        new Select(dropdown).selectByVisibleText(option);
    }

    public static void select_fromDataList(String objectName, String option) throws InterruptedException {
        WebElement dropdown = driver.findElement(By.name(objectName));
        new Select(dropdown).selectByValue(option);
    }

    public static void uploadfile(String objectName, String filePath) {
        driver.findElement(By.cssSelector(objectName)).sendKeys(filePath);
        //driver.findElement(By.id("file-submit")).click();
    }

    public static void select_futureDate(String objectName, String date) {
        WebElement elm = driver.findElement(By.name(objectName));
        new Select(elm).selectByVisibleText(date);
    }

    public static void slideRange(String objectName, int value) {
        driver.findElement(By.name(objectName));
    }

    public static void closeBrowser() {
        driver.quit();
    }
}
