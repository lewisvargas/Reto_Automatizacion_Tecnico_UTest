package co.com.choucair.automatizacion.utest.tasks;

import co.com.choucair.automatizacion.utest.userinterface.DatosAdicionalesPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class DatosAdicionales implements Task {

    public static DatosAdicionales onThePage() {
        return Tasks.instrumented(DatosAdicionales.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(DatosAdicionalesPage.BACK_BUTTON),
                Enter.theValue("SeleccionarComputador").into(DatosAdicionalesPage.SELECT_COMPUTER),
                Enter.theValue("SeleccionarVersion").into(DatosAdicionalesPage.SELECT_VERSION),
                Enter.theValue("SeleccionarLenguaje").into(DatosAdicionalesPage.SELECT_LANGUAGE),
                Enter.theValue("SeleccionarCelular").into(DatosAdicionalesPage.SELECT_MOBILE),
                Enter.theValue("SeleccionarModelo").into(DatosAdicionalesPage.SELECT_MODEL),
                Enter.theValue("SeleccionarSistemaOperativo").into(DatosAdicionalesPage.SELECT_SYSTEM_OPERATING),
                Click.on(DatosAdicionalesPage.NEXT_BUTTON_LAST_STEP)
        );
    }
}
