package in.kodecamp.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.inject.Inject;

@NoSqlDb
public class NoSqlBasketDaoImpl implements BasketDao {
  
  private List<String> items = new ArrayList<>();
  private final DbConfig config;

  @Inject
  public NoSqlBasketDaoImpl(DbConfig config) {
    System.out.println("NoSqlBasketDaoImpl : Constructor");
    this.config = config;
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
