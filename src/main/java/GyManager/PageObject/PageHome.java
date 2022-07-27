package GyManager.PageObject;

import GyManager.PageManager.PageObjectChrome;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class PageHome {

    private String txtEmail = "email";
    private String txtPassword = "password";

    private WebDriver driverPageHome;

    public void setUP(String url) {
        driverPageHome = PageObjectChrome.initWebDriverChrome();
        driverPageHome.manage().window().maximize();
        driverPageHome.get(url);
    }

    public void closePageHome() {
        PageObjectChrome.close(driverPageHome);
    }

    public void sleepPageHome() {
        PageObjectChrome.sleep();
    }

    public WebElement getWebElementoId(String id) {

        return PageObjectChrome.getWebElementoId(driverPageHome, id);
    }

    public WebElement getWebElementoXPath(String xpath) {

        return PageObjectChrome.getWebElementoXPath(driverPageHome, xpath);
    }

    public void setTxtEmail(String usuario) {
        getWebElementoId(txtEmail).sendKeys(usuario);
    }

    public void setTxtPassword(String password) {
        getWebElementoId(txtPassword).sendKeys(password);
    }
}
