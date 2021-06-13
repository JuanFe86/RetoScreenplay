package com.librerianacional.qa.web.interactions;

import com.librerianacional.qa.web.userinterfaces.PaginaInicial;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.librerianacional.qa.web.userinterfaces.PaginaInicial.BTN_INICIAR_SESION;
import static com.librerianacional.qa.web.userinterfaces.PaginaInicial.BTN_MI_CUENTA;

public class MiCuenta implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BTN_MI_CUENTA),
                Click.on(BTN_INICIAR_SESION));

    }

    public static MiCuenta iniciarLogin(){
        return Tasks.instrumented(MiCuenta.class);
    }
}
