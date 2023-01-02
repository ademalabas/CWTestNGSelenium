package clarusway.tests.Day_03;

import org.testng.annotations.Test;

public class C04_DataProviderClassTest {

    @Test(dataProvider = "testData",
            dataProviderClass = C03_DataProviderClass.class)
    public void dataProviderTest(String english, String turkish) {


        System.out.println(english);
        System.out.println(turkish);


    }




}
