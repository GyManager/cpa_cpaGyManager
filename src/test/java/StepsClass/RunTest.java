package StepsClass;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import static GyManager.PageObjectChrome.cerrar;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features", plugin = {"pretty"})
public class RunTest {
    @BeforeClass
    public static void beforeTest(){
        System.out.println("BeforeClass");

    }
    @AfterClass
    public static void AfterClass(){
        System.out.println("AfterClass");
        cerrar();
    }
}
