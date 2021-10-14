package co.com.choucair.automatizacion.utest.tasks;

import co.com.choucair.automatizacion.utest.userinterface.DatosBasicosPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class DatosBasicos implements Task {

    private String strName;
    private String strLastName;
    private String strEmail;
    private String strDate;

    public DatosBasicos(String strName, String strLastName, String strEmail, String strDate) {
        this.strName = strName;
        this.strLastName = strLastName;
        this.strEmail = strEmail;
        this.strDate = strDate;
    }

    public static DatosBasicos onThePage(String strName, String strLastName, String strEmail, String strDate) {
        return Tasks.instrumented(DatosBasicos.class, strName, strLastName, strEmail, strDate);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(DatosBasicosPage.REGISTER_BUTTON),
                Enter.theValue(strName).into(DatosBasicosPage.INPUT_NAME),
                Enter.theValue(strLastName).into(DatosBasicosPage.INPUT_LAST_NAME),
                Enter.theValue(strEmail).into(DatosBasicosPage.INPUT_EMAIL),
                Enter.theValue(strDate).into(DatosBasicosPage.SELECT_DATE),
                Click.on(DatosBasicosPage.NEXT_BUTTON_LOCATION)
        );
    }
}
