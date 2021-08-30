import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.LoginPage;

/**
 * Демонстрационный тест
 */
public class DemoTest extends BaseTest {
    static LoginPage loginPage = new LoginPage();;

    @Test
    void authSuccessTest() {
        loginPage.inputLogin("demo");
        loginPage.inputPassword("demo");
        loginPage.clickLoginBtn();
        Assertions.assertFalse(loginPage.getErrorLoginAlert().exists());
    }

    @Test
    void authErrorTest() {
        loginPage.inputLogin("demo");
        loginPage.inputPassword("123");
        loginPage.clickLoginBtn();
        Assertions.assertTrue(loginPage.getErrorLoginAlert().exists());
    }
}
