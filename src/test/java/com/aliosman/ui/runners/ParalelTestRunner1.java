package com.aliosman.ui.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions (
        plugin = {"pretty",
                "html:target/Paralel1_cucumber-reports.html",
                "json:target/json-reports/Paralel1_cucumber.json",
                "junit:target/xml-report/Paralel1_cucumber.xml",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        features = "src/test/resources/features/ui_features",
        glue = "src/test/java/ui/stepDefinitions",
        tags="@Paralel1"  ,

        dryRun= false
)

public class ParalelTestRunner1 {

}
