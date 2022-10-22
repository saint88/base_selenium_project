package data.cources;

public enum DevCourceData implements ICourceData {
  CPLUSPLUS("C++", CourcesData.Dev);

  private String name;
  private CourcesData courcesData;

  DevCourceData(String name, CourcesData courcesData) {
    this.name = name;
    this.courcesData = courcesData;
  }

  public String getName() {
    return name;
  }

  public CourcesData getCourcesData() {
    return courcesData;
  }

}
