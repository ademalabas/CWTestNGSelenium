package clarusway.tests.Day_02;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class C03_ParametersExamples {

    String driver;

    @BeforeMethod
    @Parameters("browser")
    public void setup(String browserName) {
        //driver comfig yapiliyor
        if (browserName.equals("chrome")){
            driver = "chrome";
        }else if (browserName.equals("firefox")){
            driver = "firefox";
        }else if (browserName.equals("opera")){
            driver = "opera";
        }
        System.out.println("driver objesi olusturuldu = " + driver);


    }

    @AfterMethod
    public void tearDown() {
        //driver comfig yapiliyor
        System.out.println("driver sonlandirildi  = " + driver);
    }
    @Test
    public void test() {
        driver = "day";
    }





}
