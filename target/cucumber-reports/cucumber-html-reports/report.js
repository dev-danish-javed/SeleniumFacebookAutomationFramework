$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Message.feature");
formatter.feature({
  "name": "Facebook messaging",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Check facebook messaging feature",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Facebook"
    },
    {
      "name": "@fbMessaging"
    }
  ]
});
formatter.step({
  "name": "User navigates to \"facebook\"",
  "keyword": "Given "
});
formatter.match({
  "location": "facebook.stepDefinations.FacebookMessenger.user_navigates_to(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User login in the site using id \"facebookEmailId\" and password \"facebookPassword\"",
  "keyword": "Then "
});
formatter.match({
  "location": "facebook.stepDefinations.FacebookMessenger.login(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on Messenger button",
  "keyword": "And "
});
formatter.match({
  "location": "facebook.stepDefinations.FacebookMessenger.user_clicks_on_Messenger_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User search for \"person\" in messenger",
  "keyword": "And "
});
formatter.match({
  "location": "facebook.stepDefinations.FacebookMessenger.user_search_for(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on persons \"person\" chat",
  "keyword": "And "
});
formatter.match({
  "location": "facebook.stepDefinations.FacebookMessenger.user_clicks_on_personsChat(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User types message \"message\"",
  "keyword": "And "
});
formatter.match({
  "location": "facebook.stepDefinations.FacebookMessenger.typeMessage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks send button",
  "keyword": "And "
});
formatter.match({
  "location": "facebook.stepDefinations.FacebookMessenger.user_clicks_send_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User logs out",
  "keyword": "And "
});
formatter.match({
  "location": "facebook.stepDefinations.FacebookMessenger.user_logs_out()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User closes the browser",
  "keyword": "And "
});
formatter.match({
  "location": "facebook.stepDefinations.FacebookMessenger.user_closes_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});