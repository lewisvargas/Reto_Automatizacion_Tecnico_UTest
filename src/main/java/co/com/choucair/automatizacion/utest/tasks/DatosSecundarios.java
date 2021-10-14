package co.com.choucair.automatizacion.utest.tasks;

import co.com.choucair.automatizacion.utest.userinterface.DatosSecundariosPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class DatosSecundarios implements Task {

    private String strCity;
    private String strZipCode;
    private String strCountry;

    public DatosSecundarios(String strCity, String strZipCode, String strCountry) {
        this.strCity = strCity;
        this.strZipCode = strZipCode;
        this.strCountry = strCountry;
    }

    public static DatosSecundarios onThePage(String strCity, String strZipCode, String strCountry) {
        return Tasks.instrumented(DatosSecundarios.class, strCity, strZipCode, strCountry);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(DatosSecundariosPage.BACK_BUTTON),
                Enter.theValue(strCity).into(DatosSecundariosPage.INPUT_CITY),
                Enter.theValue(strZipCode).into(DatosSecundariosPage.INPUT_ZIP_CODE),
                Enter.theValue(strCountry).into(DatosSecundariosPage.SELECT_COUNTRY),
                Click.on(DatosSecundariosPage.NEXT_BUTTON_DEVICES)
        );
    }
}
