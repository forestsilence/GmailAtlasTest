package com.company.web.pages;

import io.qameta.atlas.webdriver.AtlasWebElement;
import io.qameta.atlas.webdriver.WebPage;
import io.qameta.atlas.webdriver.extension.FindBy;
import io.qameta.atlas.webdriver.extension.Selector;
import org.openqa.selenium.WebElement;

public interface MainPage extends WebPage {
//    #\:2y
    //*[@id=":2y"]
//    <span class="yP" email="no-reply@accounts.google.com" name="Google">Google</span>
//    <tr class="zA yO" jscontroller="ZdOxDb" jsaction="Tnvr6c:RNc9jf;PG1zDd:eyrEaf;WGbBt:UL4Ddb;nVvxM:UL4Ddb;" jsmodel="nXDxbd" id=":6w" tabindex="-1" role="row" aria-labelledby=":6z" draggable="true"><td class="PF xY"></td><td id=":6x" class="oZ-x3 xY" style=""><div id=":6y" class="oZ-jc T-Jo J-J5-Ji " role="checkbox" aria-labelledby=":6z" dir="ltr" aria-checked="false" tabindex="-1"><div class="T-Jo-auh"></div></div></td><td class="apU xY"><span id=":70" class="aXw T-KT" title="Не помечено" aria-label="Не помечено" role="button"><img class="T-KT-JX" src="images/cleardot.gif" alt="Не помечено"></span></td><td class="xY bnk byv"></td><td class="yX xY " role="gridcell" tabindex="-1"><div id=":6z" class="afn"><span class="bA4"><span class="yP" email="whitepeak@mail.ru" name="Александр" data-hovercard-id="whitepeak@mail.ru">Александр</span></span> <span class="bx0">5</span>, <span data-thread-id="#thread-f:1654009536642772396" data-legacy-thread-id="16f438e906b36dac" data-legacy-last-message-id="16f438f4edd46df5" data-legacy-last-non-draft-message-id="16f438f4edd46df5">тестовое задание</span>, <span>22:54</span>, Письмо 05 С уважением, Александр whitepeak@mail.ru.</div><div id=":71" class="yW"><span class="bA4"><span class="yP" email="whitepeak@mail.ru" name="Александр" data-hovercard-id="whitepeak@mail.ru" data-hovercard-owner-id="145">Александр</span></span> <span class="bx0">5</span></div></td><td id=":72" tabindex="-1" class="xY a4W" role="gridcell"><div class="xS" role="link"><div class="xT"><div class="y6"><span id=":74" class="bog"><span data-thread-id="#thread-f:1654009536642772396" data-legacy-thread-id="16f438e906b36dac" data-legacy-last-message-id="16f438f4edd46df5" data-legacy-last-non-draft-message-id="16f438f4edd46df5">тестовое задание</span></span></div><span class="y2"><span class="Zt">&nbsp;-&nbsp;</span>Письмо 05 С уважением, Александр whitepeak@mail.ru</span></div></div></td><td class="byZ xY" role="gridcell" tabindex="-1"></td><td class="yf xY ">&nbsp;</td><td class="xW xY " role="gridcell" tabindex="-1"><span title="чт, 26 дек. 2019 г., 22:54" id=":76" aria-label="чт, 26 дек. 2019 г., 22:54"><span>22:54</span></span></td><td class="bq4 xY"><ul class="bqY" id=":77" role="toolbar"><li class="bqX brq" data-tooltip="Архивировать" jsaction="JqEhuc" jscontroller="pk1i4d"></li><li class="bqX bru" data-tooltip="Удалить" jsaction="zM6fo" jscontroller="pmCKac"></li><li class="bqX brs" data-tooltip="Отметить как непрочитанное" jsaction="XdlY1e" jscontroller="VtSflc"></li><li class="bqX brv" data-tooltip="Отложить" jsaction="u4Fnue" jscontroller="PKSrle"></li></ul></td></tr>
//    @FindBy(selector = Selector.ID, value = ":6w")//айдишники разные
//    @FindBy("//input[@type='email']")
    @FindBy(selector = Selector.CSS, value = ".zA.yO") //класс одинаков для всех строк с письмами
    AtlasWebElement<WebElement> mails();

//    //*[@id=":3a"]
//    #\:33 > span > span
//    //*[@id=":33"]/span/span
}
