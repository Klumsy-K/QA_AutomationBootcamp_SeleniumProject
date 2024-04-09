@USPS
  Feature: USPS Verification Scenarios

    @USPS1
    Scenario: ZIP Code verification
      Given I go to "usps" page
      When I go to Lookup Zip page by address
      And I fill out "4970 El Camino Real" street, "Los Altos" city, "CA" state
      Then I validate "94022" zip code exists in the result