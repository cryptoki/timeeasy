package epicdays.timeeasy.crm_access;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class LoginPage {

    private static final String PAGE = "https://aufwandserfassung.tools.epost-dev.de/zeiterfassung/index.php?action=Login";

    private final WebDriver driver;

    private final By usernameLocator = By.id("user_name");
    private final By passwordLocator = By.id("user_password");
    private final By loginButtonLocator = By.id("bigbutton");
    private final String pageTitle = "Login";

    public LoginPage(WebDriver driver) {
        this.driver = driver;

        if (!pageTitle.equals(driver.getTitle())) {
            throw new IllegalStateException("This is not the login page");
        }
    }

    public HomePage loginAs(String user, String password) {
        typeUsername(user);
        typePassword(password);
        return submitLogin();
    }

    private LoginPage typeUsername(String user) {
        driver.findElement(usernameLocator).sendKeys(user);
        return this;
    }

    private LoginPage typePassword(String password) {
        driver.findElement(passwordLocator).sendKeys(password);
        return this;
    }

    private HomePage submitLogin() {
        driver.findElement(loginButtonLocator).submit();
        return new HomePage(driver);
    }
}
