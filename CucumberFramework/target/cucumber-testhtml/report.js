$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("ShareDataHooks.feature");
formatter.feature({
  "line": 1,
  "name": "Create FB Account using multiple accounts",
  "description": "",
  "id": "create-fb-account-using-multiple-accounts",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3267213291,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Validate Entry of email field",
  "description": "",
  "id": "create-fb-account-using-multiple-accounts;validate-entry-of-email-field",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User need to be on Facebook login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User enters user \"Hero\" first name",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User checks user \"Hero\" first name is present",
  "keyword": "Then "
});
formatter.match({
  "location": "SharedDataFormultipleScenarios_01.user_need_to_be_on_Facebook_login_page()"
});
formatter.result({
  "duration": 1952218545,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Hero",
      "offset": 18
    }
  ],
  "location": "SharedDataFormultipleScenarios_01.user_enters_user_first_name(String)"
});
formatter.result({
  "duration": 1042235440,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Hero",
      "offset": 18
    }
  ],
  "location": "SharedDataFormultipleScenarios_02.user_checks_users_first_name_is_present(String)"
});
formatter.result({
  "duration": 33576530,
  "status": "passed"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 7,
      "value": "#Then close browser"
    }
  ],
  "line": 9,
  "name": "Validate entry of email and Password",
  "description": "",
  "id": "create-fb-account-using-multiple-accounts;validate-entry-of-email-and-password",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 10,
  "name": "User need to be on Facebook login page",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "User enters user \"\u003cuser\u003e\" first name",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "User enters password \"\u003cpassword\u003e\" in email",
  "keyword": "And "
});
formatter.examples({
  "comments": [
    {
      "line": 13,
      "value": "#Then close browser"
    }
  ],
  "line": 14,
  "name": "",
  "description": "",
  "id": "create-fb-account-using-multiple-accounts;validate-entry-of-email-and-password;",
  "rows": [
    {
      "cells": [
        "user",
        "password"
      ],
      "line": 15,
      "id": "create-fb-account-using-multiple-accounts;validate-entry-of-email-and-password;;1"
    },
    {
      "cells": [
        "Tom",
        "Jerry"
      ],
      "line": 16,
      "id": "create-fb-account-using-multiple-accounts;validate-entry-of-email-and-password;;2"
    },
    {
      "cells": [
        "Harry",
        "Rock"
      ],
      "line": 17,
      "id": "create-fb-account-using-multiple-accounts;validate-entry-of-email-and-password;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 2707875431,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Validate entry of email and Password",
  "description": "",
  "id": "create-fb-account-using-multiple-accounts;validate-entry-of-email-and-password;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 10,
  "name": "User need to be on Facebook login page",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "User enters user \"Tom\" first name",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "User enters password \"Jerry\" in email",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.match({
  "location": "SharedDataFormultipleScenarios_01.user_need_to_be_on_Facebook_login_page()"
});
formatter.result({
  "duration": 2025704359,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Tom",
      "offset": 18
    }
  ],
  "location": "SharedDataFormultipleScenarios_01.user_enters_user_first_name(String)"
});
formatter.result({
  "duration": 1032141888,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Jerry",
      "offset": 22
    }
  ],
  "location": "SharedDataFormultipleScenarios_01.user_enters_password(String)"
});
formatter.result({
  "duration": 1039517493,
  "status": "passed"
});
formatter.before({
  "duration": 3025436396,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Validate entry of email and Password",
  "description": "",
  "id": "create-fb-account-using-multiple-accounts;validate-entry-of-email-and-password;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 10,
  "name": "User need to be on Facebook login page",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "User enters user \"Harry\" first name",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "User enters password \"Rock\" in email",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.match({
  "location": "SharedDataFormultipleScenarios_01.user_need_to_be_on_Facebook_login_page()"
});
formatter.result({
  "duration": 1757547267,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Harry",
      "offset": 18
    }
  ],
  "location": "SharedDataFormultipleScenarios_01.user_enters_user_first_name(String)"
});
formatter.result({
  "duration": 1038564962,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Rock",
      "offset": 22
    }
  ],
  "location": "SharedDataFormultipleScenarios_01.user_enters_password(String)"
});
formatter.result({
  "duration": 1038483311,
  "status": "passed"
});
});