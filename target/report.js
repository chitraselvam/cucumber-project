$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Login.feature");
formatter.feature({
  "name": "validating  functionality of Adactin hotel website.",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "validating login  functionality with valid user name and invalid password.",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on adactin website.",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDef.user_is_on_adactin_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should enter user name and password",
  "keyword": "When "
});
formatter.match({
  "location": "StepDef.user_should_enter_user_name_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should click login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDef.user_should_click_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should select the location,hotel,room type,no of rooms,check in date , checkout date,adults per room and children per room",
  "keyword": "When "
});
formatter.match({
  "location": "StepDef.user_should_select_the_location_hotel_room_type_no_of_rooms_check_in_date_checkout_date_adults_per_room_and_children_per_room()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should click search button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDef.user_should_click_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should select hotel",
  "keyword": "When "
});
formatter.match({
  "location": "StepDef.user_should_select_hotel()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should  click continue button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef.user_should_click_continue_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters firstname,lastname,billing address,cardtype,cardno,expiry date,cvv no",
  "keyword": "When "
});
formatter.match({
  "location": "StepDef.user_enters_firstname_lastname_billing_address_cardtype_cardno_expiry_date_cvv_no()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should click book now button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDef.user_should_click_book_now_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "order no should be generated",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef.order_no_should_be_generated()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});