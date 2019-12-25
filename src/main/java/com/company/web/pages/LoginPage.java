package com.company.web.pages;

import io.qameta.atlas.webdriver.AtlasWebElement;
import io.qameta.atlas.webdriver.WebPage;
import io.qameta.atlas.webdriver.extension.FindBy;

public interface LoginPage extends WebPage, AtlasWebElement {
//    @FindBy("//a[contains(text(), 'Or start a free trial of Enterprise Server')]")

//    @Description("Input Email")
    @FindBy("//input[@type='email']")
    AtlasWebElement inputLogin();

    @FindBy("//div[@id='identifierNext']")
    AtlasWebElement buttonNext();
}
