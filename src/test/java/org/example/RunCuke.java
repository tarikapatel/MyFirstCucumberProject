package org.example;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".", tags = "@test and not @regression and not @smoke", plugin =  { "pretty", "html:target/cucumber/report.html" } )

public class RunCuke {
}
