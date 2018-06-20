package PageClass;

import Driver.DriverHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomeBase extends DriverHelper{

    public String isHomePage()
    {
        return driver.getCurrentUrl();
    }
    public void clickComputer()
    {
        List<WebElement> computer=driver.findElements(By.cssSelector(".top-menu>li>a"));
        for (WebElement element:computer)
        {
            System.out.println("Element "+element.getText());
            if(element.getText().equalsIgnoreCase("Computers"))
            {
                element.click();
                break;
            }
        }
    }
}
