package com.librerianacional.qa.web.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class PaginaResultadoBusqueda {

    public static final Target LBL_RESULTADO = Target.the("Mensaje de busqqueda").locatedBy("//h4[contains(text(),'\"Proyectos\"')]");
    public static final Target BTN_CUENTA = Target.the("boton ir a mi cuenta").locatedBy("//body[1]/app-root[1]/app-header[1]/header[1]/div[2]/div[1]/div[1]/div[2]/div[1]/menu-login-header[1]/div[1]/div[1]/div[1]/a[1]");


}
