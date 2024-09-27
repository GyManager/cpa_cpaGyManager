package StepsClass;
import GyManager.PageObject.ClientePage;
import GyManager.PageObject.HomePage;
import GyManager.config.Properties;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
public class ClienteSteps {
    @And("visualiza la tabla de clientes")
    public void visualizaLaTablaDeClientes() {

        Properties.clientePage = new ClientePage(Properties.driver);
        Properties.clientePage.sleepWait();
        Properties.clientePage.leerTabla();
    }


}
