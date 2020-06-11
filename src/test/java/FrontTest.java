package test;


import appModule.searchAction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utility.Constantes;
import appModule.filterAction;

import java.util.List;



public class FrontTest {
    private static WebDriver driver = null;

    @BeforeClass
    public void levantarChrome () {
        String exePath = "C:\\Users\\crow_\\OneDrive\\Documentos\\Automatización\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", exePath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
            }
    @Test (priority = 1)
    public void test_buscar() {
        driver.get(Constantes.URL);
        searchAction.Execute(driver, Constantes.buscado);
    }
    @Test (priority = 2)
    public void test_filtrarSamsung() {
        filterAction.Execute(driver);
    }
    @Test (priority = 3)
    public void test_contieneMarca() {
        List<WebElement> resultados = driver.findElements(By.xpath("//ul[@name='itemsGrid']/li//h4"));

            for (int i=0; i<resultados.size();i++) {

               Integer res = resultados.get(i).getText().indexOf("Samsung");
               System.out.println(res);

                  if (res == -1)
                  Assert.assertEquals(res, "0");
                  //System.out.println("Hay un resultado que no es Samsung");
            }


            }
     @Test (priority = 4)
     public void test_cantResultados (){
         List<WebElement> resultados = driver.findElements(By.xpath("//ul[@name='itemsGrid']/li//h4"));
         System.out.println(resultados.size());
         WebElement mostradosFront = driver.findElement(By.xpath("//ul[@name='aggregations']/li//span"));
         String resultMostradosText = mostradosFront.getText();
         Integer resultMostrados = Integer.parseInt(resultMostradosText);
         System.out.println(resultMostrados);
         Assert.assertTrue((resultados.size())== resultMostrados);


     }

     @Test (priority = 5)
     public void test_breadcrum () {
         String breadcrumb = driver.findElement(By.cssSelector("a.breadcrumbstyled__Anchor-vxt6er-1.kVUKqw[name='breadcrumbItem'][href='/l/?categorias=heladeras-freezers-y-cavas']")).getText();
         System.out.println(breadcrumb);
         Assert.assertEquals(breadcrumb, Constantes.breadcrumCorrecto);
        
     }

     @AfterClass
     public void cerrarChrome(){
        driver.quit();
     }




    }

