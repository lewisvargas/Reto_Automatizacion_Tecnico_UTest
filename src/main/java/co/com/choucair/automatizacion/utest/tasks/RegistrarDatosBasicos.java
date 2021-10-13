package co.com.choucair.automatizacion.utest.tasks;

import co.com.choucair.automatizacion.utest.userinterface.RegistrarDatosBasicosPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class RegistrarDatosBasicos implements Task {

    private RegistrarDatosBasicosPage datosBasicosPage;

    public static RegistrarDatosBasicos thePage() {
        return Tasks.instrumented(RegistrarDatosBasicos.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(datosBasicosPage));
    }
}
