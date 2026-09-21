Feature: Exceptions 

@regression
Scenario: Verify Test Exceptions Page Title 
    
    Given User launches the chrome browser
    When User opens URL "https://practicetestautomation.com/"
    And User clicks on Practice link
    And User clicks on Test Exceptions link
    Then Page title should be "Test Exceptions | Practice Test Automation"
    And Close browser

