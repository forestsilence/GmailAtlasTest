package com.company.gmail;

import com.company.web.pages.LoginPage;
import com.company.web.pages.PasswordPage;
import com.company.web.sites.GmailSite;
import io.qameta.atlas.core.Atlas;
import io.qameta.atlas.webdriver.WebDriverConfiguration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static ru.yandex.qatools.matchers.webdriver.TextMatcher.text;


public class GmailTest {
    private static final String URL = "https://mail.google.com/";
    private static final String EMAIL = "mailforgmst@gmail.com";
    private static final String PASS = "W1f89sDQp5k";

    private Atlas atlas;
    private WebDriver driver;
    private GmailSite gmailSite;
    private LoginPage loginPage;
    private PasswordPage passwordPage;

    @BeforeTest
    public void startDriver() {
//        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        gmailSite = new Atlas(new WebDriverConfiguration(driver, URL)).create(driver, GmailSite.class);
//        gmailSite = new Atlas(new WebDriverConfiguration(driver, URL))
//                .create(driver, GmailSite.class);
//        atlas = new Atlas(new WebDriverConfiguration(driver, "https://mail.google.com/"));
//        gmailSite = new Atlas(
//                new WebDriverConfiguration(driver, "https://mail.google.com/"))
//                .create(driver, GmailSite.class);
//        loginPage = gmailSite.onLoginPage();
//        passwordPage = gmailSite.onPasswordPage();
    }

    @Test
    public void authorization() {
        LoginPage loginPage = gmailSite.onLoginPage();
        loginPage.inputLogin().sendKeys(EMAIL);
        loginPage.identifierNext().click();
        loginPage.inputPassword().sendKeys(PASS);
        loginPage.passwordNext().click();
        loginPage.conformation().click();
    }
    @Test
    public void authorizationParam() {
        LoginPage loginPage = gmailSite.onLoginPage();
        loginPage.input("email").sendKeys(EMAIL);
        loginPage.button("identifierNext").click();
        loginPage.input("password").sendKeys(PASS);
        loginPage.button("passwordNext").click();
        loginPage.conformation().click();
    }
//    @Ignore
    @Test
    public void openLoginPage(){
//        gmailSite.onLoginPage().open();
        gmailSite.onLoginPage().inputLogin().sendKeys(EMAIL);
        gmailSite.onLoginPage().identifierNext().click();
    }

    @Test
    public void openLoginPage2(){
        LoginPage loginPage = gmailSite.onLoginPage();
        loginPage.inputLogin().sendKeys(EMAIL);
        loginPage.identifierNext().click();
        passwordPage.inputPassword().sendKeys(PASS);
    }
    @Test
    public void openLoginPage3(){
        loginPage.inputLogin().sendKeys(EMAIL);
        loginPage.identifierNext().click();
        passwordPage.inputPassword().sendKeys(PASS);
        passwordPage.buttonNext().click();
    }


    @Test
    public void simpleWebSiteTest() {
//        onSite().onLoginPage().open("https://mail.google.com/");
//        GmailSite gmailSite = onSite();
//        gmailSite.onLoginPage().open("https://mail.google.com/");
//        gmailSite.onLoginPage().inputLogin().sendKeys("mailforgmst@gmail.com");
//        onSite().onLoginPage().inputLogin().submit();
//        gmailSite.onLoginPage().buttonNext().click();
//        onSite().onPasswordPage().inputPassword().sendKeys("W1f89sDQp5k");
//        assertThat(driver, should(textOnCurrentPage(is(containsString("Добро пожаловать!")))));

//        onSite().onLoginPage().header().searchInput().submit();
//        onSite().onSearchPage("Junit 5").repositories().waitUntil(hasSize(10));
    }

    private GmailSite onSite() {
        return atlas.create(driver, GmailSite.class);
    }

//    public void auth() {
//        LoginPage loginPage = gmailSite.onLoginPage();
//        loginPage.inputLogin().sendKeys(EMAIL);
//        loginPage.buttonNext().click();
//        loginPage.inputPassword().sendKeys(PASS);
//    }

    @AfterTest
    public void stopDriver() {
        if (driver != null) driver.quit();
    }

}
