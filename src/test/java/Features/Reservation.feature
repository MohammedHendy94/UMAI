Feature: Reservation
  Scenario: validate that user can reserve a table successfully
    Given user open the reservations tab
    When user select data
    And select the number of people
    And choose a slot time
    And choose the location_popover as "Indoors"
    And user is navigated to contact details screen
    And user enter his first name as "Mohamed" and last name as "Hendy"
    And choose his country code as "EG" and enter phone number as "01023818181"
    And send his email address as "mohamed@hendy.com"
    And click agree to UMAI's terms
    And click confirm reservation button
    And choose to not being a member
    Then the reservation should be confirmed successfully


  Scenario Outline: validate that user cant send invalid data in the contact details page
    Given user open the reservations tab
    When user select data
    And select the number of people
    And choose a slot time
    And choose the location_popover as "Indoors"
    And user is navigated to contact details screen
    And user enter his first name as "<fname>" and last name as "<lname>"
    And choose his country code as "EG" and enter phone number as "01023818181"
    And send his email address as "<email>"
    And click agree to UMAI's terms
    And click confirm reservation button
    Then App should keep the user in the contact details page
    Examples:
      | fname                         | lname             | email
      |                               |                   |
      | -2                            | @                 | 1234
