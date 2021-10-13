package co.com.choucair.automatizacion.utest.tasks;

import co.com.choucair.automatizacion.utest.userinterface.ContrasenaPage;
import co.com.choucair.automatizacion.utest.userinterface.DatosAdicionalesPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Contrasena implements Task {

    private String strPassword;
    private String strConfirmPassword;

    public Contrasena(String strPassword, String strConfirmPassword) {
        this.strPassword = strPassword;
        this.strConfirmPassword = strConfirmPassword;
    }

    public static Contrasena onThePage(String strPassword, String strConfirmPassword) {
        return Tasks.instrumented(Contrasena.class, strPassword, strConfirmPassword);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(DatosAdicionalesPage.BACK_BUTTON),
                Enter.theValue(strPassword).into(ContrasenaPage.INPUT_PASSWORD),
                Enter.theValue(strConfirmPassword).into(ContrasenaPage.INPUT_PASSWORD_CONFIRM),
                Click.on(ContrasenaPage.FINAL_BUTTON_COMPLETE)
        );
    }
}
