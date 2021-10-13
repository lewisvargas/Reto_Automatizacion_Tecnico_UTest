package co.com.choucair.automatizacion.utest.tasks;

import co.com.choucair.automatizacion.utest.userinterface.RegistrarDatosAdicionalesPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class RegistrarDatosAdicionales implements Task {

    private RegistrarDatosAdicionalesPage registrarDatosAdicionalesPage;

    public static RegistrarDatosAdicionales thePage() {
        return Tasks.instrumented(RegistrarDatosAdicionales.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(registrarDatosAdicionalesPage));
    }
}
