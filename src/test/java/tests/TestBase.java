package tests;

import com.codeborne.selenide.Configuration;
import components.CalendarComponent;
import org.junit.jupiter.api.BeforeAll;
import pages.RegistrationPage;

public class TestBase {
    RegistrationPage registrationPage = new RegistrationPage();
    @BeforeAll
    static void BeforeAll(){
        Configuration.browser = "chrome";
    }
}
