package clarusway.tests.Day_01;

import org.testng.annotations.Test;

public class C08_MultipleAttributes {
    // Bir test methodu birden fazla attribute kullanilarak konfigure edilebilir

    @Test(
            description = "This is a test case",
            priority = 10,
            groups = {"regression"},
            enabled = false
    )
    public void test(){
    }


}
