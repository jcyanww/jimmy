$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/jcruk/eclipse-workspace/com.my.automation/src/test/resources/feature/test.feature");
formatter.feature({
  "line": 1,
  "name": "NewTourSteps",
  "description": "",
  "id": "newtoursteps",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "New Tours test",
  "description": "",
  "id": "newtoursteps;new-tours-test",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user open the page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user insert username",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user insert password",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user click login button",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user select the passenger count",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user select departure",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user select the destination",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user select the airline",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user click find flight button",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "user click reserve flight button",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "user insert first passenger first name",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "user insert first passenger last name",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "user insert second passenger first name",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "user insert second passenger last name",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "user select the credit card type",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "user insert the credit card number",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "user select the credeit card expiration month",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "user select the credeit card expiration year",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "user click buy flight button",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "user close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "NewTourSteps.user_open_the_page()"
});
formatter.result({
  "duration": 5129713389,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_insert_username()"
});
formatter.result({
  "duration": 50959171,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_insert_password()"
});
formatter.result({
  "duration": 55116881,
  "status": "passed"
});
formatter.match({
  "location": "NewTourSteps.user_click_login_button()"
});
formatter.result({
  "duration": 965274616,
  "status": "passed"
});
formatter.match({
  "location": "NewTourSteps.user_select_the_passenger_count()"
});
formatter.result({
  "duration": 10047508813,
  "error_message": "java.lang.NullPointerException\r\n\tat org.openqa.selenium.support.ui.Select.\u003cinit\u003e(Select.java:44)\r\n\tat pageobjects.FlightFindPage.selcteItem(FlightFindPage.java:57)\r\n\tat stepDefinition.NewTourSteps.user_select_the_passenger_count(NewTourSteps.java:39)\r\n\tat ✽.Then user select the passenger count(C:/Users/jcruk/eclipse-workspace/com.my.automation/src/test/resources/feature/test.feature:8)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "NewTourSteps.user_select_departure()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NewTourSteps.user_select_the_destination()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NewTourSteps.user_select_the_airline()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NewTourSteps.user_click_find_flight_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NewTourSteps.user_click_reserve_flight_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NewTourSteps.user_insert_first_passenger_first_name()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NewTourSteps.user_insert_first_passenger_last_name()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NewTourSteps.user_insert_second_passenger_first_name()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NewTourSteps.user_insert_second_passenger_last_name()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NewTourSteps.user_select_the_credit_card_type()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NewTourSteps.user_insert_the_credit_card_number()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NewTourSteps.user_select_the_credeit_card_expiration_month()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NewTourSteps.user_select_the_credeit_card_expiration_year()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NewTourSteps.user_click_buy_flight_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NewTourSteps.user_close_the_browser()"
});
formatter.result({
  "status": "skipped"
});
});