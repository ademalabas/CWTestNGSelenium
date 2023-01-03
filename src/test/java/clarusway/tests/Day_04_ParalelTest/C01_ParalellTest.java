package clarusway.tests.Day_04_ParalelTest;

import clarusway.utilities.BaseCROSSBrowserTest;
import org.testng.annotations.Test;

public class C01_ParalellTest extends BaseCROSSBrowserTest {


    @Test
    public void test01(){
        driver.get("https://www.google.com/");


    }

    @Test
    public void test02(){
        driver.get("https://www.amazon.com/");


    }

    @Test
    public void test03(){
        driver.get("https://www.trendyol.com/");


    }


}
