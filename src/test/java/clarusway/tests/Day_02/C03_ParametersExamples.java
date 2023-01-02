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
        // Driver konfigurasyonlari yapiliyor
        if (browserName.equals("chrome")){
            driver = "chrome";
            // chrome konf yapildi
        } else if (browserName.equals("firefox")) {
            driver = "firefox";
            //firefox konf yapildi
        } else if (browserName.equals("opera")) {
            driver = "opera";
            // opera conf yapildi
        }
        System.out.println("driver objesi olusturuldu = " + driver);


    }

    @AfterMethod
    public void tearDown() {
        driver ="-";
        System.out.println("driver sonlandirildi  = " + driver);
        //driver KAPATILIYOR
    }
    @Test
    public void test() {

        System.out.println("Test execution basladi");
        System.out.println("Testte kullanilan driver = " + driver);
        // testimiz gerceklesiyor
    }





}
