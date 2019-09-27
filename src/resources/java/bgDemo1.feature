Feature: Back Ground Demo

Background: User Login
Given User is in the Login Page
When User enters valid credentials and performs Login
Then User must be navigated to the Home Page

@ProductTest
Scenario: Search Product
Given User must be in the search page
When User searches for a product by category
Then product description is displayed

@RegressionTest
Scenario: Add to Cart
Given Search the product to purchase
When Select the product and add it to cart
Then Product is successfully added to the cart 