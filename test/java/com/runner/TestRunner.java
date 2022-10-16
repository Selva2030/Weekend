package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)

@CucumberOptions(features={"src/test/resources/features/FBCreatenewAcc.feature"},glue= "com.step",dryRun=false,snippets = SnippetType.CAMELCASE,plugin={"html:src\\test\\resources\\Report\\ax.html"})
public class TestRunner {
 
}
