package definitions;

import io.cucumber.java.en.And;
import static org.assertj.core.api.Assertions.assertThat;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static support.DriverFactory.getDriver;

public class AmazonStepdefs {
    @And("I search for {string}")
    public void iSearchFor(String searchStr) {
        getDriver().findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys(searchStr+ Keys.ENTER);

    }

    @And("I verify it contains {string}")
    public void iVerifyItContains(String resultStr) {
        assertThat(getDriver().findElements(By.xpath("//div[@id='search']//h2"))).toString().contains(resultStr);
    }
}
