package in.kodecamp.util;

public class ConsoleLoggerImpl implements Logger {

  public void log(String message) {
    System.out.println("CONSOLE : " + message);
  }
}
