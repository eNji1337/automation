package org.example;

import com.codeborne.selenide.Configuration;
import com.github.javafaker.Faker;
import org.example.pages.MainPage;
import org.example.pages.SearchPage;
import org.testng.annotations.*;

import static com.codeborne.selenide.Selenide.*;

public class SetUp {

    public MainPage mainPage = new MainPage();
    public SearchPage searchPage = new SearchPage();
    public Faker faker = new Faker();
    public String message = faker.book().title();
    public String pokemon = faker.pokemon().name();

    @BeforeMethod
    public void openUrl() {
        Configuration.browserSize="1920x1080";
        open("https://google.com");
    }

    @AfterMethod
    public void quit() {
        closeWebDriver();
    }
}
