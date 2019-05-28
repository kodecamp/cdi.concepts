package in.kodecamp.service;

import java.util.List;

public interface BasketService {
  public int getItemCount();
  public void addItem(String item); 
  public void addItem(String ...items); 
  public List<String> getItems();
}
