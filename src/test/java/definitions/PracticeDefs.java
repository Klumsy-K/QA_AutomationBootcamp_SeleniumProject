package definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static support.DriverFactory.getDriver;

public class PracticeDefs {

    @Given("I open url {string}")
    public void iOpenUrl(String url) {
        getDriver().get(url);
    }

    @And("I wait for color change")
    public void iWaitForColorChange() {
        WebElement colorchangebuttn = getDriver().findElement(By.xpath("//button[@id='colorChange']"));
        new WebDriverWait(getDriver(), Duration.ofSeconds(6)).until(d -> colorchangebuttn.getAttribute("class").contains("text-danger"));
    }
}
