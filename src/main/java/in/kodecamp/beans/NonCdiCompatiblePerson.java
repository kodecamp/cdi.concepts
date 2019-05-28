package in.kodecamp.beans;

public class NonCdiCompatiblePerson {

  private final String name;
  private final String address;

  public NonCdiCompatiblePerson(final String name, final String address) {
    this.name = name;
    this.address = address;
  }

  public String getDetails() {
    return String.format("My name is %s and I live in %s.", this.name,
        this.address);
  }

  @Override
  public String toString() {
    return String.format("[ name = %s, address = %s", this.name, this.address);
  }

}
