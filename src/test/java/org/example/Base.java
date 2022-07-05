package org.example;

import com.github.javafaker.Faker;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.closeWebDriver;

public class Base {
    Faker faker = new Faker();
    String message = faker.book().title();
    String pokemon = faker.pokemon().name();

    @BeforeMethod
    public void openUrl() {
        open("https://google.com");
    }

    @BeforeClass
    public void randomMessageFromFaker() {
        for (int i = 0; i < 5; i++) {
            System.out.println(message);
        }
    }

    @AfterTest
    public void quit() {
        closeWebDriver();
    }
}
