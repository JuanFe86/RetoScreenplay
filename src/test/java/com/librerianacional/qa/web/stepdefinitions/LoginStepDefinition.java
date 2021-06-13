package com.librerianacional.qa.web.stepdefinitions;

import com.librerianacional.qa.web.interactions.CerrarAlerta;
import com.librerianacional.qa.web.interactions.MiCuenta;
import com.librerianacional.qa.web.models.DatosLogin;
import com.librerianacional.qa.web.questions.VerificarBusqueda;
import com.librerianacional.qa.web.questions.VerificarLogin;
import com.librerianacional.qa.web.task.CerrarSesion;
import com.librerianacional.qa.web.task.IniciarSesion;
import com.librerianacional.qa.web.task.RealizarBusqueda;
import com.librerianacional.qa.web.utils.constantes.Constantes;
import com.librerianacional.qa.web.utils.drivers.MiDriverDeChrome;
import cucumber.api.java.bs.A;
import cucumber.api.java.en_old.Ac;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.hamcrest.Matchers;

import java.util.List;

import static com.librerianacional.qa.web.utils.constantes.Constantes.URL;

public class LoginStepDefinition {

    private Actor juan;


    @Dado("^que (.*) se encuentra en la pagina de libreria nacional$")
    public void queJuanSeEncuentraEnLaPaginaDeLibreriaNacional(String tester) {
        juan = Actor.named(tester);
        juan.can(BrowseTheWeb.with(MiDriverDeChrome.web().enLaUrl(URL)));
        juan.attemptsTo(CerrarAlerta.enPagina());
        juan.attemptsTo(MiCuenta.iniciarLogin());

    }


    @Cuando("^ella se loguea en la Pagina de Libreria Nacional$")
    public void ellaSeLogueaEnLaPaginaDeLibreriaNacional(List<DatosLogin> datosLogin) {
        juan.attemptsTo(IniciarSesion.enTest(datosLogin.get(0)));

    }

    @Entonces("^ella puede ver el mensaje (.*)$")
    public void ellaPuedeVerElMensajeHolaJuan(String resultado) throws InterruptedException {
        Thread.sleep(2000);
        juan.should(GivenWhenThen.seeThat(VerificarLogin.aPagina(resultado), Matchers.equalTo(resultado)));
    }

    @Cuando("^realiza busqueda por proyectos$")
    public void realizaBusquedaPorProyectos() {
        juan.attemptsTo(RealizarBusqueda.EnBusqueda("proyectos"));
    }


    @Entonces("^el puede ver (.*)$")
    public void elPuedeVerProyectos(String busqueda) throws InterruptedException {
        Thread.sleep(2000);
        juan.should(GivenWhenThen.seeThat(VerificarBusqueda.aBusqueda(busqueda), Matchers.equalTo(busqueda)));
        juan.attemptsTo(CerrarSesion.eSesion());
    }
}
