package definitions;

import io.cucumber.java.en.Given;

public class JavaStepDefs {

    @Given("I print url for site {string}")
    public void iPrintUrlForSite(String site){
        switch(site) {
            case "Google":
                System.out.println("https://www.google.com/");
                break;
            case "Get a Quote":
                System.out.println("https://skryabin.com/market/quote.html");
                break;
            case "Mazza's Pepperoni Rolls":
                System.out.println("http://www.pepperonirolls.net/");
                break;
        }
    }

    @Given("I print if number {int} is positive")
    public void iPrintIfNumberIntIsPositive(int number) {
        if (number >= 0){
            System.out.println("Number is positive");
        }
        else {
            System.out.println("number is not positive");
        }
    }

    @Given("I print url for site <site>")
    public void iPrintUrlForSiteSite(String site) {
        switch(site) {
            case "Google":
                System.out.println("https://www.google.com/");
                break;
            case "Get a Quote":
                System.out.println("https://skryabin.com/market/quote.html");
                break;
            case "Mazza's Pepperoni Rolls":
                System.out.println("http://www.pepperonirolls.net/");
                break;
        }
        
    }

    @Given("I print {string} day of the week")
    public void iPrintDayOfTheWeek(String dayString) {

        String[] days = {"Sunday","Monday", "Tuesday", "Wednesday","Thursday","Friday","Saturday"};
        int dayNum = Integer.parseInt(dayString.replaceAll("[^0-9]", ""));
        for (int i = 0; i < (dayNum); i++){
            System.out.print(days[i]);
                if (i < (dayNum - 1)){
                    System.out.print(", ");
                }
                else {
                    System.out.print(".");
                }

        }
        System.out.println();


    }
}
