Feature: QueuePage

  I want to use this as my feature
  Background: user Registered and logged In into HomePage

    Given user open the application

    When user click to Get Started button

    When user navigate to sign in button

    When user enters Username

    When user enters Password

    Then user should be logged In into Homepage

    When user navigate to dropdown of data-structures

    When user click the queue button


  @tc001

  Scenario: Open the Queue page from the Data-Structures Dropdown

    Then User should redirected to Queue page

  @tc002

  Scenario: Open the Implementation of Queue in Python page

    Then User should redirected to Queue page

    When user click on Implementation of Queue in Python link

    Then user should land on Implementation of Queue in Python page

    When user click the try here button

    Then user will land on TryEditor page

    When user enters Message in the Box

    When user click Run button

    Then user should see the Print Message in the Try Editor Box

  @tc003

  Scenario: Display the try Editor Page with Run button to Test

    Then User should redirected to Queue page

    When user click on Implementation of Queue in Python link

    When user click the try here button

    Then user should be redirected to the try editor page

  @tc004

  Scenario Outline: Diplay Syntx Error Message

    Then User should redirected to Queue page

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

  @tc005

  Scenario: Open the Implementation of collections.deque

    Then User should redirected to Queue page

    When user click on Implementation using collections.deque

    Then user should land on Implementation using collections.deque

    When user click the try here button

    Then user will land on TryEditor page

    When user enters Message in the Box

    When user click Run button

    Then user should see the Print Message in the Try Editor Box

  @tc006

  Scenario: Open the Implementation using Array

    Then User should redirected to Queue page

    When user click on Implementation using Array

    Then user should land on Implementation using Array

    When user click the try here button

    Then user will land on TryEditor page

    When user enters Message in the Box

    When user click Run button

    Then user should see the Print Message in the Try Editor Box

  @tc007

  Scenario: User opens Queue operations page and get output

    Then User should redirected to Queue page

    When user clicks on Queue Operations

    Then user should land on Queue Operations

    When user click the try here button

    When user enters the code "print('Hello World')" in the test page

    And user clicks on Run button

    Then user should see output

  @tc008
  Scenario: Open the Blank page of Practice Questions and sign out

    Then User should redirected to Queue page

    When user click on Implementation of Queue in Python link

    When user clicks to the Practice Questions Button

    Then user redirected to the practice questions page

    Then user will Sign out