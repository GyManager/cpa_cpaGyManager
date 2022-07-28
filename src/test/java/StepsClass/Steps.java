package StepsClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Steps {


    @Before
    public void doBefore(Scenario scenario) throws Exception {

    }

    //Se ejecuta despues de cada escenario
    @After
    public void doAfter(Scenario scenario) throws Exception {

        System.out.println("--------------------------------------------------------------");
        System.out.println("Ending - " + scenario.getName() + " Status - " + scenario.getStatus());
        System.out.println("--------------------------------------------------------------");
    }
}
