package epicdays.timeeasy.crm_access;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private final By navigationLocator = By.id("grouptab_3");

    public HomePage(WebDriver driver) {
        System.out.println("HOMEPAGE TITLE " + driver.getTitle());
        driver.findElement(navigationLocator);
    }
}
