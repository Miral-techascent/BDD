Feature: Nopcommerce Register
  Background:
    Given User able to open Browser
    And Enter URL

    Scenario: Nopcommerce Registration
      When User click on Register Link
      Then User on Register page and  verify Register page title
      And Select Gender
      Then Enter First Name
      And Enter Last Name
      Then Enter Date Of Birth
      Then Enter Email
      And Company Name
      Then Enter Password
      And Enter Confirm Password
      Then User Click on Register Button


