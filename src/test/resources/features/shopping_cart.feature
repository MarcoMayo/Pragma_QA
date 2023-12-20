# new feature
# Tags: optional

Feature: Shopping Cart
  As a Blazedemo user
  I want to add products
  to be able to buy

  Scenario: Add product to the Shopping Cart
    Given the user is on the main page
    When he add a product to the the shopping cart "Nokia Lumia 1520"
    Then he should see the product "Nokia lumia 1520"

  Scenario: Add multiple products to the shopping cart
    Given the user is on the main page
    When he add multiple products to the cart "Sony Xperia Z5" and "Nokia Lumia 1520"
    Then the products should be visible in the shopping cart

  Scenario: Shopping cart empty
    Given the user is on the main page
    When he navigate to the shopping cart with no products
    Then he can see that the cart is empty

  Scenario: Remove product from the Shopping Cart
    Given the user is on the main page
    And he add a product to the the shopping cart "Nokia Lumia 1520"
    When he remove a product from the cart
    Then he can see that the cart is empty

  Scenario: Update product quantity in the Shopping Cart
    Given the user is on the main page
    And he add a product to the the shopping cart "Sony Xperia Z5"
    When he update the quantity of a product in the cart "Sony Xperia Z5"
    Then he should see the updated quantity in the shopping cart

  Scenario: Validate total price in the Shopping Cart
    Given the user is on the main page
    And he add multiple products to the cart "Galaxy S7" and "Google Nexus 6"
    When he navigate to the shopping cart
    Then he should see the total "1450"
