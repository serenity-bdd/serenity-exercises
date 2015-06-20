Feature: Search by keyword
  In order for buyers to find what they are looking for more efficiently
  As a seller
  I want buyers to be able to search for articles by keywords

  Scenario: Search for articles by keyword
    Given I want to buy an antique spoon
    When I search for 'spoon'
    Then I should see only articles related to the word 'spoon'
