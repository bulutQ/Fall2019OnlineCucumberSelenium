Feature: Login
  As a user, I wan to be able to login with username and password
  #Agile Story
 # Test Method = Test Case = Scenario:
 # Test + DataProvider = Scenario Outline: Examples table

  Scenario: Login as sales manager and verify that title is Dashboard
    Given user is on the landing page
    When user logs in as a sales manager
    Then user should verify that title is a Dashboard

  Scenario: Login as store manager and verify that title is Dashboard
    Given user is on the landing page
    When user logs in as a store manager
    Then user should verify that title is a Dashboard

  Scenario: Login as truck driver and verify that title is Dashboard
    Given user is on the landing page
    When user logs in as a truck driver
    Then user should verify that title is a Dashboard