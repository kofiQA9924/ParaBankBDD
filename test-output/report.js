$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features/Login.feature");
formatter.feature({
  "line": 2,
  "name": "Customer Login Page",
  "description": "",
  "id": "customer-login-page",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Login"
    }
  ]
});
formatter.scenario({
  "line": 3,
  "name": "Login with Valid credentials",
  "description": "",
  "id": "customer-login-page;login-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "launches browser and opens ParaBank",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "enter Username",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "enters Password",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User clicks on login Button",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "User verify\u0027s accounts overview",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "User log\u0027s out",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageDefinition.launches_browser_and_opens_ParaBank()"
});
formatter.result({
  "duration": 6236150900,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageDefinition.enter_Username()"
});
formatter.result({
  "duration": 71937000,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageDefinition.enters_Password()"
});
formatter.result({
  "duration": 65795800,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageDefinition.user_clicks_on_login_Button()"
});
formatter.result({
  "duration": 3702304300,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageDefinition.user_verify_s_accounts_overview()"
});
formatter.result({
  "duration": 3053667900,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageDefinition.user_log_s_out()"
});
formatter.result({
  "duration": 660823000,
  "status": "passed"
});
});