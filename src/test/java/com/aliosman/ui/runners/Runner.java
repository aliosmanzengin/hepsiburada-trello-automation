package com.aliosman.ui.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty",
//                "html:target/cucumber-reports.html",
//                "json:target/json-reports/cucumber.json",
//                "junit:target/xml-report/cucumber.xml",
//                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
                },
       features = "./src/test/resources/features/ui_features",
        glue = "ui/stepDefinitions",
        tags = "@SearchFilters",
        dryRun = false
)



public class Runner {

}
