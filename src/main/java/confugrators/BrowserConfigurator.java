package confugrators;

import com.codeborne.selenide.Configuration;

import static loaders.PropertyLoader.getPropertyValue;

/**
 * Конфигуратор браузера
 */
public class BrowserConfigurator {
    public static void configureBrowser() {
        Configuration.browser = getPropertyValue("autotests.browser");
        Configuration.startMaximized = Boolean.parseBoolean(getPropertyValue("autotests.browser.startMaximized"));
        Configuration.webdriverLogsEnabled = Boolean.parseBoolean(getPropertyValue("autotests.webdriverLogsEnabled"));
        Configuration.savePageSource = Boolean.parseBoolean(getPropertyValue("autotests.savePageSource"));
        Configuration.baseUrl = getPropertyValue("autotests.base.url");
    }
}
