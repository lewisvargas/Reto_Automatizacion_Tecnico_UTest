package co.com.choucair.automatizacion.utest.tasks;

import co.com.choucair.automatizacion.utest.userinterface.RegistrarContrasenaPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class RegistrarContrasena implements Task {

    private RegistrarContrasenaPage registrarContrasenaPage;

    public static RegistrarContrasena thePage() {
        return Tasks.instrumented(RegistrarContrasena.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(registrarContrasenaPage));
    }
}
