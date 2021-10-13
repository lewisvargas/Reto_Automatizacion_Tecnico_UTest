package co.com.choucair.automatizacion.utest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ContrasenaPage extends PageObject {

    public static final Target BACK_BUTTON = Target.the("Boton de regresar al anterior formulario").located
            (By.xpath("//div[@class= 'd-none d-lg-block']//strong[contains(text(), 'Atras')]"));

    public static final Target INPUT_PASSWORD = Target.the("Ingresar la contraseña").located
            (By.id("password"));

    public static final Target INPUT_PASSWORD_CONFIRM = Target.the("Confirmar la contraseña").located
            (By.id("confirm"));

    public static final Target FINAL_BUTTON_COMPLETE = Target.the("Boton de completar registro").located
            (By.xpath("//div[@class= 'd-none d-lg-block']//strong[contains(text(), 'Finalizar')]"));
}
