package clarusway.tests.Day_05_HTMLReports;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(C02_ITestListener.class)
public class C03_UseListener {
    @Test
    public void passedTest01() {
        System.out.println("Passed Test Calisti");

    }
    @Test
    public void failedTest02() {
        System.out.println("failed Test Calisti");
        Assert.fail();

    }
    @Test(timeOut = 500)
    public void timeOutTest03() throws InterruptedException {
        System.out.println("timeout Test Calisti");
        Thread.sleep(600);

    }


    

}
