package page;

import config.UserConfig;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginPage {

    public void openLoginPage() {
        open("https://ok.ru/");
    }

    public void enterUserName(String userName) {
        $(byXpath("//*[@id=\"field_email\"]")).setValue(userName);
    }

    public void enterPassword(String password) {
        $(byXpath("//*[@id=\"field_password\"]")).setValue(password);
    }

    public void clickLoginButton() {
        $(byXpath("//*[@id=\"anonymPageContent\"]/div[2]/div/div[3]/form/div[5]/div[1]/input")).click();
    }

    public boolean successfulAuthorization() {
        return $(byXpath("//*[@id=\"hook_Block_ToolbarUserDropdown\"]/div/div[2]/div/div[1]/div[1]/a")).exists();
    }
}
