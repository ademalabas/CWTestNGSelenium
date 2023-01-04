package clarusway.tests.Day_05_HTMLReports;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class C02_ITestListener implements ITestListener {

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("OntestStart metodu calisti");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("onTestSuccess metodu calisti");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("onTestFailure metodu calisti");
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("onTestSkipped metodu calisti");
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        System.out.println("onTestFailedButWithinSuccessPercentage metodu calisti");
    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
        System.out.println("onTestFailedWithTimeout metodu calisti");
    }

    @Override
    public void onStart(ITestContext context) {
        System.out.println(" onStart metodu calisti");
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println(" onFinish metodu calisti");
    }
}
