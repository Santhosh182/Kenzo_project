 Feature: Checking the fucntionality of Adding items
Scenario: Adding Men shoe accessories.
    Given User login with URL
    And User Accepting the cookies link
    When User navigating to international page link
    And user entered Men sneakers
    And user chosing the colour from the given option
    And user chose the respective shoe
    Then user directed to Add to cart page
    
    Scenario: Adding items to cart.
    Given User login with URL
    When User navigating to international page link
    And user entered Men sneakers
    And user chosing the colour from the given option
    And user chose the respective shoe
    And user selected respective colour
    Then user selected respective size
    
    Scenario: Continue Btn after Adding items to cart.
    Given User login with URL
    And User Accepting the cookies link
    When User navigating to international page link
    And user entered Men sneakers
    And user chosing the colour from the given option
    And user chose the respective shoe
    And user selected respective colour
    And user selected respective size
    And user clicked on the cartbtn
    Then user clicked on ContinueCart Btn 
    
   