package org.example.my_patterns.adapter;

public class LoggerMain {
    public static void main(String[] args) {
        LegacyLogger legacyLogger = new LegacyLogger();
        Logger logger = new LegacyLoggerAdapter(legacyLogger);

        logger.log("hi");

        ServiceApp serviceApp = new ServiceApp(logger);
    }
}
