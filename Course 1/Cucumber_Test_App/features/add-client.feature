Feature: Add a new Client

    Scenario: Add a client successfully

        Given I am logged into the dashboard
        When I navigate to the "Add Client" page
        And I fill in client details
        And I click the "Add Client" button
        Then I should see a confirmation message