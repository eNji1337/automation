package org.example.tests;

import org.example.SetUp;
import org.testng.annotations.Test;

public class CreateGoogleAccountTest extends SetUp {

    @Test
    public void createAccountPositive() {
        mainPage
                .clickOnLogInBtn()
                .clickOnCreateNewAccountBtn()
                .chooseAccountType("Для себя");
    }
}

