package co.com.choucair.automatizacion.utest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DatosSecundariosPage extends PageObject {

    public static final Target BACK_BUTTON = Target.the("Boton de regresar al anterior formulario").located
            (By.xpath("//div[@class= 'd-none d-lg-block']//strong[contains(text(), 'Atras')]"));

    public static final Target INPUT_CITY = Target.the("Ingresar la ciudad").located(By.id("ciudad"));

    public static final Target INPUT_ZIP_CODE = Target.the("Ingresar el codigo postal").located
            (By.id("postal"));

    public static final Target SELECT_COUNTRY = Target.the("Seleccionar el pais de origen").located
            (By.id("pais"));

    public static final Target NEXT_BUTTON_DEVICES = Target.the("Boton de avance de registro").located
            (By.xpath("//div[@class= 'd-none d-lg-block']//strong[contains(text(), 'Siguiente')]"));
}
