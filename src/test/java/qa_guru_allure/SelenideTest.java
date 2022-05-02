package qa_guru_allure;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.openqa.selenium.By.linkText;
import static org.openqa.selenium.By.partialLinkText;

public class SelenideTest {

    @Test
    @DisplayName("Хороший тест")
    public void testGithubIssue() {
        SelenideLogger.addListener("allure", new AllureSelenide());

        open("https://github.com");

        $(".header-search-input").click();
        $(".header-search-input").sendKeys("AnnaRisk/qa_guru_7_issue");
        $(".header-search-input").submit();

        $(linkText("AnnaRisk/qa_guru_7_issue")).click();
        $(partialLinkText("Issues")).click();
        $(withText("#1")).click();
    }

    @Test
    @DisplayName("Проверка текста Issue")
    public void testIssueName() {
        SelenideLogger.addListener("allure", new AllureSelenide());

        open("https://github.com");

        $(".header-search-input").click();
        $(".header-search-input").sendKeys("AnnaRisk/qa_guru_7_issue");
        $(".header-search-input").submit();

        $(linkText("AnnaRisk/qa_guru_7_issue")).click();
        $("#issues-tab").shouldHave(text("Issues"));

    }
}



