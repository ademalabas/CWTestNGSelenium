package clarusway.tests.Day_01;

import org.testng.annotations.Test;

public class C04_Enabled {

    @Test(enabled = true)
    public void enabledTest(){
        System.out.println("Enabled test");
    }

    @Test(enabled = false)
    public void disabledTest(){
        System.out.println("Disabled test");
    }


}
