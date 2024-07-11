package Adactin_Pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_Search_Hotels {

    public static WebDriver driver;

    @FindBy(id="location")
    private WebElement location;

    @FindBy(id = "hotels")
    private WebElement hotels;

    @FindBy(id="room_type")
    private WebElement roomtype;


    @FindBy(id="room_nos")
    private WebElement roomnos;

    @FindBy(id="adult_room")
    private WebElement adultroom;


    @FindBy(id="child_room")
    private WebElement Child_room;

    @FindBy(id="Submit")
    private WebElement search;

    public WebElement getLocation() {
        return location;
    }

    public WebElement getHotels() {
        return hotels;
    }

    public WebElement getRoomtype()
    {
        return roomtype;
    }

    public WebElement getRoomnos() {

        return roomnos;
    }

    public WebElement getAdultroom() {

        return adultroom;
    }

    public WebElement getSearch() {
        return search;
    }

    public WebElement getChild_room() {

        return Child_room;
    }



    public Pom_Search_Hotels(WebDriver driver2){
        this.driver=driver2;

        PageFactory.initElements(driver,this);

    }
}
