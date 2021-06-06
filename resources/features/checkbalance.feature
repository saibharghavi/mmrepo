@tag
Feature: LPAcceptanceSuite.feature
 
  #QA-LP: LP Acceptance Scenarios: Create user, Assignments, Audience, Attribute and Associate Licence Pools to Audience
  #Checked in by ptambati
  
  @LPACCEPTANCESUITE
  Scenario Outline: Login as admin and verify balance check
    Given Login to the exercise application with valid user
    And I enter values "<value1>" and "<value2>" and "<value3>" and "<value4>" and "<value5>" as the data
    And I validate total balance matches sum of values
    And I validate all the values are not null
Examples:
|  value1   | value2  | value3     | value4    | value5  |
| $122365.4 | $599.00 | $850139.99 | $23329.50 | $566.27 |