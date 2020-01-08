package in.kodecamp.test;

import java.util.List;

import javax.enterprise.inject.se.SeContainer;
import javax.enterprise.inject.se.SeContainerInitializer;

import in.kodecamp.client.SqlBasketClient;
import in.kodecamp.dao.BasketDao;
import in.kodecamp.dao.SqlBasketDaoImpl;
import in.kodecamp.service.BasketService;
import in.kodecamp.service.SqlBasketServiceImpl;

/**
 * 
 * @author sunil_arc
 *
 */
public class CdiPlayground {

  public static void main(String[] args) {
    // dependency graph is
    // DbConfig -> Daos (2 Impls) -> Services (2 Impls) -> Clients
//    testDaos();
//    testServices();
//    testClients();
    testAOP();
  }

  private static void testDaos() {
    System.out.println("******************** Test 1 ********************");
    try (SeContainer container = SeContainerInitializer.newInstance().initialize()) {

      BasketDao client1 = container.select(SqlBasketDaoImpl.class).get();
      System.out.println("Client Instance 1 : " + client1);

      BasketDao client2 = container.select(SqlBasketDaoImpl.class).get();
      System.out.println("Client Instance 1 : " + client2);
      System.out.println("[ Client1 == Client2 ] = " + (client1 == client2));
      System.out.println(" ****************************** ");

//      client.addItem("tape");
//      client.addItem("meter");
//      client.addItem("rod");

    }
  }

  private static void testServices() {

    System.out.println("******************** Test 1 ********************");
    try (SeContainer container = SeContainerInitializer.newInstance().initialize()) {

      BasketService service1 = container.select(SqlBasketServiceImpl.class).get();
      System.out.println("Service Instance 1 : " + service1);

      BasketService service2 = container.select(SqlBasketServiceImpl.class).get();
      System.out.println("Service Instance 2 : " + service2);
      System.out.println("[ Service1 == Service2 ] = " + (service1 == service2));
      System.out.println(" ****************************** ");

    }
  }

  /**
   * This method injects the outsider dependency<tt>NonCdiCompatiblePerson</tt>
   * into our bean <tt>PersonClient</tt> by using <tt>@Produces</tt> annotation.
   */
  private static void testClients() {
    try (SeContainer container = SeContainerInitializer.newInstance().initialize()) {
      SqlBasketClient client1 = container.select(SqlBasketClient.class).get();
      SqlBasketClient client2 = container.select(SqlBasketClient.class).get();
      System.out.println("[ Client1 == Client2 ]" + (client1 == client2));
    }
  }

  private static void testAOP() {
    try (SeContainer container = SeContainerInitializer.newInstance().initialize()) {
      BasketService service = container.select(SqlBasketServiceImpl.class).get();
      List<String> items = service.getItems();
      System.out.println(items);
    }
  }
}
