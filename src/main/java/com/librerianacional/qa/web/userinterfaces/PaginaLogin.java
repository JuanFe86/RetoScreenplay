package com.librerianacional.qa.web.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaLogin {

    public static final Target BTN_INGRESAR_DATOS = Target.the("Botón ingresar datos").locatedBy("//body/app-root[1]/div[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/app-ingreso[1]/div[1]/div[2]/div[1]/div[5]/a[1]/div[1]");
    public static final Target TXT_EMAIL = Target.the("Campo ingresar email").located(By.name("usuario"));
    public static final Target TXT_CONTRASEÑA = Target.the("Campo ingresar email").located(By.name("contrasena"));
    public static final Target BTN_INICIAR_SESION = Target.the("Botón iniciar sesión").locatedBy("//button[contains(text(),'Iniciar sesión')]");
}
