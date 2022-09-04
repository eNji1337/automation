package org.example.tests;

import com.codeborne.selenide.Condition;
import org.example.SetUp;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.visible;

public class RandomTest extends SetUp {

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
        mainPage
                .typeSomeTextIntoSearchInputAndPressEnter(dpMethod);

        searchPage.searchResult
                .should(Condition.text(dpMethod));

        searchPage
                .scrollToUkraineInTheBottom()
                .checkIfUkraineLocationIsVisible()
                .logo.click();

        mainPage
                .mainPageLocator.should(visible);
    }
}
