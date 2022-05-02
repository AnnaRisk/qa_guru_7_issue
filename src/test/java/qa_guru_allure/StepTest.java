package qa_guru_allure;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.Test;

public class StepTest {

    private static final String REPOSITORY = "AnnaRisk/qa_guru_7_issue";

    @Test
    public void testGithubIssue() {
        SelenideLogger.addListener("allure", new AllureSelenide());
        ga.guru.allure.WebSteps steps = new ga.guru.allure.WebSteps();

        steps.openMainPage();
        steps.searchForRepository(REPOSITORY);
        steps.clickOnRepositoryLink(REPOSITORY);
        steps.openIssuesTab();
        steps.checkNameIssue("Issues");
    }
}
