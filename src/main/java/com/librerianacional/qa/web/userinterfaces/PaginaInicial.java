package com.librerianacional.qa.web.userinterfaces;

import com.sun.xml.fastinfoset.tools.FI_DOM_Or_XML_DOM_SAX_SAXEvent;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaInicial {

    public static final Target BTN_MI_CUENTA = Target.the("botón ingresar al login").locatedBy("//body[1]/app-root[1]/app-header[1]/header[1]/div[2]/div[1]/div[1]/div[2]/div[1]/menu-login-header[1]/div[1]/div[1]/div[1]/button[1]");
    public static final Target BTN_INICIAR_SESION = Target.the("botón iniciar sesión").locatedBy("//body[1]/app-root[1]/app-header[1]/header[1]/div[2]/div[1]/div[1]/div[2]/div[1]/menu-login-header[1]/div[1]/div[1]/div[1]/div[1]/a[1]");
}
