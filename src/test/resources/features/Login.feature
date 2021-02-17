
@wip
Feature: Login

  Scenario Outline: Login with valid credential as a <userType>
    Given the user is on the login page
    When the user logs in as "<userType>"
    Then the user should be able to see Activity Stream page

    Examples:
      | userType  |
      | HR        |
      | HelpDesk  |
      | Marketing |


  Scenario Outline: Login with invalid credentials: username = <username>; password = <password>
    Given the user is on the login page
    When the user logs in with following credentials
      | username | <username> |
      | password | <password> |
    Then the user should see an error message

    Examples:
      | username               | password |
      | helpdesk_username      | fdsfg324 |
      | helpdesk_username      |          |
      | humanresource_username | fdsfg324 |
      | humanresource_username |          |
      | marketing_username     | fdsfg324 |
      | marketing_username     |          |
      | dfgdklgklf             | fdsfg324 |
      | safkmksgsf             | UserUser |
      |                        | UserUser |
      |                        |          |




