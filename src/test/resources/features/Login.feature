#
#AC - 1 : User should be able to login as HR user with Valid Credentials
#AC - 2 : User should be able to login as Helpdesk user with Valid Credentials
#AC - 3 : User should be able to login as Marketing user with Valid Credentials.

#AC - 4 : User should not be able to login with invalid USERNAME -invalid PASSWORD
#AC - 5 : User should not be able to login with blank USERNAME - blank PASWORD

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
      |                        |          |
      |                        | UserUser |




