import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
public class TestBase {
    @BeforeAll
    static void BeforeAll(){
        Configuration.browser = "chrome";
    }
}
