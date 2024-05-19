#site: https://www.calculator.net
  @calculator
  Feature: testing the calculator.net functionality

    @BG
      Background:
      Given I go to "calculator" page
      When I navigate to "Inflation Calculator"
      And I clear all values

    @calculator1
    Scenario Outline: Verify calculator results

      Then I verify "Please provide a positive starting amount"
      When I enter "<$ Amount>" dollars from month of "<Start Month>" of year "<Start Year>" to month of "<End Month>" year "<End Year>"
      And I calculate
      Then I verify "277.70" is the buying power
      Examples:
        | $ Amount | Start Month| Start Year| End Month| End Year |
        |   200    |            |   2011    |  March   |   2024   |
        |   1300   |   April    |   2018    |  April   |   2020   |
        |   2100   |  Average   |   1989    | January  |   2001   |
        |  3699.99 |    July    |   1974    | September|   2012   |
