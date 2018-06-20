package PageClass;

import Driver.DriverHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ComputerParts extends DriverHelper {
    public String isCopmuterparts()
    {
        return driver.getCurrentUrl();
    }
    public void selectDesktop()
    {
        List<WebElement> desktop=driver.findElements(By.cssSelector(".title>a"));
        for(WebElement element:desktop)
        {
            if(element.getText().equalsIgnoreCase("Desktops"))
            {
                element.click();
                break;
            }
        }
    }
}
