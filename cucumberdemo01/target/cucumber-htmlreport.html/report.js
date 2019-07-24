$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:MYDEMODDC2FEATURES/myfirstregression.feature");
formatter.feature({
  "name": "My validations on American express",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "I want to view my membership",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Regression"
    },
    {
      "name": "@Smoke"
    },
    {
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "name": "I have logged in",
  "keyword": "Given "
});
formatter.match({
  "location": "Myamex.i_have_logged_in()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on reward points",
  "keyword": "Then "
});
formatter.match({
  "location": "Myamex.i_click_on_reward_points()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I will check for my rewards",
  "keyword": "And "
});
formatter.match({
  "location": "Myamex.i_will_check_for_my_rewards()"
});
formatter.result({
  "status": "passed"
});
});