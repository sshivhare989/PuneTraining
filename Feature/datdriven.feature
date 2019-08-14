Feature: Login Functionality

	@datadriven
	 Scenario: Chnage the order details
    Given User add items to cart and change quantity
    When user enter the number of quantity and add 2 item to cart
    Then user proceed to checkout
	
	