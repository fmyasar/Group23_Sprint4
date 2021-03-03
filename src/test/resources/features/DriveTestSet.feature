Feature: 

	#As a user, I should be able to use Drive function on Activity Stream.
	#AC - 1 : User should be able to display "My Drive" window by clicking "My Drive" tab
	#
	@NEX-177 @NEX-201 @CRM
	Scenario Outline: Verify that user displays "My Drive" window by clicking "My Drive" tab
		Given the user log in as "<userType>" user
		When the user click Drive button on Activity Stream menu
		And the user click My Drive button
		Then the user displays My Drive window
		
		Examples:
		  | userType       |
		  | help desk      |
		  | human resource |
		  | marketing      |	

	#As a user, I should be able to use Drive function on Activity Stream.
	#AC - 2 : User should be able to display "Company Drive" window by clicking "Company Drive" tab
	#
	@NEX-178 @NEX-201 @CRM
	Scenario Outline: Verify that user displays "Company Drive" window by clicking "Company Drive" tab
		Given the user log in as "<userType>" user
		When the user click Drive button on Activity Stream menu
		And the user click Company Drive button
		Then the user displays Company Drive window
		
		Examples:
		  | userType       |
		  | help desk      |
		  | human resource |
		  | marketing      |