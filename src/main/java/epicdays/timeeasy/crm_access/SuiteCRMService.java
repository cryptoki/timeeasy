package epicdays.timeeasy.crm_access;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class SuiteCRMService {

    private final WebDriver driver = new HtmlUnitDriver();

    public void bookTimeRecord(TimeRecord timeRecord) {
        loginToSuiteCRM(timeRecord);
        book(timeRecord);
    }

    private void loginToSuiteCRM(TimeRecord timeRecord) {
        // @Todo: Use Selenium + HTTPUnitDriver with PageObjects to login in SuiteCRM
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginAs(timeRecord.getUser(), timeRecord.getPassword());
    }

    private void book(TimeRecord timeRecord) {
        // @Todo: Save record in SuiteCRM using page object.
        throw new RuntimeException("Not implemented yet.");
    }
}
