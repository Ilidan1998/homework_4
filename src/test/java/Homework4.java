import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.open;

public class Homework4 {
    @Test
public void test5() {
    open("https://www.youtube.com/");
    $(byName("search_query")).setValue("ტესტირების ავტომატიზაცია").pressEnter();


}}