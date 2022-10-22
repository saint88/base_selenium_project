package data;

public enum MainMenuItemsData {
  Cources("Курсы");

  private String name;

  MainMenuItemsData(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }
}
