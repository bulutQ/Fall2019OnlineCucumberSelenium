package com.vytrack.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "com/vytrack/step_definitions",
        features = "src/test/resources/features",
        dryRun = false,
        strict = false,
        tags = "@view_calendar_events",
        plugin = {
                "html:target/default-report",
                "json:target/cucumber1.json"
        }
//our framework creates json file, some plugin takes jason file and generates a nice HTML report
//json looks like plain text, has "properties,values" , arrays,Strings,integers,
//json object vs java object
//json object has only properties no method; java object has both properties and methods
//We add json plugin => "json:target/cucumber.json" => to let it generate by our framework
        //JSON- javascript object notation. Contains only properties, objects and collections. There is no methods.
        //Very popular type of document to transmit information between 2 programs --> used for API.
        //JSON natively supported by javascript, because it derives from it.
        //Java as well as other languages have lots of libraries that allow to work with JSON files.

)
public class CucumberRunner {


}
