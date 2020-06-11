package appModule;

import PageObjects.ResultadosPage;
import org.openqa.selenium.WebDriver;



public class filterAction {
    public static void Execute(WebDriver driver) {
        ResultadosPage.filt_conFreezer(driver).click();
        ResultadosPage.filt_todasMarcas(driver).click();
        ResultadosPage.filt_porSamsung(driver).click();
        ResultadosPage.btn_apply(driver).click();

    }
}
