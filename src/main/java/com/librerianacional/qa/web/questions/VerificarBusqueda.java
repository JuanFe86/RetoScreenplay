package com.librerianacional.qa.web.questions;

import com.librerianacional.qa.web.userinterfaces.PaginaInicioUsuario;
import com.librerianacional.qa.web.userinterfaces.PaginaResultadoBusqueda;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class VerificarBusqueda implements Question <String> {

    private String busqueda;

    public VerificarBusqueda(String busqueda){
        this.busqueda = busqueda;
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(PaginaResultadoBusqueda.LBL_RESULTADO).viewedBy(actor).asString();
    }

    public static VerificarBusqueda aBusqueda(String busqueda){
        return new VerificarBusqueda(busqueda);
    }
}
