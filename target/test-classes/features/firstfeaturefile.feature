@googlesearch @first
Feature:Google search

  Background: User is on the google page
    Given user is on the google page

  @iphone
  Scenario: TC01_User searches iphone on google
    And user searches for iphone
    Then verify the result has iphone

  @teapot
  Scenario: TC02_User searches tea pot on google
    And user searches for tea pot
    Then verify the result has tea pot