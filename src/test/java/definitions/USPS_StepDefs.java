package definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;

import static support.DriverFactory.getDriver;


public class USPS_StepDefs {

    @When("I go to Lookup Zip page by address")
    public void iGoToLookupZipPageByAddress() throws InterruptedException {
//       quick Tools "look up a Zip code" button
        getDriver().findElement(By.xpath("//a[@class='nav-first-element menuitem']")).click();
        getDriver().findElement(By.xpath
                ("//a [@href='https://tools.usps.com/zip-code-lookup.htm']/img[contains (@alt, 'Zip')]"))
                .click();
        Thread.sleep(250);
//        'look up by address' button on next page

        getDriver().findElement(By.xpath(
                "//a[contains(text(),'Find by Address')]")).click();
        Thread.sleep(500);
        Assertions.assertThat(getDriver().getCurrentUrl()).contains("byaddress");
        Assertions.assertThat(getDriver().findElement(By.xpath("//input[@id='tAddress']")).isDisplayed()).isTrue();


    }

    @And("I fill out {string} street, {string} city, {string} state")
    public void iFillOutStreetCityState(String addressStreet, String addressCity, String addressState) {

        getDriver().findElement(By.xpath("//input[@id='tAddress']")).sendKeys(addressStreet);
        getDriver().findElement(By.xpath("//input[@id='tCity']")).sendKeys(addressCity);
        getDriver().findElement(By.xpath("//select[@id='tState']//option[@value='CA'][contains(text(),'California')]")).click();
    }

    @Then("I validate {string} zip code exists in the result")
    public void iValidateZipCodeExistsInTheResult(String zipCode) throws InterruptedException {
        Thread.sleep(250);
       getDriver().findElement(By.xpath("//a[@id='zip-by-address']")).click();
        Thread.sleep(250);
       System.out.println(getDriver().findElement(By.xpath("//ul[contains (@class,'list-group')]")).getText());
       Assertions.assertThat(getDriver().findElement(By.xpath("//ul[contains (@class,'list-group')]")).getText()).contains(zipCode);
    }
}
