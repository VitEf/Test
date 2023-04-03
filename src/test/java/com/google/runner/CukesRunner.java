package com.google.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty",
                "html:target/cucumber-report.html", //html report
                "me.jvt.cucumber.report.PrettyReports:target/cucumber",
                "rerun:target/rerun.txt",
                "json:target/cucumber.json"}, // cucumber report
        features = "src/test/resources/features",
        glue = "com/google/step_definitions",
        dryRun = false,
        tags = "@wip",
        publish=true)

public class CukesRunner {
}
