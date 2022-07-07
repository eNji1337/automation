package org.example;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideConfig;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.closeWebDriver;

public class SetUp {


    @BeforeTest
    public void openUrl() {
        open("https://google.com");
    }

    @AfterTest
    public void quit() {
        Selenide.closeWebDriver();
    }
}
