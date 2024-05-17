#Site: www.amazon.com

  @outlines
  Feature:  Outlines practice on amazon.com

  @Outline1
  Scenario Outline: Programming contains "art"
    Given I go to "amazon" page
    And I wait for 5 sec
    And I search for "<search string>"
    And I verify it contains "<search result>"
    Examples:
      |search string       |     search result|
      |programming         |  the art         |
      |software development|clean architecture|
    