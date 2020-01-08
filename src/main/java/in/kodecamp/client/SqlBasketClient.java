package in.kodecamp.client;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;
import in.kodecamp.service.BasketService;

@Named
public class SqlBasketClient {
  private BasketService service;
  @Inject  
  public SqlBasketClient(@Named("sqlBasketService") BasketService service) {
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
