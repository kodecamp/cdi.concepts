package in.kodecamp.test;

import in.kodecamp.dao.BasketDao;
import in.kodecamp.dao.SqlBasketDaoImpl;
import in.kodecamp.dao.DbConfig;
import in.kodecamp.service.BasketService;
import in.kodecamp.service.SqlBasketServiceImpl;

public class ManualDIPlayground {

  public static void main(String[] args) {
    test1();
    test2();
  }

  private static void test1() {
    System.out.println("******************** Test 1 ******************** ");
    final DbConfig config = new DbConfig("http://servers.db.sql.com",
        "kodecamp", "123456");
    final BasketDao basketDao = new SqlBasketDaoImpl(config);
    final BasketService basketService = new SqlBasketServiceImpl(basketDao);

    basketService.addItem("Test Item 1");
    basketService.addItem("Test Item 2");
    basketService.addItem("Test Item 3");
    System.out.println(basketService.getItems());

  }

  private static void test2() {
    System.out.println("******************** Test 2 ******************** ");
    final DbConfig config = new DbConfig("http://servers.db.sql.com",
        "kodecamp", "123456");
    final BasketDao basketDao = new SqlBasketDaoImpl(config);
    final BasketService basketService = new SqlBasketServiceImpl(basketDao);

    basketService.addItem("Test Item 1");
    basketService.addItem("Test Item 2");
    basketService.addItem("Test Item 3");
    System.out.println(basketService.getItems());

  }

}
