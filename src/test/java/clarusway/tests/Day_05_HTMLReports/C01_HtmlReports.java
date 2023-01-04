package clarusway.tests.Day_05_HTMLReports;

import clarusway.utilities.BaseTestReport;
import org.testng.Assert;
import org.testng.annotations.Test;

public class C01_HtmlReports extends BaseTestReport {


    @Test
    public void test01(){
        extentTest =extentReports.createTest("test01");

        System.out.println( "Test01 started at ");
        driver.get("https://www.google.com/");
        Assert.fail();
    }

    @Test
    public void test02(){
        extentTest =extentReports.createTest("test02");

        System.out.println( "Test02 started at ");
        driver.get("https://www.google.com/");

    }



}
