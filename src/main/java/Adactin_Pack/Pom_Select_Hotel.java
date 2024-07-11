package Adactin_Pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_Select_Hotel {

    public static WebDriver driver;




    @FindBy(id="radiobutton_0")
    private WebElement radiobutton;

    @FindBy(id="continue")
    private WebElement continuebutton;


    public WebElement getRadiobutton() {
        return radiobutton;
    }

    public WebElement getContinuebutton() {
        return continuebutton;
    }



    public Pom_Select_Hotel(WebDriver driver3){
        this.driver=driver3;
        PageFactory.initElements(driver,this);


    }


}
