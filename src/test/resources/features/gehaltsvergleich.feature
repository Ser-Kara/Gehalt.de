@gehaltscheck @smoke
Feature: GehaltsCheck Funktion


  Scenario: Verify that as a user I should be able to send GehaltsCheck results to an Email account
    Given the user is on the main page
    When user logs in with valid credentials
    Then user navigates to "Gehaltsvergleich" menu
    Then user navigates to "Schneller GehaltsCheck" page
    And user inputs the answers of the questions as requirment  information for GehaltsCheck
    And user should see "Ihr Ergebnis wartet auf Sie!" message on the page