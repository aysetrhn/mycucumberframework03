@fhclogin
  Feature: Login feature

    Scenario: TC01_user should login with positive credentials
      Given  user is on the fhctriplogin page
      And enter correct name and password
      Then verify the login is successfull
