package singleton;

public class Logger {
    // Step 1: Private static instance variable
    private static Logger instance;

    // Step 2: Private constructor to prevent direct instantiation
    private Logger() {
        System.out.println("Logger instance created");
    }

    
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    
    public void log(String message) {
        System.out.println("Log: " + message);
    }
}
