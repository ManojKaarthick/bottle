package Adactin_Pack;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {
    public static WebDriver driver;
    public static JavascriptExecutor js;

    public static void url(WebDriver driver, String s){

        driver.get(s);
    }

    public static void find_elements(WebDriver driver,String a){
        driver.findElements(By.xpath(a));

    }

    public static void close(WebDriver driver){
        driver.close();

    }

    public static void title(WebDriver driver,String b){
        driver.getTitle();

    }

    public static  void Switch(WebDriver driver){
        driver.switchTo();

    }
    public static void credentials(WebElement c, String d){
        c.sendKeys(d);

    }
    public static  void clk( WebElement w) {
        w.click();


    }
    public static void maximize(WebDriver driver){

        driver.manage().window().maximize();
    }
    public static void toscrolldown( WebDriver driver,WebElement ref) {
        js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView()", ref);

    }

    public static void todropdownbyvalue(WebElement WE,String SE){


        Select s1 =new Select(WE);
        s1.selectByVisibleText(SE);
    }

    public static void todropdownbyvisibletext(WebElement WE,String S){
        Select s =new Select(WE);
        s.selectByVisibleText(S);
    }
}
