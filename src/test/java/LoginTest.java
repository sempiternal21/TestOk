import config.UserConfig;
import org.junit.jupiter.api.Test;
import page.LoginPage;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginTest {

    LoginPage loginPage = new LoginPage();

    @Test
    public void authorization() {

        loginPage.openLoginPage();
        loginPage.enterUserName(UserConfig.USER_LOGIN);
        loginPage.enterPassword(UserConfig.USER_PASSWORD);
        loginPage.clickLoginButton();

        assertTrue(loginPage.successfulAuthorization());
    }
}
