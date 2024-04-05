@quote
Feature: Quote project test suite

  @quote1
  Scenario: Quote end to end smoke test
    Given I go to "quote" page
    And I fill out required fields
    And I submit the page
    And I wait for 2 sec

