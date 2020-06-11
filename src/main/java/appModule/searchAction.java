package appModule;
import PageObjects.BuscadorPage;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class searchAction {
    public static void Execute (WebDriver driver,String buscado){
        BuscadorPage.home_Buscador(driver).sendKeys(buscado);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        BuscadorPage.btn_Search(driver).click();
    }
}
