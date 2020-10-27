#Author: Ravi Kumar Yakkatela
#Date:25/10/2020
#Step_Def: Steps.java

@Automation
Feature: Automation Practice

  @TC-1234 @OrderItem
  Scenario: Verify user is able to select the lowest price item and able to checkout and complete the transaction process
    Given Open chrome browser and launch the appliation URL
    And Login using username "zarmanshah@malomiesed.com" and password "Testing123"
    When User searched with keyword "printed" in the global search
    Then User select the "lowest" cost item
    And User adds selected item to cart
    Then User check out the cart and complete the transaction
    And User loggoff and close the browser
