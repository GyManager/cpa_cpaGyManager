package StepsClass;

import GyManager.PageObjectChrome;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


import static GyManager.PageObjectChrome.*;


public class LoginSteps {
    @Given("Ingresa a la url {string}")
    public void ingresaALaUrlUrl(String url) {
        System.out.println("[INFO] Ingresamos a la la URL: " + url);
        setUP(url);
        espera();

    }

    @When("hace clic")
    public void haceClic() {
        espera();
        //PageObjectChrome.getWebElementoXPath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/form/button").click();
        PageObjectChrome.getWebElementoId("password").submit();
        espera();
    }

    @Then("ve el mensaje {string}")
    public void veElMensajeMensaje(String msj) {

        espera();

        String mensaje = PageObjectChrome.getWebElementoXPath("//*[@id=\"root\"]/div/h1").getText();
        System.out.println("[INFO]Mensaje: "+mensaje);
        Assert.assertEquals("No pudo ingresar al sitio",msj,mensaje);
        cerrar();
    }

    @And("ingresamos el {string} y {string}")
    public void ingresamosElUsuarioYPass(String usuario,String pass) {
        PageObjectChrome.getWebElementoId("email").sendKeys(usuario);
        PageObjectChrome.getWebElementoId("password").sendKeys(pass);

    }
}
