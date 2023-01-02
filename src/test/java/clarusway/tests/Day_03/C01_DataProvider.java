package clarusway.tests.Day_03;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class C01_DataProvider {

    @Test(dataProvider = "dataProvider")
    public void test01(String name) {

        //verileri dataProvider methodundan alarak calisacak olan test


        System.out.println(name);


    }
@DataProvider
    public Object[][] dataProvider() {
    // verileri teste saglayacak olan method

        Object[][] data = {
                {"Adem"},
                {"Alabas"},
                {"Clarusway"}
        };
        return data;


}



}
