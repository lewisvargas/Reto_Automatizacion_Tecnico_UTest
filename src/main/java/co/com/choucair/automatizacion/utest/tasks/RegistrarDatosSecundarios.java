package co.com.choucair.automatizacion.utest.tasks;

import co.com.choucair.automatizacion.utest.userinterface.RegistrarDatosSecundariosPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class RegistrarDatosSecundarios implements Task {

    private RegistrarDatosSecundariosPage registrarDatosSecundariosPage;

    public static RegistrarDatosSecundarios thePage() {
        return Tasks.instrumented(RegistrarDatosSecundarios.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(registrarDatosSecundariosPage));
    }
}
