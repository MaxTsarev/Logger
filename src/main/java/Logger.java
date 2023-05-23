import java.util.Date;

public class Logger {

    protected String value;
    protected int num = 1;

    private static Logger logger;


    private Logger() {
        Date date = new Date();
        value = date.toString();
    }


    public void log(String msg) {
        System.out.println("[" + value + " " + num++ + "] " + msg);
    }

    public static Logger getInstance() {
        if (logger == null) logger = new Logger();
        return logger;
    }
}
