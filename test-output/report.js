$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("resources/features/Login.feature");
formatter.feature({
  "line": 1,
  "name": "Walmart login feature",
  "description": "",
  "id": "walmart-login-feature",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Negative login test with invalid email format and invalid password",
  "description": "",
  "id": "walmart-login-feature;negative-login-test-with-invalid-email-format-and-invalid-password",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "user navigates to walmart application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "page title is \"Walmart.com | Save Money. Live Better.\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user clicks on account",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user clicks on sign in",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user is landed to login page \"Login\"",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user enters username \"\u003cusername\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user enters password \"\u003cpassword\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user clicks on login btn",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user should see \"\u003cmessage1\u003e\" in username field",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "use should see \"\u003cmessage2\u003e\" in password field",
  "keyword": "And "
});
formatter.examples({
  "line": 15,
  "name": "",
  "description": "",
  "id": "walmart-login-feature;negative-login-test-with-invalid-email-format-and-invalid-password;",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "message1",
        "message2"
      ],
      "line": 16,
      "id": "walmart-login-feature;negative-login-test-with-invalid-email-format-and-invalid-password;;1"
    },
    {
      "cells": [
        "",
        "",
        "Email address is required.",
        "Password is required."
      ],
      "line": 17,
      "id": "walmart-login-feature;negative-login-test-with-invalid-email-format-and-invalid-password;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 3874368224,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Negative login test with invalid email format and invalid password",
  "description": "",
  "id": "walmart-login-feature;negative-login-test-with-invalid-email-format-and-invalid-password;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "user navigates to walmart application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "page title is \"Walmart.com | Save Money. Live Better.\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user clicks on account",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user clicks on sign in",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user is landed to login page \"Login\"",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user enters username \"\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user enters password \"\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user clicks on login btn",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user should see \"Email address is required.\" in username field",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "use should see \"Password is required.\" in password field",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.match({
  "location": "Login.user_navigates_to_walmart_application()"
});
formatter.result({
  "duration": 14686575212,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Walmart.com | Save Money. Live Better.",
      "offset": 15
    }
  ],
  "location": "Login.page_title_is(String)"
});
formatter.result({
  "duration": 19092052,
  "status": "passed"
});
formatter.match({
  "location": "Login.user_clicks_on_account()"
});
formatter.result({
  "duration": 90355172,
  "status": "passed"
});
formatter.match({
  "location": "Login.user_clicks_on_sign_in()"
});
formatter.result({
  "duration": 4613298535,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Login",
      "offset": 30
    }
  ],
  "location": "Login.user_is_landed_to_login_page(String)"
});
formatter.result({
  "duration": 11426958,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 22
    }
  ],
  "location": "Login.user_enters_username(String)"
});
formatter.result({
  "duration": 57007822,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 22
    }
  ],
  "location": "Login.user_enters_password(String)"
});
formatter.result({
  "duration": 44740895,
  "status": "passed"
});
formatter.match({
  "location": "Login.user_clicks_on_login_btn()"
});
formatter.result({
  "duration": 112448799,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Email address is required.",
      "offset": 17
    }
  ],
  "location": "Login.user_should_see_in_username_field(String)"
});
formatter.result({
  "duration": 94114980,
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.junit.Assert.assertTrue(Assert.java:52)\r\n\tat com.walmart.stepDef.Login.user_should_see_in_username_field(Login.java:70)\r\n\tat ✽.Then user should see \"Email address is required.\" in username field(resources/features/Login.feature:12)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "Password is required.",
      "offset": 16
    }
  ],
  "location": "Login.use_should_see_in_password_field(String)"
});
formatter.result({
  "status": "skipped"
});
});