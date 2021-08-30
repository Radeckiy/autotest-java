import com.codeborne.selenide.junit5.ScreenShooterExtension;
import com.codeborne.selenide.junit5.TextReportExtension;
import confugrators.BrowserConfigurator;
import confugrators.VideoRecorderConfigurator;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;

import static com.codeborne.selenide.Selenide.clearBrowserCookies;
import static com.codeborne.selenide.Selenide.open;

/**
 * Базовый класс для тестов
 */
@Slf4j
@ExtendWith({ScreenShooterExtension.class, TextReportExtension.class})
public class BaseTest {
    /**
     * Перед началом всех тестов - вызов конфигураторов
     */
    @BeforeAll
    public static void setUp() {
        BrowserConfigurator.configureBrowser();
        VideoRecorderConfigurator.configureVideoRecorder();
    }

    /**
     * Перед каждым тестом - очистка cookies и открытие браузера
     */
    @BeforeEach
    public void beforeTest() {
        clearBrowserCookies();
        open("/");
    }
}
