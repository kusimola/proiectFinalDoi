Feature: Enrollment page
  These tests will verify the flow of the Sign In page

Scenario: Testing "Start the enrollment" button
Given I am on the Software testing course website
When I push the "Start the enrollment" button
Then the sign up page should appear

Scenario: Testing Sign up - Personal Information
Given I am on the sign up page of the Software testing course website
When I fill in the form with valid data
And click next button
Then the Contact information page should appear

Scenario: Testing Sign up - Personal Information - negative
Given I am on the sign up page of the Software testing course website
When I fill in the First Name field with "imola"
And I fill in the Last Name field with ""
And I fill in the Username field with "kusImola"
And I fill in the Password field with "123456"
And I fill in the Confirm password field with "123456"
And click next button
Then the Personal information page should appear

Scenario: Testing Sign up - Personal Information - negative 2
Given I am on the sign up page of the Software testing course website
When I fill in the First Name field with "imola"
And I fill in the Last Name field with ""
And I fill in the Username field with "kusImola"
And I fill in the Password field with "123456"
And I fill in the Confirm password field with "654321"
And click next button
Then the Personal information page should appear


Scenario: Testing Sign up - Personal Information - negative 3
Given I am on the sign up page of the Software testing course website
When I fill in the First Name field with "imola"
And I fill in the Last Name field with "kus"
And I fill in the Username field with "kusImola"
And I fill in the Password field with ""
And I fill in the Confirm password field with "123456"
And click next button
Then the Personal information page should appear

Scenario: Testing Sign up - Contact information
Given I am on the Contact Information page
When I fill in the Email field with "johndoe@yahoo.com"
And I fill in the Phone field with "0526987635"
And I fill in the Country field with "Romania"
And I fill in the City field with "Brasov"
And I fill in the PostCode field with "600600"
And click Contact information next button
Then the Course Options page should appear

Scenario: Testing Sign up - Contact information-negative email-bug
Given I am on the Contact Information page
When I fill in the Email field with "johndoe"
And I fill in the Phone field with "0526987635"
And I fill in the Country field with "Romania"
And I fill in the City field with "Brasov"
And I fill in the PostCode field with "600600"
And click Contact information next button
Then the Contact information page should appear

Scenario: Testing Sign up - Contact information - negative blank field
Given I am on the Contact Information page
When I fill in the Email field with "johndoe@yahoo.com"
And I fill in the Phone field with "0526987635"
And I fill in the Country field with "Romania"
And I fill in the City field with "Brasov"
And I fill in the PostCode field with ""
And click Contact information next button
Then the Contact information page should appear

Scenario: Testing Sign up - Course Options
Given I am on the Course option page
When I click an options from the Course Options list
And the bullet turns blue
And click Course Options next button
Then the Payment information page should appear

Scenario: Testing Sign up - Payment information
Given I am on the Payment page
When I fill in the card holder name with "john doe"
And I fill in the Card number field with "2222 2222 2222 2222"
And I fill in the CVC field with "222"
And I select a month from expiry date
And I select a year from expiry date
And click Payment information next button
Then the Success page should appear

Scenario: Testing Sign up - Success
Given I am on the Success page
When I click the Return to homepage button
Then the Software testing course website's homepage should appear