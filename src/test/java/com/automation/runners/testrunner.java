package com.automation.runners;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions
(
		features="classpath:folder",
		glue="com.automation.stepdefn",
		tags="@test1",
		plugin= {"pretty",
				"html:target/html/htmlreport.html",
				"json:target/json/file.json",
		},
		publish=true,
		dryRun=false

		)

public class testrunner {

}
