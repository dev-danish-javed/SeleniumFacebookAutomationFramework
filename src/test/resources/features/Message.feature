Feature: Facebook messaging

  @Facebook @fbMessaging
  Scenario: Check facebook messaging feature
    Given User navigates to "facebook"
    Then User login in the site using id "facebookEmailId" and password "facebookPassword"
    And User clicks on Messenger button
    And User search for "person" in messenger
    And User clicks on persons "person" chat
    And User types message "message"
    And User clicks send button
    And User logs out
    And User closes the browser