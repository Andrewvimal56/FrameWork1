package org.testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "@src\\test\\resources\\failed.txt",glue="org.stepDefination")
public class TestReRunner {

}
