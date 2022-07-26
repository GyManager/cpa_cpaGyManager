package StepsClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
    @Given("Ingresa a la url {string}")
    public void ingresaALaUrlUrl(String url) {
        System.out.println("url: "+url);
    }

    @When("hace clic")
    public void haceClic() {
        System.out.println("Hace clic");
    }

    @Then("ve el mensaje {string}")
    public void veElMensajeMensaje(String msj) {
        System.out.println("Ingresa mensaje: "+msj);
    }
}
