package pages;

import com.codeborne.selenide.SelenideElement;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

/**
 * Страница авторизации в виде PageObject
 */
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class LoginPage {
    final SelenideElement userInput = $(By.id("username"));
    final SelenideElement passInput = $(By.id("password"));
    final SelenideElement loginBtn = $("#login-button");
    final SelenideElement errorLoginAlert = $("#alerts-container > div.alert.alert-error");

    public void inputLogin(String username) {
        userInput.clear();
        userInput.setValue(username);
    }

    public void inputPassword(String pass) {
        userInput.clear();
        passInput.setValue(pass);
    }

    public void clickLoginBtn() {
        loginBtn.click();
    }
}
