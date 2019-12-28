package com.company.web.pages;

import com.company.web.elements.Button;
import com.company.web.elements.InputField;
import io.qameta.atlas.core.api.Retry;
import io.qameta.atlas.webdriver.AtlasWebElement;
import io.qameta.atlas.webdriver.WebPage;
import io.qameta.atlas.webdriver.extension.FindBy;
import io.qameta.atlas.webdriver.extension.Page;
import io.qameta.atlas.webdriver.extension.Selector;

public interface LoginPage extends WebPage, InputField, Button {
//    @FindBy("//a[contains(text(), 'Or start a free trial of Enterprise Server')]")

//    @Description("Input Email")
//    @BaseUrl("https://mail.google.com/")
//    @FindBy(selector = Selector.CSS, value = "#identifierId")
//    @Retry(timeout = 20, polling = 500)
    @FindBy("//input[@type='email']")
    AtlasWebElement inputLogin();

    @Retry(timeout = 20, polling = 500)
    @FindBy("//div[@id='identifierNext']")
    AtlasWebElement identifierNext();

//    @Retry(timeout = 20, polling = 500)
    @FindBy("//input[@type='password']")
    AtlasWebElement inputPassword();

    @Retry(timeout = 20, polling = 500)
    @FindBy("//div[@id='passwordNext']")
    AtlasWebElement passwordNext();

    //*[@id="yDmH0d"]/c-wiz[2]/c-wiz/div/div[1]/div/div/div/div[2]/div[3]/div/div[2]/div
    @Retry(timeout = 20, polling = 500)
    @FindBy("//*[@id='yDmH0d']")
    AtlasWebElement conformation();


    @Override
    default void open(String url) {    }

    @Override
    default void open() {    }


//    @description("Get header {{ value }}")
//    @Findby(".//input[contains(@Class,'{{ value }}')]")
//    AtlasWebElement searchInput(@param("value") String value);
}
