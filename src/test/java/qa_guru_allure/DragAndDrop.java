package qa_guru_allure;

import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class DragAndDrop {
    @Test
    public void testDragDrop() {
        open("https://the-internet.herokuapp.com/drag_and_drop");
        SelenideElement blockA = $("#column-a");
        SelenideElement blockB = $("#column-b");
       //actions().dragAndDrop(blockA,blockB).release().build().perform();
     //   actions().moveToElement(blockA).clickAndHold().moveToElement(blockB).release().build().perform();
        actions().clickAndHold(blockA).moveToElement(blockB).release().build().perform();
        $("#column-a").shouldHave(text("B"));
        $("#column-b").shouldHave(text("A"));

    }


}


