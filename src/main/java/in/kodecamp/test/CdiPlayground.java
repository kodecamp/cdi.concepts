package in.kodecamp.test;

import javax.enterprise.inject.se.SeContainer;
import javax.enterprise.inject.se.SeContainerInitializer;

import in.kodecamp.client.NoSqlBasketClient;
import in.kodecamp.client.PersonClient;
import in.kodecamp.client.SqlBasketClient;

public class CdiPlayground {

  public static void main(String[] args) {
//    test1();
//    test2();
    test3();
  }

  private static void test1() {
    System.out.println("******************** Test 1 ********************");
    try (SeContainer container = SeContainerInitializer.newInstance()
        .initialize()) {

      SqlBasketClient client = container.select(SqlBasketClient.class).get();

      System.out.println("Service Instance 1 : " + client);
      System.out.println(" ****************************** ");

      client.addItem("tape");
      client.addItem("meter");
      client.addItem("rod");
      System.out.println("items : " + client.getItems());

    }
  }

  private static void test2() {

    System.out.println("******************** Test 2 ********************");
    try (SeContainer container = SeContainerInitializer.newInstance()
        .initialize()) {

      NoSqlBasketClient client = container.select(NoSqlBasketClient.class).get();

      System.out.println("Service Instance 2 : " + client);
      System.out.println(" ****************************** ");

      client.addItem("tape");
      client.addItem("meter");
      client.addItem("rod");
      System.out.println("items : " + client.getItems());

    }
  }

  /**
   * This method injects the outsider dependency<tt>NonCdiCompatiblePerson</tt> into
   * our bean <tt>PersonClient</tt> by using <tt>@Produces</tt> annotation.
   */
  private static void test3() {
    try (SeContainer container = SeContainerInitializer.newInstance()
        .initialize()) { 
      PersonClient client = container.select(PersonClient.class).get();
      System.out.println(client.getPerson().getDetails());
    }
  }
}
