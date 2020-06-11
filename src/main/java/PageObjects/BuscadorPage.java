package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BuscadorPage {
    private static WebElement element = null;

    public static WebElement home_Buscador(WebDriver driver) {
        element = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/header/div/header/div[2]/div/div[1]/form/input"));
        return element;
    }

    public static WebElement btn_Search(WebDriver driver) {
        element = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/header/div/header/div[2]/div/div[1]/form/button"));
        return element;

    }

}


