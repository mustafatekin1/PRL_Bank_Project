@NewApplicants
Feature: Register new applicants

  @registerNewUserUINegativePassword
  Scenario Outline: Register new users for GMI Bank Negative Password
    Given user is on the main  page
    And user verifies the GMIBANK text
    And navigates the registration pagemenu
    And user enters SSN "<SSN>" number
    And user enters firstname "<firstname>"
    And user enters lastname "<lastname>"
    And user enters address "<address>"
    And user enters phonenumber "<phonenumber>"
    And user enters username "<username>"
    And user enters email "<email>"

    And user enters negative Without Capital Char password "<newpassword>"
    Then  user verifies invalid password message
    And user enters negative Without Small Char password "<newpassword>"
    Then  user verifies invalid password message
    And user enters negative Without Special Char password "<newpassword>"
    Then  user verifies invalid password message
    And user enters negative Without Digits password "<newpassword>"
    Then  user verifies invalid password message
    And user enters new password "<newpassword>"
    And user enters different from first password "<newpassword>"
    Then  user verifies different from first password message
     And user enters new password2 "<newpassword2>"

    And click the register button
    Then verify the success message


    Examples:
      | SSN         | firstname | lastname | address       | phonenumber | username | email            | newpassword  | newpassword2 |
      | 256-45-7862 | James     | Prosper  | Dar-Es-Salaam | 9515555495  | jemo     | jemo45@gmail.com | bug-finder01 | bug-finder01 |