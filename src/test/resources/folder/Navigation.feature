@ui @Navigation
@test
Feature: E-commerce Project Web Site Health Check
 
    @test1
    Scenario: User is able to Open the browser, navigate to the URL and Search for Product
    Given User navigated to the home application url
    When User Search for product "Laptop"
    Then Search Result page is displayed
    