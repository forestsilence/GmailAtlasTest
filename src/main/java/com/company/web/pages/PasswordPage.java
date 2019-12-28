package com.company.web.pages;

import io.qameta.atlas.core.api.Retry;
import io.qameta.atlas.webdriver.AtlasWebElement;
import io.qameta.atlas.webdriver.WebPage;
import io.qameta.atlas.webdriver.extension.FindBy;
//import java.lang.annotation.*;

public interface PasswordPage extends WebPage {

//    @Description("Password field")
    @FindBy("//input[@type='password']")
    AtlasWebElement inputPassword();

//    @Description("Next button")
    @Retry(timeout = 20, polling = 500)
    @FindBy("//div[@id='identifierNext']")
    AtlasWebElement buttonNext();

//    @Description("Search result for user {{userName}}")
//    @FindBy(".//div[contains(@class, 'search-result-item') and contains(., {{userName}}]")
//    UserResult user(@Param("userName") String userName);

}
