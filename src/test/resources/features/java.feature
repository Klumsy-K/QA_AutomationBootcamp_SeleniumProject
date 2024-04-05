@java
  Feature: Java Practice

    @java1
    Scenario: Java 101

    @java2
    Scenario Outline: Print site url to console
      Given I print url for site "<site>"
      Examples:
        |site|
        |Google|
        |Get a Quote|
        |Mazza's Pepperoni Rolls|


    @java3
    Scenario: Print if given number is positive
      Given I print if number 35 is positive

    @java4
    Scenario: Print n-th day of the week
      Given I print "4th" day of the week

