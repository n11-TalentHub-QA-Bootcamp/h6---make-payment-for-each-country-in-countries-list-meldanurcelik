Feature: Make payment for each country in countries list

  @payment
  Scenario Outline: I make a payment for each country
    When I login with the correct username and password
    Then I should see the home page and go to payment page
    Then Pay with "<phone>", "<name>", "<amount>" and "<country>"
    Examples:
      | phone       | name  | amount | country     |
      | 05555555555 | melda | 5      | India       |
      | 05555555555 | melda | 5      | USA         |
      | 05555555555 | melda | 5      | Iceland     |
      | 05555555555 | melda | 5      | Greenland   |
      | 05555555555 | melda | 5      | Switzerland |
      | 05555555555 | melda | 5      | Norway      |
      | 05555555555 | melda | 5      | New Zealand |
      | 05555555555 | melda | 5      | Greece      |
      | 05555555555 | melda | 5      | Italy       |
      | 05555555555 | melda | 5      | Ireland     |
      | 05555555555 | melda | 5      | China       |
      | 05555555555 | melda | 5      | Japan       |
      | 05555555555 | melda | 5      | France      |
      | 05555555555 | melda | 5      | Russia      |
      | 05555555555 | melda | 5      | Australlia  |
      | 05555555555 | melda | 5      | Canada      |



