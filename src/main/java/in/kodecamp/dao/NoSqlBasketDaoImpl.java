package in.kodecamp.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

//@NoSqlDb
@Named("noSqlBasketDao")
public class NoSqlBasketDaoImpl implements BasketDao {
  
  private List<String> items = new ArrayList<>();
  private final DbConfig config;

  @Inject
  public NoSqlBasketDaoImpl(DbConfigProvider configProvider) {
    System.out.println("NoSqlBasketDaoImpl : Constructor");
    this.config = configProvider.get();
  }
  
  @Override
  public void persist(String item) {
    this.items.add(item);
    System.out.println("NoSqlBasketDaoImpl : persist");
  }

  @Override
  public void persist(String... items) {
    System.out.println("NoSqlBasketDaoImpl : persist");
    Arrays.asList(items).forEach(this::persist); 
  }

  @Override
  public List<String> fetchItems() {
    System.out.println("NoSqlBasketDaoImpl : fetchItems");
    return this.items;
  }

}
