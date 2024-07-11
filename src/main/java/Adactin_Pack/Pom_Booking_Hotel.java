package Adactin_Pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_Booking_Hotel {

    public static WebDriver driver;


    @FindBy(name = "price_night_dis")
   private WebElement scrolldowning;



    @FindBy(xpath = "//input[@id='first_name']")
    private WebElement firstname;

    @FindBy(id ="last_name")
    private WebElement lastname;

    @FindBy(id ="address")
    private WebElement billingaddress;


    @FindBy(id ="cc_num")
    private WebElement Creditcardnumber;


    @FindBy(id="cc_type")
    private WebElement Creditcardtype;


    @FindBy(id="cc_exp_month")
    private WebElement Expirymonth;

    @FindBy(id="cc_exp_year")
    private WebElement Expireyear;

    @FindBy(id="cc_cvv")
    private WebElement cvv;

    public WebElement getScrolldowning() {

        return scrolldowning;
    }



    public WebElement getFirstname() {

        return firstname;
    }

    @FindBy(id ="book_now")
    private WebElement booknowbutton;



    public WebElement getLastname() {
        return lastname;
    }



    public WebElement getBillingaddress() {
        return billingaddress;
    }

    public WebElement getCreditcardnumber() {
        return Creditcardnumber;
    }

    public WebElement getCreditcardtype() {
        return Creditcardtype;
    }

    public WebElement getExpirymonth() {
        return Expirymonth;
    }

    public WebElement getExpireyear() {
        return Expireyear;
    }

    public WebElement getCvv() {
        return cvv;
    }

    public WebElement getBooknowbutton() {
        return booknowbutton;
    }

    public Pom_Booking_Hotel(WebDriver driver4){
        driver=driver4;
        PageFactory.initElements(driver,this);
    }








}
