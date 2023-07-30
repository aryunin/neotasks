package singleton;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Logger {
    private static final String prefix = "Log info:";
    private static volatile Logger logger;

    private Logger() {
    }

    public static Logger getInstance() {
        if(logger == null) {
            synchronized (Logger.class){
                if(logger == null) {
                    logger = new Logger();
                }
            }
        }
        return logger;
    }

    public void classLogg(Object obj, String info) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yy");
        System.out.println(
                prefix + " " + LocalDate.now().format(dtf) + " - " + obj.getClass().getSimpleName() + " - " + info
        );
    }
}
