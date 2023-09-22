@DSPortal
Feature: DSPortal Application
I want to use this template for my feature file



Background:
Given  user open the application of DSPortalapp <https://dsportalapp.herokuapp.com/> 
Then   user land on DS Portal Application page



@testcase001
Scenario Outline: Open the  of DSPortalapp Application
Given  user open the application of DSPortalapp <https://dsportalapp.herokuapp.com/> 
Then   user land on DS Portal Application page

Examples: 
| url                                | 
| https://dsportalapp.herokuapp.com/ |




@testcase002
Scenario Outline: Open the  of DSPortalapp Application
When user click to get to <button> button
Then user navigate to homepage
Examples: 
| url                                     | button |
| https://dsportalapp.herokuapp.com/ | get started |



