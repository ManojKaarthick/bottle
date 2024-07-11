package Adactin.feature;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class Dropdown {

    public static void main(String[] args) {
        WebDriver driver =new ChromeDriver();
        driver.get("https://adactinhotelapp.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

          WebElement login =driver.findElement(By.cssSelector("input[type=\"text\"]"));
          login.sendKeys("sakthibala");


          WebElement pwd=driver.findElement(By.xpath("//input[@id=\"password\"]"));
          pwd.sendKeys("9RDQ7F");


          WebElement btn =driver.findElement(By.cssSelector("input[type=\"Submit\"]"));
          btn.click();

          WebElement dd= driver.findElement(By.xpath("//select[@name=\"location\"]"));

        Select s = new Select(dd);
        s.selectByVisibleText("Brisbane");

        WebElement first=s.getFirstSelectedOption();
        System.out.println(first.getText());


        List<WebElement> options=s.getOptions();
        for(WebElement i :options){
            System.out.println(i.getText());
        }


    }


}
