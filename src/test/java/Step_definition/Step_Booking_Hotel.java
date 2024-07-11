package Step_definition;

import Adactin_Pack.Base_Class;
import Adactin_Pack.Pom_Booking_Hotel;
import Runner_Pak.Runner_Class;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;

public class Step_Booking_Hotel extends Base_Class {
    WebDriver driver= Runner_Class.driver;
    Pom_Booking_Hotel pb= new Pom_Booking_Hotel(driver);

    @Given("user Scrolling down")

    public void user_scrolling_down() {
        //maximize(driver);
        clk(pb.getFirstname());
        //toscrolldown(driver, pb.getScrolldowning());
    }


    @Given("user entering the firstname")
    public void user_entering_the_firstname() {
        credentials(pb.getFirstname(), "MANOJ");


    }
    @Given("User Entering the lastName")
    public void user_entering_the_last_name() {
        credentials(pb.getLastname(),"KAARTHICK");

    }
    @Given("user Entering the billing Address")
    public void user_entering_the_billing_address() {

        credentials(pb.getBillingaddress(),"1524 Elims nagar road ,chennai");

    }
    @Given("user entering the credit card number")
    public void user_entering_the_credit_card_number() {
        credentials(pb.getCreditcardnumber(),"1234567890123456");

    }
    @Given("user Selecting the credit card type from dropdown")
    public void user_selecting_the_credit_card_type_from_dropdown() {

        todropdownbyvalue(pb.getCreditcardtype(), "VISA");

    }
    @Given("user selecting the Expiry month")
    public void user_selecting_the_expiry_month() {
        todropdownbyvalue(pb.getExpirymonth(),"March");

    }
    @Given("user selecting the Expiry year")
    public void user_selecting_the_expiry_year() {
        todropdownbyvalue(pb.getExpireyear(),"2014");


    }
    @Given("user Entering the CVV number")
    public void user_entering_the_cvv_number() {
        credentials(pb.getCvv(),"456");

    }
    @Given("user Clicking the Booknow button")
    public void user_clicking_the_booknow_button() {
        clk(pb.getBooknowbutton());

    }

}
