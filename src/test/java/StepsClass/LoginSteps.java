package StepsClass;

import GyManager.PageObjectChrome;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static GyManager.PageObjectChrome.*;


public class LoginSteps {
    @Given("Ingresa a la url {string}")
    public void ingresaALaUrlUrl(String url) {
        System.out.println("url: " + url);


    }

    @When("hace clic")
    public void haceClic() {
        System.out.println("Hace clic");
        setUP();
        espera();

    }

    @Then("ve el mensaje {string}")
    public void veElMensajeMensaje(String msj) {
        System.out.println("Ingresa mensaje: " + msj);
        cerrar();
    }
}
