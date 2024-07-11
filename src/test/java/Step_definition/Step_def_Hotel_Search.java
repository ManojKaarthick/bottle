package Step_definition;

import Adactin_Pack.Base_Class;
import Adactin_Pack.Pom_Search_Hotels;
import Runner_Pak.Runner_Class;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class Step_def_Hotel_Search extends Base_Class {

WebDriver driver = Runner_Class.driver;
Pom_Search_Hotels ph=new Pom_Search_Hotels(driver);

    @When("User selecting the location through dropdownlist")
    public void user_selecting_the_location_through_dropdownlist() {
        todropdownbyvalue(ph.getLocation(),"Sydney"); //melbourne

    }
    @When("user selecting the hotel")
    public void user_selecting_the_hotel() {
        todropdownbyvalue(ph.getHotels(),"Hotel Sunshine"); //Sunshine

    }
    @When("user selecting the Roomtype")
    public void user_selecting_the_roomtype() {
        todropdownbyvalue(ph.getRoomtype(),"Deluxe"); //Deluxe

    }
    @When("User Selecting the no of rooms")
    public void user_selecting_the_no_of_rooms() {
        todropdownbyvalue(ph.getRoomnos(),"3 - Three"); //two

    }
    @When("user selecting the adults per room")
    public void user_selecting_the_adults_per_room() {
        todropdownbyvalue(ph.getAdultroom(),"2 - Two");//Three

    }
    @When("user Selecting the Children per room")
    public void user_selecting_the_children_per_room() {
        todropdownbyvalue(ph.getChild_room(),"1 - One");//one

    }
    @When("user clicking the search button")
    public void user_clicking_the_search_button() {
        clk(ph.getSearch());

    }

}
