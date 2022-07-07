package org.example.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.github.javafaker.Faker;
import org.testng.annotations.DataProvider;

import static com.codeborne.selenide.Selenide.$x;

public class SearchPage  {

    public SelenideElement searchResult = $x("//h3[@class='LC20lb MBeuO DKV0Md']");
    public SelenideElement ukraine = $x("//span[text()='Украина']");
    public SelenideElement logo = $x("//a[@id='logo']");

    public SearchPage scrollToUkraineInTheBottom(){
        ukraine.scrollIntoView(true);
        return this;
    }
}
