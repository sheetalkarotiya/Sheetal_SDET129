Feature: QueuePage

  I want to use this as  my feature
  Background: user Registered and logged In into HomePage

    Given user open the application

    When user click to Get Started button

    When user navigate to sign in button

    When user enters Username

    When user enters Password

    Then user should be logged In into Homepage

    Then user click to Get Started button below Queue


  @tc001

  Scenario: Open the DataStructures-Introduction page

    When user click to Get Started button below Queue

    Then User should land on queue page


  @tc002

  Scenario: Open the Implementation of Queue in Python page

    When user click on Implementation of Queue in Python link

    Then user should land on Implementation of Queue in Python page


  @tc003

  Scenario: Open the Practice Questions Page

    When user click on Implementation of Queue in Python link

    When user navigate to practice questions button

    Then User should land on the practice page


  @tc004

  Scenario: Display the try Editor Page with Run button to Test

    When user click on Implementation of Queue in Python link

    When user click the try here button

    Then user should be redirected to the try editor page


  @tc005

  Scenario Outline: Diplay Syntx Error Message

    When user click on Implementation of Queue in Python link

    When user click the try here button

    When user enters the "<input>" in the test page

    And user clicks on Run button

    Then user should get an Syntx error message

    Then user clicks ok Button


    Examples:

      | input |

      | int O |

      | int n |