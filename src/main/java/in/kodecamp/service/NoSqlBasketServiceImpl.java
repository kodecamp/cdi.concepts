package in.kodecamp.service;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;
import javax.inject.Named;

import in.kodecamp.dao.BasketDao;

//@NoSqlService
@Named("noSqlBasketService")
public class NoSqlBasketServiceImpl implements BasketService {

  private BasketDao basketDao;
  
  @Inject 
  public NoSqlBasketServiceImpl(@Named("noSqlBasketDao") BasketDao basketDao) {
    System.out.println("NoSqlBasketServiceImpl : Constructor");
    this.basketDao = basketDao;
    System.out.println("NoSqlBasketServiceImpl : basketDao : " + this.basketDao);
  }
 
  @PostConstruct
  public void init() {
    System.out.println("NoSqlBasketServiceImpl : init");
  }
  
  @PreDestroy
  public void destroy() {
    System.out.println("NoSqlBasketServiceImpl : destory");
  }

  @Override
  public int getItemCount() {
    System.out.println("NoSqlBasketServiceImpl : getItemCount");
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
