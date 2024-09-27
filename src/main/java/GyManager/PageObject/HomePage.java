package GyManager.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{

    private By idEmail = By.id("email");
    private By idPassword = By.id("password");

    private By xPathIniciarSesion = By.xpath(" //*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/form/div[1]");
    private By xPathTxtLogueado = By.xpath("//*[@id=\"root\"]/div/h1");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void signInPage(String email,String pass){
        if(super.isDisplayed(this.xPathIniciarSesion)){
            super.typeText(this.idEmail,email);
            super.typeText(this.idPassword,pass);
        }else {
            System.out.println("[WARNING] No cargo el sitio");
        }
    }
    public void submintPass(){
        super.submint(this.idPassword);
    }

    public boolean isHomePageDisplayed(){
        return super.isDisplayed(xPathTxtLogueado);
    }

    public String getMensajeLogueado(){
        return super.getText(xPathTxtLogueado);
    }

    public String fluentWaitMensajeLogueado(){
        return super.fluentWait(this.xPathTxtLogueado).getText();
    }

    public String fluentWaitLoginHome(){
        return super.fluentWait(this.idEmail).getText();
    }

}
