Feature: Login 

Background: Common Steps
    Given User launches the chrome browser
    When User opens URL "https://practicetestautomation.com/"
    And User clicks on Practice link
    And User clicks on Test Login Page link

@sanitytest
Scenario: Successful Login With Valid Credentials

    And User enters Username as "student" and password as "Password123"
    And Clicks on Submit button
    Then Page title should be "Logged In Successfully | Practice Test Automation"
    And Close browser
    
@regression    
Scenario Outline: Data Driven Testing-Login With Valid and Invalid Credentials

    And User enters Username as "<username>" and password as "<password>"
    And Clicks on Submit button
    Then Page title should be either "Logged In Successfully | Practice Test Automation" or "Test Login | Practice Test Automation"
    And Close browser
    
    Examples:
      |username|password|
      |student|Password321|
      |student|Password123|

@sanitytest @regression
Scenario: Verify Logout functionality   

    And User enters Username as "student" and password as "Password123"
    And Clicks on Submit button
    Then Page title should be "Logged In Successfully | Practice Test Automation"
    And Click on Logout button
    Then Page title should be "Test Login | Practice Test Automation"
    And Close browser       
