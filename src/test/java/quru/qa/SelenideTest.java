package quru.qa;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class SelenideTest {

    @DisplayName("Check article SoftAssertions in selenide's wiki")
    @Test
    void findSampleCodeJunit() {

        open("https://github.com/");

        $(".form-control").click();
        $(".header-search-input").setValue("Selenide").pressEnter();
        $$("ul.repo-list li").first().$("a").click();
        $("#wiki-tab").click();
        $("button.js-wiki-more-pages-link").click();
        $("#wiki-pages-box").shouldHave(text("SoftAssertions"));
        $("#wiki-pages-box").$(byText("SoftAssertions")).click();
        $("#wiki-body").shouldHave(text("2. Using JUnit4 just describe rule inside test class:"));
    }
}
