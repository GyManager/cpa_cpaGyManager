package StepsClass;

import GyManager.PageObject.HomePage;
import GyManager.config.Properties;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class LoginSteps {
    //private WebDriver driver;
    //private HomePage homePage;

    @Given("Ingresa a la url {string} home")
    public void ingresaALaUrlUrlHome(String url) {
        Properties.homePage = new HomePage(Properties.driver);
        Properties.driver = Properties.homePage.chromeDriverConnetion();
        Properties.homePage.visit(url);
        //this.homePage.sleepWait();
        Properties.homePage.fluentWaitLoginHome();

    }

    @And("ingresamos el correo {string} y  contrasena {string}")
    public void ingresamosElCorreoUsuarioYContrasenaPass(String email, String pass) {
        Properties.homePage.signInPage(email,pass);
    }

    @When("hacemos enter en el campo pass")
    public void hacemosEnterEnElCampoPass() {
        Properties.homePage.submintPass();
    }

    @Then("verificar que ingresa al sitio {string} y visualiza el mensaje {string}")
    public void verificarQueIngresaAlSitioUrlYVisualizaElMensajeMensaje(String url,String mensaje) {

        String msj = Properties.homePage.fluentWaitMensajeLogueado();
        Assert.assertEquals("[ERROR] Mensaje no es el esperado","Logeado",mensaje);
    }

    @And("cierro el sitio")
    public void cierroElSitio() {
        System.out.println("[ERROR]Cerramos el driver");
        //this.homePage.quit();
        Properties.driver.quit();
    }
}
