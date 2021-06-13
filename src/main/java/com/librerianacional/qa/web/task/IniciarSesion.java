package com.librerianacional.qa.web.task;

import com.librerianacional.qa.web.models.DatosLogin;
import com.librerianacional.qa.web.userinterfaces.PaginaInicial;
import com.librerianacional.qa.web.userinterfaces.PaginaLogin;
import cucumber.api.java.sl.In;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.librerianacional.qa.web.userinterfaces.PaginaLogin.*;

public class IniciarSesion implements Task {

    private String emailaddress;
    private  String password;

    public IniciarSesion(DatosLogin datosLogin) {
        this.emailaddress = datosLogin.getEmailaddress();
        this.password = datosLogin.getPassword();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(PaginaLogin.BTN_INGRESAR_DATOS),
                Enter.theValue(emailaddress).into(TXT_EMAIL),
                Enter.theValue(password).into(TXT_CONTRASEÑA),
                Click.on(BTN_INICIAR_SESION)

                );

    }

    public static IniciarSesion enTest(DatosLogin datosLogin){
        return Tasks.instrumented(IniciarSesion.class,datosLogin);
    }
}
