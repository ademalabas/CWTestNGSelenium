package clarusway.tests.Day_03;

import org.testng.annotations.DataProvider;

public class C03_DataProviderClass{

    @DataProvider(name="testData")
    public Object[][] data() {

        Object[][] returnData ={

                {"First test", "birinci test"},
                {"Second Test", "ikinci test"},
                {"Third test", "ucuncu test"}
        };


        return returnData;

    }


}
