import Driver.DriverHelper;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks{
    public DriverHelper driver=new DriverHelper();
    @Before
    public void setUp()
    {
        driver.openBrowser("chrome");
        driver.maximiseScreen();
        driver.navigatingUrl("http://demo.nopcommerce.com");
        driver.waitTofindElement();
    }
    @After
    public void tearDown()
    {
        driver.closeBrowser();
    }
}
