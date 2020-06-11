package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ResultadosPage {
    private static WebElement element = null;

    public static WebElement filt_conFreezer (WebDriver driver) {
        element = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[3]/div/div/div[1]/ul/li[2]/ul/li[1]/ul/li[2]/a/h4"));
        return element;
    }
    public static WebElement filt_todasMarcas (WebDriver driver) {
        element =driver.findElement(By.name("viewAllBrands"));
        return element;
    }
    public static WebElement filt_porSamsung (WebDriver driver){
        element = driver.findElement(By.xpath("//label[@for=\"filterItemsamsung\"]"));
        return element;
    }

    public static WebElement btn_apply (WebDriver driver){
        element = driver.findElement(By.id("apply"));
        return element;
    }
}
