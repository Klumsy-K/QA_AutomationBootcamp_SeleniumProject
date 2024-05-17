package definitions;

import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static support.DriverFactory.getDriver;

public class PracticeDefs {

    @And("I wait for color change")
    public void iWaitForColorChange() {
        WebElement colorchangebuttn = getDriver().findElement(By.xpath("//button[@id='colorChange']"));
        new WebDriverWait(getDriver(), Duration.ofSeconds(6))
                .until(d -> colorchangebuttn
                        .getAttribute("class").contains("text-danger"));
        System.out.println(colorchangebuttn.getAttribute("class"));

    }
}
