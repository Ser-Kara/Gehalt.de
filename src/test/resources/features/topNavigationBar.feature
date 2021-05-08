@navigation @smoke
Feature: Top Navigation Bar Functionality

 Scenario Outline: Verify the titles of the navigation menu
   Given the user is on the main page
   When user logs in with valid credentials
    And user navigates to "<tab>" menu
    Then page title should contains "<title>"



   Examples:
     |tab                 |title                                                          |
     |Brutto Netto Rechner|Brutto-Netto-Rechner 2021 - Was bleibt netto vom Brutto?       |
     |Gehaltsvergleich    |Kostenloser Gehaltsvergleich für Ihren Beruf                   |
     |Berufe              |Berufe und Jobs - Beschreibung Tätigkeiten und Gehalt          |
     |Branchen            |Gehalt - Arbeit - Lohn und Jobs nach Branchen unterschieden    |
     |Jobbörse            |Jobs und Stellenangebote                                       |
     |Karriere A-Z        |Arbeitssuche - Arbeit - Bewerbungen - Informationen von A bis Z|
     |News                |News - Studien - Ratgeber                                      |
