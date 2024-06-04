package runner;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features= "src/test/resources/features" , 
glue = {"StepDefinitions"} ,
plugin = {"pretty","rerun:target/failedcases.txt"})





public class runner extends AbstractTestNGCucumberTests{

}
