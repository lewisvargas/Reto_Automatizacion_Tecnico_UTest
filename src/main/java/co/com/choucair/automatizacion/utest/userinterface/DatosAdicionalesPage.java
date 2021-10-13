package co.com.choucair.automatizacion.utest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DatosAdicionalesPage extends PageObject {

    public static final Target BACK_BUTTON = Target.the("Boton de regresar al anterior formulario").located
            (By.xpath("//div[@class= 'd-none d-lg-block']//strong[contains(text(), 'Atras')]"));

    public static final Target SELECT_COMPUTER = Target.the("Seleccionar el sistema operativo").located
            (By.id("computador"));

    public static final Target SELECT_VERSION = Target.the("Seleccionar la version del sistema operativo").located
            (By.id("version del sistema operativo"));

    public static final Target SELECT_LANGUAGE = Target.the("Seleccionar el lenguaje").located
            (By.id("lenguaje"));

    public static final Target SELECT_MOBILE = Target.the("Seleccionar tipo de celular").located
            (By.id("celular"));

    public static final Target SELECT_MODEL = Target.the("Seleccionar la marca del celular").located
            (By.id("marcar"));

    public static final Target SELECT_SYSTEM_OPERATING = Target.the("Seleccionar el sistema operativo del celular").located
            (By.id("sistema operativo del celular"));

    public static final Target NEXT_BUTTON_LAST_STEP = Target.the("Boton de avance de registro").located
            (By.xpath("//div[@class= 'd-none d-lg-block']//strong[contains(text(), 'Siguiente')]"));
}
