package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
	@CucumberOptions(features="src/main/java/editlead.feature" ,glue= {"editlead.pages.cucu","runnerclass"},monochrome=true)
	public class runcukes {
	
}