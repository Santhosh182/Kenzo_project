package ecommerceProject.kenzoProject;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features="C:\\Users\\yraje\\eclipse-workspace\\kenzoProject\\kenzo_HP.feature", glue="stepDefinition",dryRun=false,monochrome=true, plugin = {"pretty", "html:Reports/kenzo.html"})
public class KenzoCucumberRunner extends AbstractTestNGCucumberTests  {

}
