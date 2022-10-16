package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.core.snippets.SnippetType;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/test/resources/features/AmazonClassWork.feature"} ,glue="com.step", dryRun=false, monochrome=true )
//@CucumberOptions(features = {"src/test/resources/features/SampleAmazon.feature" }, 
glue ="com.step",dryRun = false, monochrome = true, snippets = SnippetType.CAMELCASE)
public class TestRunnerAmazonClassWork {

}
