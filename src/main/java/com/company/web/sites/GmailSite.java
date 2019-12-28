package com.company.web.sites;

import com.company.web.pages.LoginPage;
import com.company.web.pages.PasswordPage;
import io.qameta.atlas.webdriver.WebSite;
import io.qameta.atlas.webdriver.extension.Page;

public interface GmailSite extends WebSite {

    @Page/*(url = "mail")*/ //url в скобках добавляется к url сайта
    LoginPage onLoginPage();

//    @Page
//    PasswordPage onPasswordPage();
}
