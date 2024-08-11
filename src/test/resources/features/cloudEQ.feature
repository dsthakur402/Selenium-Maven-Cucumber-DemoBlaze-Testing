Feature: Adding product to the cart and purchase

  Scenario: validate user is able to Buy produce
    Given User launches the url
    When user click on product from the list
    And user add the product to the cart
    Then user navigates to cart
    And user clicks on the place order button
    And user enters name in the name text field
    And user enter country in the country text field
    And user enter city in the city name text field
    And user enter credit card number in the text field
    And user enter card month in the month text field
    And user enter card expiry year in the year text field
    Then user clicks on the purchase button