package iLab_Assessment;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/iLab_Assessment/featureFiles"},
        glue = {"iLab_Assessment/stepDefinitions"},
        monochrome = true,
        tags = "@PositiveLogin or @ListOfHotelsInLocation or @IterateHotelList",
        plugin = {"pretty", "html:reports/report.html"})
public class TestRunner {
}
