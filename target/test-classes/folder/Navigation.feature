@ui @healthcheck
@test
Feature: E-commerce Project Web Site Health Check

@test1
  Scenario: User is able to Open the browser, navigate to the URL and Search for Product
    Given User opened browser
    And User navigated to the home application url
    When User Search for product "Laptop"
    Then Search Result page is displayed
    
    
    @test2
    Scenario: User is able to Open the browser, navigate to the URL and Search for Product
    Given User navigated to the home application url
    When User Search for product "Laptop"
    Then Search Result page is displayed
    
    @test3
    Scenario: User is able to Open the browser, navigate to the URL and click on sign in button
    Given User redirected to  url
    When User click on sign in button
    Then Sign in page is displayed
    
   @test4
   Scenario: User is able to open url,click on alert button and alert gets displayed
   Given User opened url
   And User click on alert with ok button
   When User click display alert box button in red color
   Then Alert is displayed