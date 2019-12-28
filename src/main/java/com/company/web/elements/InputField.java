package com.company.web.elements;

import bsh.commands.dir;
import com.company.web.annotations.Description;
import io.qameta.atlas.core.api.Retry;
import io.qameta.atlas.webdriver.AtlasWebElement;
import io.qameta.atlas.webdriver.extension.FindBy;
import io.qameta.atlas.webdriver.extension.Param;

public interface InputField extends AtlasWebElement {
    /*
    Реализовать функционал @description для аттачинга действий в лог.

            Пример:
    @description("Get header {{ value }}")
    @findby(".//input[contains(@Class,'{{ value }}')]")
    AtlasWebElement searchInput(@param("value") String value);
    */


//    @Description("Input {{ value }}")
//    @FindBy("//input[@type='email']")
//    AtlasWebElement input(@Param("value") String value);

//    <input type="email" class="whsOnd zHQkBf" jsname="YPqjbf" autocomplete="username" spellcheck="false" tabindex="0" aria-label="Телефон или адрес эл. почты" name="identifier" value="" autocapitalize="none" id="identifierId" dir="ltr" data-initial-dir="ltr" data-initial-value="">
    //*[@id="identifierId"]

    @Description(text = "Input {{ value }}")
    @Retry(timeout = 20, polling = 500)
//    @FindBy(".//input[contains(@type, '{{ value}}')]")
    @FindBy("//input[contains(., '{{ value}}')]")
    AtlasWebElement input(@Param("value") String value);

//    @FindBy("//input[@type='{{value}}']")
//    default AtlasWebElement withClearInput(String value) {
//        input(value).clear();
//        return input(value);
//    }
}
