Feature: Navigate to Tek retail app click on create account button and create account holder
    Scenario: Navigate to Home page then click on Create Primary Account Button. User should navigate to Create Account form
    page validate Form Title as Expected “Create Primary Account Holder”

      Given Navigate to home TEK insurance app
      When Click on create account button validate Create Primary Account Holder text
      Then fill the account info
      #Then click on create account
