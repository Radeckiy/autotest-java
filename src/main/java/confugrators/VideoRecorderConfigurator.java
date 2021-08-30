package confugrators;

import static loaders.PropertyLoader.getPropertyValue;

/**
 * Конфигуратор видео рекордера
 */
public class VideoRecorderConfigurator {
    public static void configureVideoRecorder() {
        // Set video save folder
        System.setProperty("video.folder", getPropertyValue("video.folder"));
        System.setProperty("video.mode", getPropertyValue("video.mode"));
    }
}
