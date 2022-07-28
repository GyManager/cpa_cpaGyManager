package StepsClass;

import GyManager.PageObject.HomePage;
import GyManager.config.Properties;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class LoginSteps {
    private WebDriver driver;
    private HomePage homePage;

    @Given("Ingresa a la url {string} home")
    public void ingresaALaUrlUrlHome(String url) {
        this.homePage = new HomePage(this.driver);
        this.driver = this.homePage.chromeDriverConnetion();
        this.homePage.visit(url);
        //this.homePage.sleepWait();
        this.homePage.fluentWaitLoginHome();

    }

    @And("ingresamos el correo {string} y  contrasena {string}")
    public void ingresamosElCorreoUsuarioYContrasenaPass(String email, String pass) {
        this.homePage.signInPage(email,pass);
    }

    @When("hacemos enter en el campo pass")
    public void hacemosEnterEnElCampoPass() {
        this.homePage.submintPass();
    }

    @Then("verificar que ingresa al sitio {string} y visualiza el mensaje {string}")
    public void verificarQueIngresaAlSitioUrlYVisualizaElMensajeMensaje(String url,String mensaje) {

        String msj = this.homePage.fluentWaitMensajeLogueado();
        System.out.println("[INFO]Mensaje: "+msj);
    }

    @And("cierro el sitio")
    public void cierroElSitio() {
        System.out.println("[ERROR]Cerramos el driver");
        this.homePage.quit();
    }
}
