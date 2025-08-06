/*
9. **Interface and Multiple Implementations:**
Create an interface `Logger` with methods `log(String message)` and `clearLog()`.
 Implement this interface in two classes: `FileLogger` and `ConsoleLogger`.
 Write a method `logData(Logger logger)` that accepts the `Logger` interface
 and logs a message using either implementation.
 */

class Mains9{
    static String m;
    public static void main(String []args){
        Mains9 ob1 = new Mains9();
        Logger l1 = new FileLogger();
        Logger l2 = new ConsoleLogger();
        m="Logging to FILE 12345";
        ob1.logData(l1);
        m="Logging to Console 12345";
        ob1.logData(l2);
    }
    void logData(Logger logger){
        logger.log(m);
        logger.clearLog();
    }
}
interface Logger{
    public abstract void log(String message);
    public abstract void clearLog();
}
class FileLogger implements Logger{
    public void log(String m){
        System.out.println(m);
    }
    public void clearLog(){
        System.out.println("Log Cleared");
    }
}
class ConsoleLogger implements Logger{
    public void log(String m){
        System.out.println("CONSOLE: "+m);
    }
    public void clearLog(){
        System.out.println("CONSOLE: Log Cleared");
    }
}