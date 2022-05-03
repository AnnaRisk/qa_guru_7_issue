package qa_guru_allure;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static org.openqa.selenium.By.linkText;

public class SortAssert {

    @Test
    public void textCustom() {

        open("https://github.com/selenide/selenide");
        $("#wiki-tab").click();
        $(".Box-title").click();
        $("#wiki-body").$(linkText("Soft assertions")).shouldHave(text("Soft Assertions"));
        $("#wiki-body").$(linkText("Soft assertions")).click();
        $("#user-content-3-using-junit5-extend-test-class").parent().shouldHave(text("3. Using JUnit5 extend test class:"));
    }


}
