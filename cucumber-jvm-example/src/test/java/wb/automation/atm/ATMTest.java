package wb.automation.atm;

import cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@Cucumber.Options(format = { "pretty", "html:target/cucumber", "json:target/cucumber.json" }, glue = "wb.automation.atm"
,features = {
		"wb/auto/features" }, monochrome = true)
public class ATMTest {

}
