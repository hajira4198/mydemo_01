package hajira_runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber .class)
@CucumberOptions(features="MYDEMODDC2FEATURES",glue="ddc2mystepdefinitions",tags= {"@Smoke"},
plugin={"html:target/cucumber-htmlreport.html"})
public class Myrunner {
	

}
