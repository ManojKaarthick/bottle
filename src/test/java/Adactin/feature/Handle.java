package Adactin.feature;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Handle {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://letcode.in/alert");

//        driver.findElement(By.xpath("//button[text()='Simple Alert']")).click();
//
//        Alert a =driver.switchTo().alert();
//          String first=a.getText();
//        System.out.println("The alert is"+first);
//
//        a.accept();

//        driver.findElement(By.xpath("//button[@id=\"confirm\"]")).click();
//
//        Alert c = driver.switchTo().alert();
//
//
//        String second =c.getText();
//        System.out.println("The alert is"+second);
//        c.dismiss();
//
         driver.findElement(By.xpath("//button[@id=\"prompt\"]")).click();
         Alert d=driver.switchTo().alert();
         d.sendKeys("please show me the alert");
         d.accept();
         String name=driver.findElement(By.id("myName")).getText();
         System.out.println(name);





    }


}
