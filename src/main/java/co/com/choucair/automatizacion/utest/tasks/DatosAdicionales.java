package co.com.choucair.automatizacion.utest.tasks;

import co.com.choucair.automatizacion.utest.userinterface.DatosAdicionalesPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class DatosAdicionales implements Task {

    private String strComputador;
    private String strVersion;
    private String strLenguage;
    private String strMobile;
    private String strModel;
    private String strSystemOperating;

    public DatosAdicionales(String strComputador, String strVersion, String strLenguage, String strMobile, String strModel, String strSystemOperating) {
        this.strComputador = strComputador;
        this.strVersion = strVersion;
        this.strLenguage = strLenguage;
        this.strMobile = strMobile;
        this.strModel = strModel;
        this.strSystemOperating = strSystemOperating;
    }

    public static DatosAdicionales onThePage(String strComputador, String strVersion, String strLenguage, String strMobile, String strModel, String strSystemOperating) {
        return Tasks.instrumented(DatosAdicionales.class, strComputador,strVersion, strLenguage, strMobile, strModel, strSystemOperating);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(DatosAdicionalesPage.BACK_BUTTON),
                Enter.theValue(strComputador).into(DatosAdicionalesPage.SELECT_COMPUTER),
                Enter.theValue(strVersion).into(DatosAdicionalesPage.SELECT_VERSION),
                Enter.theValue(strLenguage).into(DatosAdicionalesPage.SELECT_LANGUAGE),
                Enter.theValue(strMobile).into(DatosAdicionalesPage.SELECT_MOBILE),
                Enter.theValue(strModel).into(DatosAdicionalesPage.SELECT_MODEL),
                Enter.theValue(strSystemOperating).into(DatosAdicionalesPage.SELECT_SYSTEM_OPERATING),
                Click.on(DatosAdicionalesPage.NEXT_BUTTON_LAST_STEP)
        );
    }
}
