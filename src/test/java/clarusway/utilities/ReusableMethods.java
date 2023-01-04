package clarusway.utilities;

import com.aventstack.extentreports.utils.FileUtil;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ReusableMethods {
    public static String getScreenShot (WebDriver driver, String name) throws IOException {
        //screenshot dosya ismi icin suanli tarihi string olarak aliyoruz
        String date =formatCurrentDate("yyyyMMddhhmmss");
       File source =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

       String target =System.getProperty("user.dir")+"\\test-output\\Screenshot\\"+name+date+".png";
       File targetFile =new File(target);
        FileUtils.copyFile(source, targetFile);
        return target;

    }

    public static String formatCurrentDate(String pattern){

        return new SimpleDateFormat(pattern).format(new Date());
    }



}
