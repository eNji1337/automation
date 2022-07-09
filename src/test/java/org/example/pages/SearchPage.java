package org.example.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;

public class SearchPage {

    public SelenideElement searchResult = $x("//h3[@class='LC20lb MBeuO DKV0Md']");
    public SelenideElement ukraine = $x("//span[text()='Украина']");
    public SelenideElement logo = $x("//a[@id='logo']");

    @Step
    public SearchPage scrollToUkraineInTheBottom() {
        ukraine.scrollIntoView(true);
        return this;
    }
    @Step
    public SearchPage checkIfUkraineLocationIsVisible(){
        ukraine.should(Condition.visible);
        return this;
    }

}
