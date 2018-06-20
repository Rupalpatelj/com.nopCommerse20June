package PageClass;

import Driver.DriverHelper;
import org.openqa.selenium.By;

public class AddtoCart extends DriverHelper {
    public String isOnAddPage()
    {
        return driver.getCurrentUrl();
    }
    public void addItem()
    {
        driver.findElement(By.cssSelector("#add-to-cart-button-2")).click();
    }
    public void selectShoippingCart()
    {
        driver.findElement(By.cssSelector(".ico-cart")).click();
    }
    public void selectTermsandCondi()
    {
        driver.findElement(By.cssSelector("#termsofservice")).click();
    }
    public void selectCheckout()
    {

        driver.findElement(By.cssSelector("#checkout")).click();
    }
public String isOnCheckout()
{
    return driver.getCurrentUrl()+("login/checkoutasguest?returnUrl=%2Fcart");
}
}
