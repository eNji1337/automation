package org.example.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class MainPage {

    public SelenideElement mainPageLocator = $x("//img[@alt='Google']");
    public SelenideElement mail = $x("//a[contains(text(),'Почта')]");
    public SelenideElement searchField = $x("//input[@title='Поиск']");

    public MainPage checkIfMailBtnIsVisible(){
        mail.should(Condition.visible);
        return this;
    }

}
