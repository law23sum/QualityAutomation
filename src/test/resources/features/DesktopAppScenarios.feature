Feature: Desktop App Scenarios
  As a user, I want to interact with the desktop app, so that I can insert text, retrieve output, and assert that the output matches the expected value.

  @Regression
  Scenario Outline: Launch and Interact with Desktop App
    Given I have launched the Desktop App
    * I wait till Desktop App Page is loaded
    * I refresh Desktop App Page
    * I wait for 8 seconds
    * I identify the Desktop App Element "<DesktopFieldBox>"
    * I insert text to the Desktop App Element by "<UserFieldInput>"
    * I click the Desktop App Element by "<UserFieldInput>"
    * I identify the Desktop App Element "Desktop Output Display"
    * I retrieve the field values of "Desktop Output Display String"
    * I insert the resultant data into a file type "csv"
    Then I assert the resultant value "<UserFieldInput>" matches the expected value "<UserFieldInput>"

    Examples:
      | DesktopFieldBox | UserFieldInput |
      | 'a'             | 'a'            |
      | 'a'             | 'a'            |
      | 'a'             | 'a'            |