Feature: Main page
  These tests will verify the functionality of the Software testing Course site

  Scenario: Testing "Read more" button of Learning the Fundamentals category
    Given I am on the Software testing course website
    When I push the Fundamentals "Read more" button
    Then the Fundamentals page should appear

  Scenario: Testing Newsletter field
    Given I am on the Software testing course website
    When I complete the newsletter field with "johndoe@gmail.com"
    And click submit button
    Then a pop up window should appear

  Scenario: Testing Newsletter field - negative
    Given I am on the Software testing course website
    When I complete the newsletter field with "johndoe"
    And click submit button
    Then the pop up window does not appear

  Scenario Outline: Click multiple buttons FAQ section
    Given I am on the Software testing course website
    When I click the <first> button
    And I click the <second> button
    Then the <first> button should be closed
    And the <second> should be expanded

    Examples:
      | first | second |
      | 1     | 2      |
      | 3     | 4      |


  Scenario Outline: Click multiple buttons FAQ section - page rearrange
    Given I am on the Software testing course website
    When I click the <first> button
    Then the <first> button should expand and the page dynamically rearrange itself

    Examples:
      | first |
      | 2     |
      | 4     |

  Scenario Outline: Click multiple buttons FAQ section - expand revert
    Given I am on the Software testing course website
    When I click <first> button that is already expanded
    Then the <first> button should revert back to the initial state

    Examples:
      | first |
      | 1 |
      | 4 |


