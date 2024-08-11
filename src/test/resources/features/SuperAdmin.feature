Feature: Login to super Admin

  Scenario: Validate user is able to launch browser
    Given User is on login page
    When User search "java"
    Then User click on second link
#    When  User enters username "demo16"
#    And   User enters password "123456"
#    Then  User clicks on the submit button
