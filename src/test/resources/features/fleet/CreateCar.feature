@create_car
Feature: Create a car
  As user, I want to able to be add new cars

  Scenario: Add new car
    Given user is on the login page
    When user logs in as a sales manager
    Then user navigates to "Fleet" and "Vehicles"
    And user click to create a car button
    Then user creates a car with following info:
      | License Plate | Driver     | Location    | Model Year | Color |
      | SDET          | Pro Tester | Rome, Italy | 2020       | Red   |
    And user verifies that car info is displayed
      | License Plate | Driver     | Location    | Model Year | Color |
      | SDET          | Pro Tester | Rome, Italy | 2020       | Red   |

  @create_car_DDT
  Scenario Outline: Add new car <driver>
    Given user is on the login page
    When user logs in as a sales manager
    Then user navigates to "Fleet" and "Vehicles"
    And user click to create a car button
    Then user creates a car with following info:
      | License Plate | Driver     | Location    | Model Year | Color |
      | <license_plate> | <driver>     | <location>    | <model_year> | <color> |
    And user verifies that car info is displayed
      | License Plate | Driver     | Location    | Model Year | Color |
      | <license_plate> | <driver>     | <location>    | <model_year> | <color> |


    Examples: cars test data
      | license_plate | driver | location | model_year | color |
      |0045           |cybertek|California|2014        |blue   |
      |4795           |test_driver|Florida|2004        |yellow |
      |123            |driver_test|New York|2017       |purple |
