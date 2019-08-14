

Feature: Tale functionality test
  

  @tag1
  Scenario: The one where user picks different product through search functionality
    
    When user searches below products in the search box:
    |Head  |
    |Travel|
    |Laptop|
    Then product should be added in the cart if avilable
   


