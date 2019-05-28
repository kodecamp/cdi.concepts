package in.kodecamp.util;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;

public class FileLoggerImpl {

  private String file;

  public FileLoggerImpl() { }
//  public FileLoggerImpl(String file) {
//    this.file = file;
//    System.out.println("Log file : " + this.file);
//  }

  public void log(String message) {
    System.out.println("Log : " + message);
  }

//  @Produces
//  @RequestScoped
  public static FileLoggerImpl createLogger() {
//    return new FileLoggerImpl("mylog.txt");
    return new FileLoggerImpl();
  }

}
