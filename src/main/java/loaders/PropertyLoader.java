package loaders;

import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Загрузчик файлов properties
 */
@Slf4j
public class PropertyLoader {
    private static final Properties props;

    static {
        props = new Properties();
        loadApplicationProps();
    }

    /**
     * Загрузка application.properties
     */
    private static void loadApplicationProps() {
        loadCustomProps("/application.properties");
    }

    /**
     * Загрузка любого файла properties
     * @param propFileName полное наименование файла properties
     */
    public static void loadCustomProps(String propFileName) {
        try {
            InputStream stream = PropertyLoader.class.getResourceAsStream(propFileName);
            props.load(stream);

        } catch (IOException ex) {
            log.error("Exception: ", ex);
        }
    }

    /**
     * Интерфейс для получения одного из загруженных property
     * @param key ключ property
     * @return значение (value) property
     */
    public static String getPropertyValue(String key) {
        return props.getProperty(key);
    }
}
