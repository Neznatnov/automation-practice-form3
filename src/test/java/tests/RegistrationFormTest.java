package tests;

import org.junit.jupiter.api.Test;
import pages.RegistrationPage;

import static testdata.TestData.*;


public class RegistrationFormTest extends TestBase {


    @Test
    void fillRegistrationForm() {

        registrationPage.openPage()
                .removeFooter()
                .setFirstName(firstName)
                .setLastName(lastName)
                .setUserEmail(userEmail)
                .setGender(gender)
                .setUserNumber(userNumber)
                .setBirthDate(birthDay, birthMonth, birthYear)
                .setSubject(subject)
                .setHobbies(hobbies)
                .setPicture()
                .setAddress(address)
                .setState(state)
                .setCity(city)
                .clickSubmit();

        
        registrationPage.verifyRegistrationResultModalAppears()
                        .verifyResult("Student Name", firstName + " " + lastName)
                        .verifyResult("Student Email", userEmail)
                        .verifyResult("Gender", gender)
                        .verifyResult("Mobile", userNumber)
                        .verifyResult("Date of Birth", birthDay + " " + birthMonth + "," + birthYear)
                        .verifyResult("Subjects", subject)
                        .verifyResult("Hobbies", hobbies)
                        .verifyResult("Picture", "cats.jpg")
                        .verifyResult("Address", address)
                        .verifyResult("State and City", state + " " + city);


    }
}
