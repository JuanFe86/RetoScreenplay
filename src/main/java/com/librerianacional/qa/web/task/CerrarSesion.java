package com.librerianacional.qa.web.task;

import com.librerianacional.qa.web.userinterfaces.PaginaInicioUsuario;
import com.librerianacional.qa.web.userinterfaces.PaginaResultadoBusqueda;
import cucumber.api.java.sl.Ce;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class CerrarSesion implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(PaginaResultadoBusqueda.BTN_CUENTA),
                Click.on(PaginaInicioUsuario.BTN_CERRAR_SESION)
                );

    }

    public static CerrarSesion eSesion(){
        return Tasks.instrumented(CerrarSesion.class);
    }
}
