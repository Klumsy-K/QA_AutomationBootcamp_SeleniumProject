package definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;

import static support.DriverFactory.getDriver;

public class CommonStepDefs_KP {
    @Given("I go to {string} page")
    public void iGoTo(String pageName) {
        if(pageName.equals("quote")) {
            getDriver().get("https://skryabin.com/market/quote.html");
        }
        if (pageName.equals("google")){
            getDriver().get("https://www.google.com");
        }
        if (pageName.equalsIgnoreCase("usps")){
            getDriver().get("https://www.usps.com/");
        }
        if (pageName.equalsIgnoreCase("calculator")){
            getDriver().get("https://www.calculator.net");
        }
        else {
            throw new Error("Page name unrecognized: "+pageName);
        }
    }

    @And ("I fill all required fields")
    public void iFillReqFields(){

//      Username
        getDriver().findElement(By.xpath("//input [@name ='username']")).sendKeys("IvanB");
//      e-mail
        getDriver().findElement(By.xpath("//input [@type ='email']")).sendKeys("Ivanushka@massolit.ru");

//      Password
        getDriver().findElement(By.xpath("//input[@id='password']")).sendKeys("Yalta666");

//      Confirm Password
        getDriver().findElement(By.xpath("//input[@id='confirmPassword']")).sendKeys("Yalta666");

//      Name
        getDriver().findElement(By.xpath("//input [@name ='username']")).sendKeys("Ivan Bezdomny");

//      3rd Party Checkbox
        getDriver().findElement(By.xpath("//label[@aria-required='true']/input[@type='checkbox']")).click();

    }

    @And ("I submit the page")
    public void iSubmitPage(){

        getDriver().findElement(By.xpath("//button [@name='formSubmit']")).click();
    }


    @And("I confirm box alert")
    public void iConfirmBoxAlert() {
        getDriver().switchTo().alert().accept();
    }
}

