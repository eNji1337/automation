package org.example.tests;

import com.codeborne.selenide.Condition;
import com.github.javafaker.Faker;
import org.example.SetUp;
import org.example.pages.MainPage;
import org.example.pages.SearchPage;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.sleep;

public class AppTest extends SetUp {

    MainPage mainPage = new MainPage();
    SearchPage searchPage = new SearchPage();
    Faker faker = new Faker();
    public String message = faker.book().title();
    public String pokemon = faker.pokemon().name();

    @DataProvider(name = "dp")
    public Object[][] dpMethod() {
        return new Object[][]{
                {message}, {pokemon}
        };
    }

    @Test(testName = "Just open Gmail")
    public void method1() {
        mainPage
                .checkIfMailBtnIsVisible()
                .mail.click();

    }

    @Test(dataProvider = "dp", testName = "Search tests with DP")
    public void method2(String dpMethod) {
        mainPage.
                searchField.setValue(dpMethod)
                .pressEnter();

        searchPage.searchResult
                .should(Condition.text(dpMethod));
        searchPage
                .scrollToUkraineInTheBottom()
                .ukraine.should(visible);
        searchPage
                .logo.click();
        mainPage
                .mainPageLocator.should(visible);

    }
}
