@registered
Feature: Adding a product to the cart as a registered user

  Scenario: Successful Login with Valid entries and add a product to the cart

  Given user navigates to the website "http://automationpractice.com"
  When  User Navigate to Login Page
  And  enters a valid email
  And enters a valid password
  Then login must be successful
  Then navigates to homepage
  Then hovers the product of no "3"
  And adds the product of no "3" to the cart
  Then hovers the cart
  And asserts that the product is in cart



