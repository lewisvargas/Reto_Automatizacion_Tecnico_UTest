package co.com.choucair.automatizacion.utest.tasks;

import co.com.choucair.automatizacion.utest.userinterface.DatosBasicosPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class DatosBasicos implements Task {

    public static DatosBasicos onThePage() {
        return Tasks.instrumented(DatosBasicos.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(DatosBasicosPage.REGISTER_BUTTON),
                Enter.theValue("IngresarNombre").into(DatosBasicosPage.INPUT_NAME),
                Enter.theValue("IngresarApellidos").into(DatosBasicosPage.INPUT_LAST_NAME),
                Enter.theValue("IngresarCorreo").into(DatosBasicosPage.INPUT_EMAIL),
                Enter.theValue("SeleccionarFechaN").into(DatosBasicosPage.SELECT_DATE),
                Click.on(DatosBasicosPage.NEXT_BUTTON_LOCATION)
        );
    }
}
