package in.kodecamp.dao;

import java.util.List;

public interface BasketDao {
  public void persist(String item);
  public void persist(String ...items);
  public List<String> fetchItems();
}
