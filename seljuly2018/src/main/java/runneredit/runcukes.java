package runneredit;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
	@CucumberOptions(features="src/main/java/logwithpom.feature" ,glue= {"pagescucum","runnerclass"},monochrome=true)
	public class runcukes {
	
}