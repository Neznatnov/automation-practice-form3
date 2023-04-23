package tests;

import org.junit.jupiter.api.Test;
import pages.RegistrationPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
public class TestForm extends TestBase {
    @Test
    void FirstTest() {
        registrationPage.openPage()
                .setFirstName("Veronika")
                .setLastName("Iatckaia")
                .setUserEmail("neznatnov@gmail.com")
                .setGender("Female")
                .setUserNumber("0123456789")
                .setBirthDate("17","April","1995")
                .setSubject("Computer Science")
                .setHobbies("Reading")
                .setPicture()
                .setAddress("Street 1")
                .setState("Uttar Pradesh")
                .setCity("Agra")
                .clickSubmit();

        
        registrationPage.verifyRegistrationResultModalAppears()
                        .verifyResult("Student Name", "Veronika Iatckaia")
                        .verifyResult("Student Email", "neznatnov@gmail.com")
                        .verifyResult("Gender", "Female")
                        .verifyResult("Mobile", "0123456789")
                        .verifyResult("Date of Birth", "17 April,1995")
                        .verifyResult("Subjects", "Computer Science")
                        .verifyResult("Hobbies", "Reading")
                        .verifyResult("Picture", "cats.jpg")
                        .verifyResult("Address", "Street 1")
                        .verifyResult("State and City", "Uttar Pradesh Agra");


    }
}