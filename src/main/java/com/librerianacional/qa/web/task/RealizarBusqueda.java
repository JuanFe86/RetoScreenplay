package com.librerianacional.qa.web.task;

import com.librerianacional.qa.web.interactions.Esperas;
import com.librerianacional.qa.web.userinterfaces.PaginaInicioUsuario;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import static com.librerianacional.qa.web.userinterfaces.PaginaInicioUsuario.TXT_BUSQUEDA;

public class RealizarBusqueda implements Task {

    private final String busqueda;

    public RealizarBusqueda(String busqueda){
        this.busqueda=busqueda;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(TXT_BUSQUEDA),
                Enter.theValue(busqueda).into(TXT_BUSQUEDA).thenHit(Keys.ENTER)
                //Hit.the(Keys.ENTER).into(TXT_BUSQUEDA)

        );

        Esperas.dosSegunods();

    }

    public static RealizarBusqueda EnBusqueda(String busqueda){
        return Tasks.instrumented(RealizarBusqueda.class, busqueda);
    }
}
