package data.cources;

public enum CourcesData {
  Testing("Тестирование"),
  Dev("Программирование");

  private String name;

  CourcesData(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

}
