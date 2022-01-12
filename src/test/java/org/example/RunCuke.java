package org.example;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".", tags = "@test and not @smoke and not @regression", plugin =  { "pretty", "html:target/cucumber/report.html" } )
//to run multiple tags together to use @test or @smoke
public class RunCuke {
    
}
