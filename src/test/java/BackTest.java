import io.restassured.RestAssured.*;
import org.testng.*;
import org.testng.annotations.Test;
import utility.Constantes;

import static io.restassured.RestAssured.expect;
import static io.restassured.RestAssured.requestSpecification;
import static org.hamcrest.Matchers.equalTo;


public class BackTest {

    @Test
    public void test_getLagunitas () {
        expect().
               statusCode(200).
                body(
                        "name", equalTo("lagunitas")).
                when().
                get(Constantes.URLapi);

    }
    @Test
    public void test_lagbrewingco (){
        expect().statusCode(200).body("name", equalTo("Lagunitas Brewing Co")).when().get(Constantes.URLapi);
    }
    @Test
    public void test_stateCalifornia (){
        expect().statusCode(200).body("state", equalTo("California")).when().get(Constantes.URLapi);
    }
    @Test
    public void test_busquedaconDatos (){
        expect().statusCode(200).body("id", equalTo("761"),
                "name", equalTo("Lagunitas Brewing Co"),
                "street", equalTo("1280 N McDowell Blvd"),
                "phone", equalTo("7077694495")).when().get(Constantes.URLapi);
    }
}
