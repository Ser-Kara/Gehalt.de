@login @smoke
Feature: Login functionality

  Background:
    Given the user is on the main page

  Scenario: Verify that only authorized users should be able to login to the application
    When user logs in with valid credentials
    Then "Ihr GEHALT.de Profil" header text should be displayed


  Scenario Outline: Verify that users should not able to login with invalid credentials

    When user logs in with "<username>" and "<password>"
    Then "<error message>"  should be displayed

    Examples:
      |username             |password     |error message                                            |
      |fake@mail.de         |233795Ssk.   |Ihre E-Mail-Adresse oder Ihr Passwort sind nicht korrekt |
      |baskara2@hotmail.com |wrong        |Ihre E-Mail-Adresse oder Ihr Passwort sind nicht korrekt |
      |fake@mail.de         |wrong        |Ihre E-Mail-Adresse oder Ihr Passwort sind nicht korrekt |
