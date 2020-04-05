$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/A001login.feature");
formatter.feature({
  "name": "Login",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@sprint1"
    }
  ]
});
formatter.scenario({
  "name": "Valid Login",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sprint1"
    },
    {
      "name": "@smoke"
    },
    {
      "name": "@login"
    },
    {
      "name": "@regression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I see company logo on login page",
  "keyword": "Given "
});
formatter.match({
  "location": "A001LoginPageSteps.i_see_company_logo_on_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter valid username and password",
  "keyword": "When "
});
formatter.match({
  "location": "A001LoginPageSteps.i_enter_valid_username_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click login button",
  "keyword": "And "
});
formatter.match({
  "location": "A001LoginPageSteps.i_click_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I successfully logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "A001LoginPageSteps.i_successfully_logged_in()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Invalid Login",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sprint1"
    },
    {
      "name": "@login"
    },
    {
      "name": "@negative"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I enter invalid username and password",
  "keyword": "When "
});
formatter.match({
  "location": "A001LoginPageSteps.i_enter_invalid_username_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click login button",
  "keyword": "And "
});
formatter.match({
  "location": "A001LoginPageSteps.i_click_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I see error message is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "A001LoginPageSteps.i_see_error_message_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Error message validation",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sprint1"
    },
    {
      "name": "@negative"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I enter invalid username and password I see errorMessage",
  "rows": [
    {
      "cells": [
        "UserName",
        "Password",
        "ErrorMessage"
      ]
    },
    {
      "cells": [
        "Admin",
        "Admin123",
        "Invalid Credentials"
      ]
    },
    {
      "cells": [
        "Admin1",
        "Syntax123!",
        "errorMessage"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "A001LoginPageSteps.i_enter_invalid_username_and_password_I_see_errorMessage(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});