package tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class SimpleHabrTest extends BaseTest {

    @Test
    void openTest() {
        open("");
        $(".tm-header__container").shouldHave(text("Хабр"));
    }
}
