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
        OnStage.theActorCalled("Jose").wasAbleTo(RegistrarDatosBasicos.thePage(), (DatosBasicos.onThePage()));
    }

    @When("^He continues to fill out the form with secondary data that the page indicates$")
    public void heContinuesToFillOutTheFormWithSecondaryDataThatThePageIndicates (List<UtestData> utestData) throws Exception {
        OnStage.theActorCalled("DatosSecundarios").wasAbleTo(RegistrarDatosSecundarios.thePage(),
                (DatosSecundarios.onThePage()));
        OnStage.theActorCalled("DatosAdicionales").wasAbleTo(RegistrarDatosAdicionales.thePage(),
                (DatosAdicionales.onThePage()));
    }

    @Then("^They ask you as a user to establish a password to log in$")
    public void theyAskYouAsAUserToEstablishAPasswordToLogIn (List<UtestData> utestData) throws Exception {
        OnStage.theActorCalled("Contraseña").wasAbleTo(RegistrarContrasena.thePage(), (Contrasena.onThePage(utestData.get(0).getStrPassword(),
                utestData.get(0).getStrConfirmPassword())));
    }
}
