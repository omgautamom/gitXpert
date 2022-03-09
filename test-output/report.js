$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./resources/facebook.feature");
formatter.feature({
  "line": 1,
  "name": "Create account of Facebook",
  "description": "As a user u need to open facebook home page and do the validation",
  "id": "create-account-of-facebook",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Validate first name field",
  "description": "",
  "id": "create-account-of-facebook;validate-first-name-field",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User need to be on facebook login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User enters user first name",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User checks user first name present",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});