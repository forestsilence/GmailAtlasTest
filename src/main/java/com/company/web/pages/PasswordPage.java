package com.company.web.pages;

import io.qameta.atlas.webdriver.AtlasWebElement;
import io.qameta.atlas.webdriver.WebPage;
import io.qameta.atlas.webdriver.extension.FindBy;

public interface PasswordPage extends WebPage {
    @FindBy("//input[@type='password']")
    AtlasWebElement inputPassword();
}
