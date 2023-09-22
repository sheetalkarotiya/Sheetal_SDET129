
@tag
Feature:DSPortal_Homepage
  I want to use this template for my feature file

  @tag2
  Scenario Outline: open the Datastructures-Introduction
    Given user open the application of DSPortal  <app>
    When  user click to get to <button> button
    Then user land on DSPortal Homepage
    When user clicks the <click> button below the Datastructures-Introduction
    Then user should get an Alert Message 
   
  
    

   
   
   Examples: 
| app                                | button      |     click  |                
| https://dsportalapp.herokuapp.com/ | get started |   get started |

   