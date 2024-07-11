package Adactin_Pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactin_Pom_class {

    public static WebDriver driver;




    @FindBy(xpath = "//h4[text()='Book on Automation']")
    private WebElement Scrolling;

    @FindBy(id="username")
    private WebElement username;
    @FindBy(id="password")
    private WebElement password;

    @FindBy(id="login")
    private WebElement login;


    public WebElement getUsername() {

        return username;
    }

    public WebElement getPassword() {

        return password;
    }

    public WebElement getLogin() {

        return login;
    }

    public Adactin_Pom_class(WebDriver driver1){
        this.driver=driver1;
        PageFactory.initElements(driver,this);
    }




}




