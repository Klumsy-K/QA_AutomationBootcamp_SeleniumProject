@predefined
Feature: Smoke steps

  @predefined1
  Scenario: Predefined steps for Google
    Given I open url "https://google.com"
    And I open DevTools
    And I wait for 5 sec
    Then I should see page title as "Google"
    And element with xpath "//*[@name='q']" should be present
    When I type "Behavior Driven Development" into element with xpath "//*[@name='q']"
    And I click on element with xpath "//div[contains (@class,'FPdoLc')]//input[@name='btnK']"
    And I wait for element with xpath "//*[@id='res']" to be present
    Then element with xpath "//*[@id='res']" should contain text "Cucumber"


  @predefined2
  Scenario: Predefined steps for Yahoo
    Given I open url "https://www.yahoo.com"
    Then I should see page title contains "Yahoo"
    And element with xpath "//input[@id='ybar-sbq']" should be present
    When I type "Behavior Driven Development" into element with xpath "//input[@id='ybar-sbq']"
    And I click on element with xpath "//button[@id='ybar-search']"
    And I wait for 1 sec
    And I switch to new window
    And I wait for element with xpath "//div[@id='web']" to be present
    Then element with xpath "//div[@id='web']" should contain text "Cucumber"


  @predefined3
  Scenario: Predefined steps for Gibiru
    Given I open url "https://gibiru.com"
    Then I should see page title contains "Gibiru"
    And I wait for element with xpath "//input[@id='q']" to be present
    When I type "Behavior Driven Development" into element with xpath "//input[@id='q']"
    And I click on element with xpath "//button/*[contains(@class,'search')]"
    And I wait for element with xpath "//div[contains(@class,'col')]/div[contains(@id,'gcse')]" to be present
    And I wait for 1 sec
    Then element with xpath "//div[contains(@class,'col')]/div[contains(@id,'gcse')]" should contain text "Cucumber"


  @predefined4
  Scenario: Predefined steps for Duck Duck Go
    Given I open url "https://duckduckgo.com"
    Then I should see page title contains "DuckDuckGo"
    And I wait for element with xpath "//input[@id='searchbox_input']" to be present
    When I type "Behavior Driven Development" into element with xpath "//input[@id='searchbox_input']"
    And I click on element with xpath "//button [@type='submit']"
    And I wait for element with xpath "//ol[@class='react-results--main']" to be present
    And I wait for 1 sec
    Then element with xpath "//ol[@class='react-results--main']" should contain text "Cucumber"

  @predefined5
  Scenario: Predefined steps for Swiss cows
    Given I open url "https://swisscows.com"
    Then I should see page title contains "Swisscows"
    And I wait for element with xpath "//input[@type='search']" to be present
    When I type "Behavior Driven Development" into element with xpath "//input[@type='search']"
    And I click on element with xpath "//button[@type='submit']"
    And I wait for element with xpath "//div[@class='web-results']" to be present
    And I wait for 1 sec
    Then element with xpath "//div[@class='web-results']" should contain text "Cucumber"

  @predefined6
  Scenario: Predefined steps for Searchencrypt
    Given I open url "https://www.searchencrypt.com"
    Then I should see page title contains "Search Encrypt"
    And I wait for element with xpath "//input[@type='text'][contains(@class,'search')]" to be present
    When I type "Behavior Driven Development" into element with xpath "//input[@type='text'][contains(@class,'search')]"
    And I click on element with xpath "//button[@type='submit']"
    And I wait for element with xpath "//section[@class='serp__results container']" to be present
    And I wait for 1 sec
    Then element with xpath "//section[@class='serp__results container']" should contain text "Cucumber"

  @predefined7
  Scenario: Predefined steps for Startpage.com
    Given I open url "https://www.startpage.com/"
    Then I should see page title contains "Startpage"
    And I wait for element with xpath "//form[@id='search']" to be present
    When I type "Behavior Driven Development" into element with xpath "//input[@id='q']"
    And I click on element with xpath "//form [@id='search']//button[contains(@class,'search')]"
    And I wait for element with xpath "//div[@id='main']" to be present
    And I wait for 1 sec
    Then element with xpath "//div[@id='main']" should contain text "Cucumber"

