package Step_definition;

import Adactin_Pack.Base_Class;
import Adactin_Pack.Pom_Select_Hotel;
import Runner_Pak.Runner_Class;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;

public class Step_def_Hotel_Select extends Base_Class {

    WebDriver driver= Runner_Class.driver;

    Pom_Select_Hotel ps=new Pom_Select_Hotel(driver);


    @Given("User Clicking the radio button")
    public void user_clicking_the_radio_button() {
        clk(ps.getRadiobutton());


    }
    @Given("user clicking the continue button")
    public void user_clicking_the_continue_button() {
        clk(ps.getContinuebutton());

    }



}
