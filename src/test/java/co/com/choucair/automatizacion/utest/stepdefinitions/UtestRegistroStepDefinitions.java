package co.com.choucair.automatizacion.utest.stepdefinitions;

import co.com.choucair.automatizacion.utest.model.UtestData;
import co.com.choucair.automatizacion.utest.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class UtestRegistroStepDefinitions {

    @Before
    public void setStage (){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^Jose click on Join Today to start filling in the basic user data$")
    public void joseClickOnJoinTodayToStartFillingInTheBasicUserData (List<UtestData> utestData) throws Exception {
        OnStage.theActorCalled("Jose").wasAbleTo(RegistrarDatosBasicos.thePage(),
                (DatosBasicos.onThePage(utestData.get(0).getStrName(), utestData.get(0).getStrLastName(),
                        utestData.get(0).getStrEmail(), utestData.get(0).getStrDate())));
    }

    @When("^He continues to fill out the form with secondary data that the page indicates$")
    public void heContinuesToFillOutTheFormWithSecondaryDataThatThePageIndicates (List<UtestData> utestData) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(RegistrarDatosSecundarios.thePage(),
                (DatosSecundarios.onThePage(utestData.get(0).getStrCity(), utestData.get(0).getStrZipCode(),
                        utestData.get(0).getStrCountry())));
        OnStage.theActorInTheSpotlight().attemptsTo(RegistrarDatosAdicionales.thePage(),
                (DatosAdicionales.onThePage(utestData.get(0).getStrComputador(), utestData.get(0).getStrVersion(),
                        utestData.get(0).getStrLenguage(), utestData.get(0).getStrMobile(), utestData.get(0).getStrModel(),
                        utestData.get(0).getStrSystemOperating())));
    }

    @Then("^They ask you as a user to establish a password to log in$")
    public void theyAskYouAsAUserToEstablishAPasswordToLogIn (List<UtestData> utestData) throws Exception {
        OnStage.theActorCalled("Contraseña").wasAbleTo(RegistrarContrasena.thePage(), (Contrasena.onThePage(utestData.get(0).getStrPassword(),
                utestData.get(0).getStrConfirmPassword())));
    }
}
