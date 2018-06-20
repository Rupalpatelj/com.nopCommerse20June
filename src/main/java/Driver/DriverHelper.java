package Driver;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class DriverHelper {

    public static WebDriver driver;
    public void openBrowser(String browser) {
        if (browser == "chrome")
        {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        else if(browser=="firefox")
        {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
        else
        {
            WebDriverManager.iedriver().setup();
            driver=new InternetExplorerDriver();
        }

    }
    public void maximiseScreen()
    {
        driver.manage().window().maximize();
    }
    public void navigatingUrl(String url)
    {
        driver.get(url);
    }
    public void waitTofindElement()
    {
        driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
    }

    public void closeBrowser() {
        driver.close();
    }
}
