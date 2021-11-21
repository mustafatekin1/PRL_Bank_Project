@NewApplicants
  Feature: Register new applicants

    @registerNewUserUI
    Scenario Outline: Register new users for GMI Bank
      Given user is on the main  page
      And user verifies the GMIBANK text
      And navigates the registration page
      And user enters SSN "<SSN>" number
      And user enters firstname "<firstname>"
      And user enters lastname "<lastname>"
      And user enters address "<address>"
      And user enters phonenumber "<phonenumber>"
      And user enters username "<username>"
      And user enters email "<email>"
      And user enters new password "<newpassword>"
      And user enters new password2 "<newpassword2>"

      And click the register button
      Then verify the success message


      Examples:
          | SSN         | firstname | lastname | address  | phonenumber | username | email             | newpassword | newpassword2 |
          | 256-45-7862 | faik      | ali      | istanbul | 9515555495  | faik39  | faik39@gmail.com   | 34.Faik-    | 34.Faik-     |