package com.company.web.elements;

import io.qameta.atlas.core.api.Retry;
import io.qameta.atlas.webdriver.AtlasWebElement;
import io.qameta.atlas.webdriver.extension.FindBy;
import io.qameta.atlas.webdriver.extension.Param;

public interface Button {

    @FindBy("//div[@id='{{value}}']")
    AtlasWebElement button(@Param("value") String value);

//    @Retry(timeout = 20, polling = 500)
//    @FindBy("//div[@id='identifierNext']")
//    AtlasWebElement identifierNext();
//
//    @Retry(timeout = 20, polling = 500)
//    @FindBy("//div[@id='passwordNext']")
//    AtlasWebElement passwordNext();
//
//    @Retry(timeout = 20, polling = 500)
//    @FindBy("//*[@id='yDmH0d']")
//    AtlasWebElement conformation();
}
