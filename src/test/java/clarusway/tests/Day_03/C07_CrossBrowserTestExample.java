package clarusway.tests.Day_03;

import clarusway.utilities.BaseCROSSBrowserTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class C07_CrossBrowserTestExample extends BaseCROSSBrowserTest {

// Go to https://www.amazon.com/
// Search for 'headset' 'mouse' 'keyboard' in order with dataProvider
// Assert that first item contains searched keyword in the item description
// Go to product page
// Add first item to cart
// Click Go to cart on cart section
// Assert shopping cart heading
// Assert that added item is in shopping cart
// Check this is a gift
// Assert that checkbox is checked
// Click on proceed to checkout
// Assert that login page is opened

// Do it for chrome and firefox with crossbrowser testing



@Test
    public void amazonTest() {






    }


@DataProvider
    public Object[][] data() {
    return new Object[][]{
            {"headset"},
            {"mouse"},
            {"keyboard"}
    };
}



}
