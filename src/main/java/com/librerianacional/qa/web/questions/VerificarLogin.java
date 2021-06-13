package com.librerianacional.qa.web.questions;

import com.librerianacional.qa.web.userinterfaces.PaginaInicioUsuario;
import cucumber.api.java.tr.Ve;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static com.librerianacional.qa.web.userinterfaces.PaginaInicioUsuario.LBL_MENSAJE;

public class VerificarLogin implements Question <String> {

    private String resultado;

    public VerificarLogin(String resultado){
        this.resultado=resultado;
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(LBL_MENSAJE).viewedBy(actor).asString();
    }

    public static VerificarLogin aPagina(String resultado){
        return new VerificarLogin(resultado);
    }
}
