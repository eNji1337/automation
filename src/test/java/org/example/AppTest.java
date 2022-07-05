package org.example;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.sleep;

public class AppTest extends Base {
    SelenideElement mail = $x("//a[contains(text(),'Почта')]");
    SelenideElement ukraine = $x("//span[text()='Украина']");
    SelenideElement logo = $x("//a[@id='logo']");
    @DataProvider(name = "dp")
    public Object[][] dpMethod() {
        return new Object[][]{
                {message}, {pokemon}
        };
    }

    @Test(priority = 1, testName="Invalid Login Scenario with wrong username and password")
    public void method1() {
        mail.should(visible).click();
    }


    @Test(priority = 2, dataProvider = "dp", testName="Invalid Login Scenario with wrong username")
    public void method2(String dpMethod) {
        $x("//input[@title='Поиск']").setValue(dpMethod).pressEnter();
        $x("//h3[@class='LC20lb MBeuO DKV0Md']").should(Condition.text(dpMethod));
        ukraine.scrollIntoView(true);
        ukraine.should(visible);
        logo.click();
        sleep(1500);
    }
}
