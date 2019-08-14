Feature: Login Functionality

@Login
  Scenario: Login with valid credentials
    Given Navigate to homePage
    When User enters "Shank@gmail.com" And "Shank@123"
    Then User logged in succefully
	
	
	