Feature: Google search functionality
  Agile story: As a user, when ı am on the Google search page
  I should be able to search whatever ı want and ı see relevant information

  Scenario: Search page title verification
    When user is on Google search page
    Then user should see title is Google


    Scenario: Scenario: Search functionality result title verification
      Given user is on Google search page
      When user types apple and clicks enter
      Then user sees apple in the google title


  Scenario: Scenario: Search functionality result title verification
    Given user is on Google search page
    When user types "apple" and clicks enter
    Then user sees "apple" in the google title

