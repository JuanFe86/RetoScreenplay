package com.librerianacional.qa.web.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/login.feature",
        glue = "com.librerianacional.qa.web.stepdefinitions",
        snippets = SnippetType.CAMELCASE,
        tags = "@PruebaExitosa1"
)

public class LoginRunner {
}
