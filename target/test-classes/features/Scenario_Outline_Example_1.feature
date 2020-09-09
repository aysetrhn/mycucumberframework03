@datatable4 @third
Feature: scenario outline example
  Scenario: testing the data tables web page
    Given User is on the datatables homepage
    When User clicks on new button
    And User enters first name "first name"
    And User enters last name "last name"
    And User enters position "QA"
    And User enters office "Athens"
    And User enters extension "77777"
    And User enters start date "2020-07-27"
    And User enters salary "90000"
    And User clicks Create button
    And User enters first name "first name" to the searchbox
    Then verify that user see the first name "first name" in the searchbox