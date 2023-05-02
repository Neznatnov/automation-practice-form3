package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import pages.RegistrationPage;

public class TestBase {
    @BeforeAll
    static void beforeAll(){
        Configuration.browser = "chrome";
    }
}
