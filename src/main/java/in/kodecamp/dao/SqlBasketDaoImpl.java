package in.kodecamp.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Provider;
import javax.inject.Singleton;

@Named("sqlBasketDao")
@Singleton
public class SqlBasketDaoImpl implements BasketDao {

  private List<String> db = new ArrayList<>();
  private final DbConfig config;

  @Inject
  public SqlBasketDaoImpl(@Named("dbConfigProvider") BaseProvider<DbConfig> configProvider) {
    this.config = configProvider.get();
    System.out.println("BasketSqlDaoImpl : Constructor");
  }

  @Override
  public void persist(String item) {
    System.out.println("BasketSqlDaoImpl : persist");
    this.db.add(item);
  }

  @Override
  public List<String> fetchItems() {
    System.out.println("BasketSqlDaoImpl : fetchItems");
    return this.db;
  }

  @Override
  public void persist(String... items) {
    Arrays.asList(items).forEach(this.db::add);
    System.out.println("BasketSqlDaoImpl : fetchItems");
  }

}
