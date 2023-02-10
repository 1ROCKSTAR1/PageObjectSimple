import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$x;


// ГЛАВНАЯ СТРАНИЦА
public class MainPage {

    private final SelenideElement fieldLogin = $x("//*[@id=\"user-name\"]");
    private final SelenideElement fieldPass = $x("//*[@id=\"password\"]");
    private final SelenideElement submit = $x("//*[@id=\"login-button\"]");

    public MainPage(String url) { // КОНСТРУКТОР ДЛЯ MAINPAGE
        Selenide.open(url);
    }

    public void enterLogin(String log) {
        fieldLogin.sendKeys(log);
    }

    public void enterPassword(String pas) {
        fieldPass.sendKeys(pas);
    }


    public void clickSubmit() {
        submit.click();

    }
}
