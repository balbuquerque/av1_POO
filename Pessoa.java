public class Pessoa{
  
  public int id;
  public String name;
  public int age;

  public Pessoa(final int id, final String name, final int age) {
    this.id = id;
    this.name = name;
    this.age = age;
  }

  public void setId(final int id) {
    this.id = id;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public void setName(final String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(final int age) {
    this.age = age;
  }

}