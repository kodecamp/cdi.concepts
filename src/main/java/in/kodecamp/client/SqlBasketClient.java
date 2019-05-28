package in.kodecamp.client;

import java.util.List;

import javax.inject.Inject;

import in.kodecamp.service.BasketService;
import in.kodecamp.service.NoSqlService;

public class SqlBasketClient {
  private BasketService service;
  @Inject @NoSqlService
  public SqlBasketClient(BasketService service) {
   this.service = service; 
  }
  
  public List<String> getItems() {
    List<String> items = this.service.getItems();
    System.out.println(items);
    return items;
  }
  
  public void addItem(String item) {
    this.service.addItem(item);
  }
}
