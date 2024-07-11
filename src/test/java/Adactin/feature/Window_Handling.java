package Adactin.feature;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Window_Handling {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");


        String title=driver.getTitle();
        System.out.println(title);


        driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]")).
                     sendKeys("Iphone 15");

        driver.findElement(By.cssSelector("input[type=\"submit\"]")).click();

        driver.findElement(By.xpath("(//span[@class=\"a-size-medium a-color-base a-text-normal\"])[10]"))
                .click();

        String parentwindowId=driver.getWindowHandle();
        System.out.println(parentwindowId);

        Set<String> childWindowId= driver.getWindowHandles();
        System.out.println(childWindowId);

        for(String s:childWindowId){
            if(!s.equals(parentwindowId)){
                driver.switchTo().window(s);
            }
        }
      //driver.close();
        driver.switchTo().window(parentwindowId);


//        List<String> Windowidlist=new ArrayList(childWindowId);
//        String parentid=Windowidlist.get(0);
//        System.out.println("The parent Window id is:"+parentid);
//
//        String childid=Windowidlist.get(1);
//        System.out.println("The Child Window ID is:"+childid);
//










    }
}
