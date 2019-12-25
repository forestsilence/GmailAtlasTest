package com.company.gmail;

import io.qameta.atlas.core.Atlas;
import io.qameta.atlas.webdriver.WebDriverConfiguration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.company.web.sites.GmailSite;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static ru.yandex.qatools.matchers.decorators.MatcherDecorators.should;
import static ru.yandex.qatools.matchers.webdriver.driver.HasTextMatcher.textOnCurrentPage;


public class WebSiteTest {
    private Atlas atlas;
    private WebDriver driver;

    @BeforeTest
    public void startDriver() {
        driver = new ChromeDriver();
        atlas = new Atlas(new WebDriverConfiguration(driver, "https://mail.google.com/"));
    }

//    @Ignore
    @Test
    public void simpleWebSiteTest() {
//        onSite().onLoginPage().open("https://mail.google.com/");
        onSite().onLoginPage().inputLogin().sendKeys("mailforgmst@gmail.com");
//        onSite().onLoginPage().inputLogin().submit();
//        onSite().onLoginPage().buttonNext().click();
//        onSite().onPasswordPage().inputPassword().sendKeys("W1f89sDQp5k");
//        assertThat(driver, should(textOnCurrentPage(is(containsString("Добро пожаловать!")))));

//        onSite().onLoginPage().header().searchInput().submit();
//        onSite().onSearchPage("Junit 5").repositories().waitUntil(hasSize(10));
    }

    private GmailSite onSite() {
        return atlas.create(driver, GmailSite.class);
    }

//    @AfterTest
//    public void stopDriver() {
//        driver.quit();
//    }

}
