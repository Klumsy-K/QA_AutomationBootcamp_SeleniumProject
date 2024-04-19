@USPS
  Feature: USPS Verification Scenarios

    @USPS1
    Scenario: ZIP Code verification
      Given I go to "usps" page
      When I go to Lookup Zip page by address
      And I fill out "4970 El Camino Real" street, "Los Altos" city, "CA" state
      Then I validate "94022" zip code exists in the result

#    @ShowAlertBox
#    Scenario: Show and confirm alert box.
#      Given I open url "https://testpages.eviltester.com/styled/index.html"
#      And I click on element with xpath "//a[@id='alerttest']"
#      And I click on element with xpath "//input[@id='confirmexample']"
#      And I wait for 2 sec
#      And I confirm box alert
#      And I wait for 2 sec
    @USPS2
    Scenario: Price Calculator verification
      Given I go to "USPS" page
      When I go to Calculate Price Page # click Send and Calculate a Price for it
      And I select destination "Canada" with "Postcard" shape
      Then I verify for quantity of "2" total cost is "$3.10"

    @USPS3
    Scenario: "Now Hiring" message verification
      Given I go to "USPS" page
      When I click "Find Out More" under Jobs with USPS
      Then I verify "Now hiring" message on the page