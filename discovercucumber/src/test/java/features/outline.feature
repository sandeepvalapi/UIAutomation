Feature: InvalidLogin

  #Scenario: 
    #Given I am a user
    #When I enter invalid credential
    #Then Error message is shown

  Scenario: 
    Given I have navigated to company site
    When I can see the Home page
    Then I should see welcome message
