Feature: Order History Page
  Scenario: Verify item on the Order History Page
    Given Navigate to automationPractice
    When Click on sing button and enter the username and password"FalcoN"
    Then User should login successfully
    Given Navigate to dresses page
    Then Click on the any item from the page, add to cart, send a message and proceed to check out
    Then Click on the I agree, proceed to checkout button
    Then Click on Pay by bank wire, and i confirm my order button
    Then Back to orders and Click on Reference Number
    Then Verify my last order

