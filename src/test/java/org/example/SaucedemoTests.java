package org.example;

import org.example.Captured.Saucedemo;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.example.Calenium.*;

public class SaucedemoTests {

    @Before
    public void setUp() {
        launch("https://www.saucedemo.com/");
    }

    @Test
    public void login() {
        type_byId(Saucedemo.textBox_username, "standard_user");
        type_byId(Saucedemo.textBox_password, "secret_sauce");
        click_byId(Saucedemo.submitButton_login);
    }

    @After
    public void tearDown() {
        closeBrowser();
    }
}
