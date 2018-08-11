package week2.day1;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features ="./Myfile.feature",glue="week2.day1")

public class Runner {

}
