package in.kodecamp.dao;

import javax.inject.Named;
import javax.inject.Singleton;

@Named
@Singleton
public class DbConfigProvider implements BaseProvider<DbConfig> {

  public DbConfigProvider() {
    System.out.println("DbConfigProvider : constructor");
  }

  @Override
  public DbConfig get() {
    System.out.println("DbConfigProvider : get");
    return new DbConfig("http://servers.db.sql.com", "kodecamp", "123456");
  }
}
