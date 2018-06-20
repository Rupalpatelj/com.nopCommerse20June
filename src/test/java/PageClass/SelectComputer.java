package PageClass;

import Driver.DriverHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SelectComputer extends DriverHelper{
    public String isOnDesktop()
    {
        return driver.getCurrentUrl();
    }
    public void selectDigitalComp()
    {
        List<WebElement> desktop=driver.findElements(By.cssSelector(".product-title>a"));
        for (WebElement element: desktop)
        {
            if(element.getText().equalsIgnoreCase("Digital Storm VANQUISH 3 Custom Performance PC"))
            {
                element.click();
                break;
            }
        }
    }
}
