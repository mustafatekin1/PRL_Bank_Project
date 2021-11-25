@login
Feature: user can login with valid credentials

  @customer_login
  Scenario Outline:
    Given user is on the main  page
    And user verifies the GMIBANK text
    And user navigates the sing in page
    And user verifies the sing in page
    And user enters username "<customer_username>"
    And user enters password "<customer_password>"
    And user enters Sing in button
    Then verify that user successfully logins to the account
#    And user navigates the default page
#    And user clicks the My Operations


    Examples:
      |customer_username|customer_password|
      |bf_customer1     |Customer1*       |