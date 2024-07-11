package Step_definition;

import Adactin_Pack.Adactin_Pom_class;
import Adactin_Pack.Base_Class;
import Runner_Pak.Runner_Class;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Step_Class extends Base_Class {
    WebDriver driver= Runner_Class.driver;


    Adactin_Pom_class ad=new Adactin_Pom_class(driver);


    @Given("launching the url")
    public void launching_the_url() {
        url(driver,"https://adactinhotelapp.com/HotelAppBuild2/");

    }
    @Given("User Entering the Username")
    public void user_entering_the_username() {

        credentials(ad.getUsername(), "sakthibala");

    }
    @Given("User Entering the pasword")
    public void user_entering_the_pasword() {
        credentials(ad.getPassword(),"sakthi@#123");

    }
    @Given("User Clicking the login button")
    public void user_clicking_the_login_button() {
        clk(ad.getLogin());

    }

}






