package StepsClass;


import GyManager.PageManager.PageObjectChrome;
import GyManager.PageObject.PageHome;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;




public class PageHomeSteps {
    private PageHome pageHome = new PageHome();
    @Given("Ingresa a la url {string}")
    public void ingresaALaUrlUrl(String url) {
        System.out.println("[INFO] Ingresamos a la la URL: " + url);
        pageHome.setUP(url);
        pageHome.sleepPageHome();

    }

    @When("hace clic")
    public void haceClic() {
        pageHome.sleepPageHome();
        pageHome.getWebElementoId("password").submit();
        pageHome.sleepPageHome();
    }

    @Then("ve el mensaje {string}")
    public void veElMensajeMensaje(String msj) {

        pageHome.sleepPageHome();

        String mensaje = pageHome.getWebElementoXPath("//*[@id=\"root\"]/div/h1").getText();
        System.out.println("[INFO]Mensaje: "+mensaje);
        Assert.assertEquals("No pudo ingresar al sitio",msj,mensaje);
        pageHome.closePageHome();
    }

    @And("ingresamos el {string} y {string}")
    public void ingresamosElUsuarioYPass(String usuario,String pass) {
        pageHome.getWebElementoId("email").sendKeys(usuario);
        pageHome.getWebElementoId("password").sendKeys(pass);

    }
}
