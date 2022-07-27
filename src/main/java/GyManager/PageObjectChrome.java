package GyManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class PageObjectChrome {
    private static WebDriver driver;

    public static void setUP(String url) {
        System.setProperty("webdriver.chrome.driver", "./src/main/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://gymanager-test.herokuapp.com/");
    }

    public static void cerrar() {
        System.out.println("Cierro");
        driver.close();
    }

    public static void espera() {
        try {
            Thread.sleep(10000);
        } catch (Exception e) {

        }
    }

    public static WebElement getWebElementoId(String id) {

        return driver.findElement(By.id(id));
    }

    public static WebElement getWebElementoXPath(String xpath) {

        return driver.findElement(By.xpath(xpath));
    }
}
