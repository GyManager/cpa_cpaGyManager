package GyManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class PageObjectChrome {
    private static WebDriver driver;

    public static void setUP(){
        System.setProperty("webdriver.chrome.driver","./src/main/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://gymanager-test.herokuapp.com/login");
    }
    public static void cerrar(){
        driver.quit();
    }
    public static void espera(){
        try{
            Thread.sleep(10000);
        }catch (Exception e){

        }
    }

    public static void main(String[] args) {
        setUP();
        espera();
        cerrar();
    }
}
