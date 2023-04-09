import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
public class TestForm extends TestBase {
    @Test
    void FirstTest() {
        open("https://demoqa.com/automation-practice-form");
        executeJavaScript("$('footer').remove()");
        executeJavaScript("$('#fixedban').remove()");
        $("#firstName").setValue("Veronika");
        $("#lastName").setValue("Iatckaia");
        $("#userEmail").setValue("neznatnov@gmail.com");
        $("#genterWrapper").$(byText("Female")).click();
        $("#userNumber").setValue("0123456789");
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOptionByValue(String.valueOf(3));
        $(".react-datepicker__year-select").selectOptionByValue(String.valueOf(1995));
        $(".react-datepicker__month").$(byText("17")).click();
        $("#subjectsInput").setValue("Computer Science").pressEnter();
        $("#hobbiesWrapper").$(byText("Reading")).click();
        $("#uploadPicture").uploadFromClasspath("cats.jpg");
        $("#currentAddress").setValue("Street 1");
        $("#state").click();
        $("#stateCity-wrapper").$(byText("Uttar Pradesh")).click();
        $("#city").click();
        $("#stateCity-wrapper").$(byText("Agra")).click();
        $("#submit").click();
        $(".modal-content").shouldHave(text("Veronika"),
                text("Iatckaia"),
                text("neznatnov@gmail.com"),
                text("Female"), text("0123456789"),
                text("17" + " " + "April" + "," + "1995"),
                text("Computer Science"),
                text("Reading"),
                text("cats.jpg"),
                text("Street 1"),
                text("Uttar Pradesh" + " " + "Agra"));
    }
}