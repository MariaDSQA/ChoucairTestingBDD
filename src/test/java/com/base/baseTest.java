package com.base;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriverService;

/**
 * @author jovallep
 */
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features",
        glue = "com.base", strict = true)
public class baseTest {
}
