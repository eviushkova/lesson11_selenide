package quru.qa;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class GithubTest {

    @Test
    void titleCheck() {
        open("https://github.com/");

        $(".list-style-none").hover();
        $(byText("Enterprise")).click();
        $(".enterprise-hero").shouldHave(text("Build like the best"));
    }
}
