package org.example.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$x;

public class LoginPage {

    public SelenideElement createNewAccountBtn = $x("//span[text()='Создать аккаунт']");

    @Step
    public LoginPage clickOnCreateNewAccountBtn() {
        createNewAccountBtn.should(Condition.visible).click();
        return this;
    }

    @Step
    public LoginPage chooseAccountType(String type){
        $x("//span[contains(text(),'"+type+"')]").click();
        return this;
    }
}