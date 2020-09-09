@FHCloginParameters @second
Feature: login feature with parameters

  Scenario: TC01_user should login with manager credentials

    Given user is on the fhctriplogin page
    And user enter valid manager username "manager2"
    And user enter valid manager password "Man1Ager2!"
    And user clicks on login button
    Then verify the manager login is successful

    #HOMEWORK
  @negativetest
  Scenario: TC02_user should not login with incorrect manager credentials
    Given user is on the fhctriplogin page
    And user enter invalid manager username "manager233"
    And user enter invalid manager password "manager233"
    And user clicks on login button
    Then verify the manager login is not successful