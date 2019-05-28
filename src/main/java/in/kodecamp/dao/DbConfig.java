package in.kodecamp.dao;

public class DbConfig {
  private String url;
  private String username;
  private String password;

  public DbConfig(String url, String username, String password) {
    this.url = url;
    this.username = username;
    this.password = password;
  }

  public String getUsername() {
    return username;
  }

  public String getUrl() {
    return url;
  }

  public String getPassword() {
    return password;
  }

  @Override
  public String toString() {
    return String.format("[ url = %s, username = %s, password = %s ]", url,username,password);
  }

  
  
}
