package clarusway.tests.Day_04_ParalelTest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class C03_ParallelTestDataProvider {

    @Test(dataProvider = "getData")
    public void test(String name, String surname) {
        System.out.println(name + " " + surname+ " "+Thread.currentThread().getId());


    }

    @DataProvider(parallel = true)
    public Object[][] getData() {
        return new Object[][]{
                {"Adem", "Alabas"},
                {"Handan", "Sarah"},
                {"Nalan", "Sarah"}


        };
    }
}