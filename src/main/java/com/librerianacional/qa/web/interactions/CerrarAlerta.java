package com.librerianacional.qa.web.interactions;

import com.librerianacional.qa.web.userinterfaces.PaginaAlerta;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class CerrarAlerta implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(PaginaAlerta.BTN_EMAIL));
    }

    public static CerrarAlerta enPagina(){
        return Tasks.instrumented(CerrarAlerta.class);
    }
}
