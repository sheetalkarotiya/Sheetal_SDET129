@DSPortal
Feature: DSPortal
I want to use this template for my feature file





@testcase002
Scenario Outline: Open the homepage of DSPortalapp
Given user open the application of DSPortalapp <https://dsportalapp.herokuapp.com/> 
When user click to get to <button> button
Then user navigate to homepage
Examples: 
| url | button |
| https://dsportalapp.herokuapp.com/ | get started |

