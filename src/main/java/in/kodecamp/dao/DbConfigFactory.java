package in.kodecamp.dao;

import javax.enterprise.inject.Produces;

public class DbConfigFactory {
  
  @Produces
  public DbConfig createConfig() {
     return new DbConfig("http://servers.db.sql.com", "kodecamp", "123456");
   }
}
