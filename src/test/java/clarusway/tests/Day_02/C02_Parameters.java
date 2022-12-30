package clarusway.tests.Day_02;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class C02_Parameters {

    @Test
    @Parameters("name")
    public void test01(String name) {

        System.out.println("Hello  "+name);


    }


}
