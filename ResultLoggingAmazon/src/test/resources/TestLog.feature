Feature: Testing the ResultLogging Feature
 @demo
   @smoke
    @regression
     @smokeSomeField
  Scenario: Amazon search
    Given I am on amazon home page
    And I search for <iphone charger>
    Then Search result should be displayed

  Scenario: Amazon search 2
    Given I am on amazon home page
    And I search for <lamp>
    Then Search result should be displayed