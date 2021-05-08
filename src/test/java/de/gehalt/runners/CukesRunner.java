package de.gehalt.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json",
                "html:target/default-html-reports",
                "rerun:target/rerun.text" },
        features = "src/test/resources/features",
        glue = "de/gehalt/stepdefs",
        dryRun = false,
        tags = "@smoke"
)

public class CukesRunner {
}
