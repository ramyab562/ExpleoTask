package com.qa.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "C:/workspace/IrishLife_CucumberTask/src/test/resources/com.qa.features/HomePage.feature",
		glue={"com/qa/stepdefinitions"},
		plugin= {
				"html:test-outout", 
				"json:json_output/cucumber.json", 
				"junit:junit_xml/cucumber.xml",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
				}, //to generate different types of reporting
		monochrome = true, //display the console output in a proper readable format
		strict = true, //it will check if any step is not defined in step definition file
		dryRun = false //to check the mapping is proper between feature file and step def file
		
		)

public class TestRunner {

}

	