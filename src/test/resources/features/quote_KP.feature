@quote
  Feature: Quote project test suite

#    @quote1
#    Scenario: Quote end to end
#      Given I go to "www.google.com"
#
    @quote2
    Scenario: Quote end to end smoke test
      Given I go to "quote" page
      And I fill all required fields
      And I submit the page
      And I wait for 5 sec