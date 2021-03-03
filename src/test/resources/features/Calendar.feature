@aa
Feature: Calendar Page

	#* As a user I should be able to use Calendar function on Activity Stream.
	#
	#
	#
	#* User should be able to display My Calendar by clicking "My Calendar" tab.
  @NEX-175
  Scenario Outline: Verify that user should be able to display My Calendar by clicking "My Calendar" tab
    Given the user log in as "<userType>" user
    When the user click the Calendar button on Activity Stream
    And the user click My Calendar button
    Then the user displays My Calendar

    Examples:
      |userType|
      |help desk|
      |human resource|
      |marketing|

			#* As a user I should be able to use Calendar function on Activity Stream.
	#
	#
	#
			#User should be able to display Company Calendar by clicking "Company Calendar" tab
  @NEX-176 @CRM
  Scenario Outline: Verify that user should be able to display Company Calendar by clicking "Company Calendar" tab
    Given the user log in as "<userType>" user
    When the user click the Calendar button on Activity Stream
    And the user click Company Calendar button
    Then the user displays Company Calendar

    Examples:
      |userType|
      |help desk|
      |human resource|
      |marketing|