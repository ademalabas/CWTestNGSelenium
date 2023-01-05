package clarusway.tests.Day_06_Utils;

import clarusway.utilities.BaseCROSSBrowserTest;
import clarusway.utilities.JSUtils;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class C02_JUtils extends BaseCROSSBrowserTest {



    @Test
    public void test1() throws InterruptedException {

        JSUtils.driver = driver;

        driver.get("https://www.amazon.com/");


        JSUtils.scrollIntoViewJS( driver.findElement(By.partialLinkText("Amazon Ignite")));

        // Debug amacli
        Thread.sleep(4000);

        JSUtils.scrollAllUpByJS();

        Thread.sleep(4000);

        JSUtils.flash( driver.findElement(By.id("twotabsearchtextbox")));

        Thread.sleep(4000);

    }




    }





