package in.kodecamp.client;

import javax.inject.Inject;

import in.kodecamp.beans.NonCdiCompatiblePerson;

public class PersonClient {

  @Inject
  private NonCdiCompatiblePerson person;

  public NonCdiCompatiblePerson getPerson() {
    return this.person;
  }
}
