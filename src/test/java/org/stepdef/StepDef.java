package org.stepdef;

import org.base.BaseClass;
import org.locators.AdactLoginLocator;
import org.locators.AdactinSearchLocator;
import org.locators.BookNowLocator;
import org.locators.SelectHotelLocator;
import org.openqa.selenium.WebElement;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef extends BaseClass {
	
	BaseClass base;
	AdactLoginLocator login;
	AdactinSearchLocator search;
	SelectHotelLocator select;
	BookNowLocator book;
@Given("user is on adactin website.")
public void user_is_on_adactin_website() {
	 base=new BaseClass();
	 base.getDriver("chrome");
	 base.launchUrl("https://adactinhotelapp.com/");
}

@When("user should enter user name and password")
public void user_should_enter_user_name_and_password() {
	 login=new AdactLoginLocator();
	 WebElement username=login.getTxtUserName();
	 base.typeText(username, "selvammalai");
	 WebElement txtPassword = login.getTxtPassword();
	 base.typeText(txtPassword, "3KB443");
    
}

@When("user should click login button")
public void user_should_click_login_button() {
	
    WebElement btnLogin=login.getBtnLogin();
    base.btnClick(btnLogin);
}

/*@Then("user should validate select page is present or not")
public void user_should_validate_select_page_is_present_or_not() {
   
}*/

@When("user should select the location,hotel,room type,no of rooms,check in date , checkout date,adults per room and children per room")
public void user_should_select_the_location_hotel_room_type_no_of_rooms_check_in_date_checkout_date_adults_per_room_and_children_per_room() throws InterruptedException {
	 search = new AdactinSearchLocator();
	 Thread.sleep(5000);
	 WebElement drpdwnLocation = search.getDrpdwnLocation();
		base.selectByDropDown("value", drpdwnLocation, "London");
		WebElement drpdwnHotels = search.getDrpdwnHotels();
		base.selectByDropDown("value", drpdwnHotels, "Hotel Sunshine");
		WebElement drpdwnRoomType = search.getDrpdwnRoomType();
		base.selectByDropDown("value", drpdwnRoomType, "Super Deluxe");
		WebElement drpdwnRoomNos = search.getDrpdwnRoomNos();
		base.selectByDropDown("value", drpdwnRoomNos, "1");
		WebElement txtCheckIn = search.getTxtCheckIn();
		txtCheckIn.clear();
		base.typeText(txtCheckIn, "01/09/2021");
		WebElement txtCheckOut = search.getTxtCheckOut();
		txtCheckOut.clear();
		base.typeText(txtCheckOut, "4/09/2021");
		WebElement drpdwnAdultPerRoom = search.getDrpdwnAdultPerRoom();
		base.selectByDropDown("value", drpdwnAdultPerRoom, "1");
		WebElement drpdwnChildrenPerRoom = search.getDrpdwnChildrenPerRoom();
		base.selectByDropDown("value", drpdwnChildrenPerRoom, "0");
    
}

@When("user should click search button")
public void user_should_click_search_button() {
	WebElement btnSearch = search.getBtnSearch();
	base.btnClick(btnSearch);
	    
}
@When("user should select hotel")
public void user_should_select_hotel() {
	 select=new SelectHotelLocator();
	WebElement btnRadio = select.getBtnRadio();
	base.btnClick(btnRadio);
    
}

@Then("user should  click continue button")
public void user_should_click_continue_button() {
	WebElement btnContinue = select.getBtnContinue();
	base.btnClick(btnContinue);
   
}
@When("user enters firstname,lastname,billing address,cardtype,cardno,expiry date,cvv no")
public void user_enters_firstname_lastname_billing_address_cardtype_cardno_expiry_date_cvv_no() {
	 book=new BookNowLocator();
	WebElement txtFirstName = book.getTxtFirstName();
	base.typeText(txtFirstName, "selvam");
	WebElement txtLastName = book.getTxtLastName();
	base.typeText(txtLastName, "annamalai");
	WebElement txtaddress =book.getTxtBillingaddress();
	base.typeText(txtaddress, "12,jagadambal street,t.nagar");
	WebElement txtCardNumber = book.getTxtCardNumber();
	base.typeText(txtCardNumber, "9876543218567432");
	WebElement drpCardType = book.getTxtCardType();
	base.selectByDropDown("value", drpCardType, "AMEX");
	WebElement drpdwnExpiryMonth = book.getDrpdwnExpiryMonth();
	base.selectByDropDown("value", drpdwnExpiryMonth, "9");
	WebElement drpdwnExpiryYear = book.getDrpdwnExpiryYear();
	base.selectByDropDown("value", drpdwnExpiryYear, "2022");
	WebElement txtCCV = book.getTxtCCV();
	base.typeText(txtCCV, "677");
	
    
}

@When("user should click book now button")
public void user_should_click_book_now_button() {
	WebElement btnBookNow = book.getBtnBookNow();
	base.btnClick(btnBookNow);
	    
}

@Then("order no should be generated")
public void order_no_should_be_generated() throws InterruptedException {
	Thread.sleep(5000);
	WebElement txtOrderNo = book.getTxtOrderNo();
	String attribute = txtOrderNo.getAttribute("value");
	System.out.println(attribute);
	
    
}


}
