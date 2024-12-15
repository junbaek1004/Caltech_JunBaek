Feature: Login to the Client Management App

    Scenario: Successful Login

        Given I am on the login page
        When I enter a valid email and password
        And I click the login button
        Then I should see the alert

