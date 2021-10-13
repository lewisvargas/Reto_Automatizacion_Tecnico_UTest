package co.com.choucair.automatizacion.utest.tasks;

import co.com.choucair.automatizacion.utest.userinterface.DatosSecundariosPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class DatosSecundarios implements Task {

    public static DatosSecundarios onThePage() {
        return Tasks.instrumented(DatosSecundarios.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(DatosSecundariosPage.BACK_BUTTON),
                Enter.theValue("IngresarCiudad").into(DatosSecundariosPage.INPUT_CITY),
                Enter.theValue("IngresarCodigoPostal").into(DatosSecundariosPage.INPUT_ZIP_CODE),
                Enter.theValue("SeleccionarPais").into(DatosSecundariosPage.SELECT_COUNTRY),
                Click.on(DatosSecundariosPage.NEXT_BUTTON_DEVICES)
        );
    }
}
