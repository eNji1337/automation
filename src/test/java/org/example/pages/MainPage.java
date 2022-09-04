package org.example.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;

public class MainPage {

    public SelenideElement mainPageLocator = $x("//img[@alt='Google']");
    public SelenideElement mail = $x("//a[contains(text(),'Почта')]");
    public SelenideElement searchField = $x("//input[@title='Поиск']");
    public SelenideElement logInBtn = $x("//a[text()='Войти']");

    @Step
    public MainPage checkIfMailBtnIsVisible() {
        mail.should(Condition.visible);
        return this;
    }

    @Step
    public MainPage typeSomeTextIntoSearchInputAndPressEnter(String text){
        searchField.setValue(text).pressEnter();
        return this;
    }

    @Step
    public LoginPage clickOnLogInBtn(){
        logInBtn.should(Condition.visible).click();
        return new LoginPage();
    }
}
