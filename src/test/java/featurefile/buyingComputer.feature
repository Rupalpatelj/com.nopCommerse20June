Feature: buy a Computer
  As a Customer i want to buy a Computer so i select and navigate to loginpage

  Scenario:
    Given As i am on HomePage
    When i select Computer
    And i should navigate to different category of computer
    And i click on Desktop
    And i should navigate to different kinds of computer
    And i choose digital storm and click add to cart
    And i click on shopping cart
    And i click to accept terms-condition and click checkout
    Then i should navigate to loginpage to pay

