package in.kodecamp.service;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.inject.Default;
import javax.inject.Inject;

import in.kodecamp.dao.BasketDao;

public class SqlBasketServiceImpl implements BasketService {

  private BasketDao basketDao;
  
  @Inject @SqlDb 
  public SqlBasketServiceImpl(BasketDao basketDao) {
    System.out.println("SqlServiceImpl : Constructor");
    this.basketDao = basketDao;
    System.out.println("SqlServiceImpl : basketDao : " + this.basketDao);
  }
 
  @PostConstruct
  public void init() {
    System.out.println("SqlServiceImpl : init");
  }
  
  @PreDestroy
  public void destroy() {
    System.out.println("SqlServiceImpl : destory");
  }

  @Override
  public int getItemCount() {
    return this.basketDao.fetchItems().size();
  }

  @Override
  public void addItem(String item) {
    this.basketDao.persist(item);
  }

  @Override
  public List<String> getItems() {
    return this.basketDao.fetchItems();
  }

  @Override
  public void addItem(String... items) {
    this.basketDao.persist(items);
  }

}
