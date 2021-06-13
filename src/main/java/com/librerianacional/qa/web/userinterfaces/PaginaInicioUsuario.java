package com.librerianacional.qa.web.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class PaginaInicioUsuario {

    public static final Target LBL_MENSAJE = Target.the("Mensaje Bienvenida").locatedBy("//div[contains(text(),'Hola, Juan!')]");
    public static final Target TXT_BUSQUEDA =Target.the("Barra de busqueda").locatedBy("//header/div[3]/div[1]/div[1]/div[3]/div[1]/div[1]/form[1]/div[2]/input[2]");
    public static final Target BTN_CERRAR_SESION = Target.the("Cerrar Sesión").locatedBy("//body/app-root[1]/div[1]/app-mi-cuenta[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/li[7]/a[1]");
}
