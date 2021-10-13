package co.com.choucair.automatizacion.utest.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/utestAutomatizacion.feature",
        tags = "@tag1",
        glue = "co.com.choucair.automatizacion.utest.stepdefinitions",
        snippets = SnippetType.CAMELCASE)

public class RunnerTags {
}
