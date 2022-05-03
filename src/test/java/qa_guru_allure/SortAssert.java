package qa_guru_allure;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class SortAssert {

    @Test
    public void textCustom() {
        open("https://github.com/selenide/selenide");
        $("#wiki-tab").click();
        $(".Box-title").click();
        $("#wiki-pages-filter").setValue("SoftAssertions");
        $x("//a[contains(@href, 'SoftAssertions')]").click();
        $("#user-content-3-using-junit5-extend-test-class").parent().shouldHave(text("3. Using JUnit5 extend test class:"));
    }
}
