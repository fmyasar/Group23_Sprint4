Feature: Displat Edit User Profile and Contact Information

  Scenario: Display "Edit User Profile" window
    Given user go to Dashboard
    When click username icon
    And click Edit Profile Settings
    Then user should be able to see Edit Profile Page

  Scenario: Display "Contact Information" page
    Given user go to Dashboard
    When click username icon
    And click My Profile
    Then user should be able to see My Profile Page