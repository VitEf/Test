#Author
#Date
#Description

Feature: First test

  @ui
  Scenario: open browser and search something
    Given user on a main google page
    When user send key in a search box "Mockaroo"
    And user click first "Mockaroo" link
    Then user on main page of "Mockaroo"

