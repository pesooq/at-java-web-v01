package demo.part02;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class SimpleXPathTests {

    @Test
    void testPageH1() {
        open("https://slqamsk.github.io/tmp/xPath01.html");
        //Содержит такой текст
        $x("//h1").shouldHave(text("Учебная страница для XPath"));
        //Точное соответствие
        $x("//h1").shouldHave(exactText("Учебная страница для XPath"));
    }
}
