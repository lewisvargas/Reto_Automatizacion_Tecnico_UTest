package co.com.choucair.automatizacion.utest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DatosBasicosPage extends PageObject {

    public static final Target REGISTER_BUTTON = Target.the("Boton de avance de registro").located
            (By.xpath("//div[@class= 'd-none d-lg-block']//strong[contains(text(), 'Siguiente')]"));

    public static final Target INPUT_NAME = Target.the("Ingresar el nombre").located(By.id("nombre"));

    public static final Target INPUT_LAST_NAME = Target.the("Ingresar los apellidos").located
            (By.id("apellidos"));

    public static final Target INPUT_EMAIL = Target.the("Ingresar el correo electronico").located
            (By.id("correo electronico"));

    public static final Target SELECT_DATE = Target.the("Seleccionar la fecha de nacimiento").located
            (By.id("fecha de nacimiento"));

    public static final Target NEXT_BUTTON_LOCATION = Target.the("Boton de avance de registro").located
            (By.xpath("//div[@class= 'd-none d-lg-block']//strong[contains(text(), 'Siguiente')]"));
}
