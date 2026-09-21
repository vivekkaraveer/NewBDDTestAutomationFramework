
package com.stad.testautomation.testrunner;

import java.text.SimpleDateFormat;
import java.util.Date;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		features = {"./resources/features/"},
		glue = "com.stad.testautomation.stepdefinitions",
		dryRun = false,
		monochrome = true,
		plugin = {
		        "pretty",
		        //"html:target/cucumber-reports/cucumber.html" 
		    },
		tags = "@sanitytest and not @regression"
		)
public class TestRunner extends AbstractTestNGCucumberTests {
	
	 static {
	        // 1. Generate a unique timestamp string
	        String timestamp = new SimpleDateFormat("hhmmss").format(new Date());
	        
	        // 2. Dynamically build the plugin path property
	        String reportPath = "html:target/cucumber-reports/cucumber_"+timestamp+".html";
	        
	        // 3. Inject it into the Cucumber framework properties before execution
	        System.setProperty("cucumber.plugin", reportPath);
	    }
   
}