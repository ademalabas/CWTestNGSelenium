package clarusway.tests.Day_04_ParalelTest;

import org.testng.annotations.Test;

public class C02_ParallelTestAtribute {


@Test(threadPoolSize = 4,// testimizin kac cekirdekte parallel olarakcalisacagi belirler
        invocationCount = 7// testimizin kac defa calistirilacagini belirler

)
    public void test() {

    System.out.println("Current thread id  ="+Thread.currentThread().getId());



}


}
