Feature: Checkout process functionaltiy

  @Checkout
  Scenario: Changing the billing address
    Given User change the Address by selecting new Address
    When User select shipping address
    Then User makes Payment
