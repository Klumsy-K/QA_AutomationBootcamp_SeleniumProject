package definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import static support.DriverFactory.getDriver;

public class CalculatorStepDefs {
    @And("I calculate")
    public void andICalculate (){
    }

    @When("I navigate to {string}")
    public void iNavigateTo(String pageChoice) {
        switch (pageChoice){
            case "Inflation Calculator":
                getDriver().findElement(By.xpath("//a[contains(text(),'Inflation Calculator')]"));
                break;
        }
    }

    @And("I clear all values")
    public void iClearAllValues() {
    }

    @Then("I verify {string}")
    public void iVerify(String arg0) {
    }

    @When("I enter {string} dollars from month of {string} of year {string} to month of {string} year {string}")
    public void iEnterDollarsFromMonthOfOfYearToMonthOfYear(String arg0, String arg1, String arg2, String arg3, String arg4) {
    }

    @Then("I verify {string} is the buying power")
    public void iVerifyIsTheBuyingPower(String arg0) {
    }
}
