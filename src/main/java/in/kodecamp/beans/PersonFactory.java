package in.kodecamp.beans;

import javax.enterprise.inject.Produces;

public class PersonFactory {

  @Produces
  public static NonCdiCompatiblePerson createPerson() {
    return new NonCdiCompatiblePerson("Sunil", "Naini");
  }
}
