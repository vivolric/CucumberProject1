Feature: Specials Page
  Scenario: Verify discount items
    Given Navigate to automationPractice
    When Click on sing button and enter the username and password"FalcoN"
    Then User should login successfully
    Then Navigate to SpecialsPage
    Then Verify items has a discount

