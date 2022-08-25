@guest
Feature: Adding a product to the shopping cart as a guest user


Scenario: Add a product to the cart as a guest user
Given user navigates to the website "http://automationpractice.com"
Then hovers the product of no "1"
And adds the product of no "1" to the cart
Then hovers the cart
And asserts that the product is in cart

