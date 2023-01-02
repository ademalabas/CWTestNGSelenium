package clarusway.tests.Day_03;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class C01_DataProvider {

    @Test(dataProvider = "dataProvider")
    public void test01(String name) {
        System.out.println(name);


    }
@DataProvider
    public Object[][] dataProvider() {

        Object[][] data = {
                {"Adem"},
                {"Alabas"},
                {"Clarusway"}
        };
        return data;


}



}
