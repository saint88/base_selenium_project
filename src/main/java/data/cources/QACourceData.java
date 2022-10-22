package data.cources;

import data.cources.CourcesData;

public enum QACourceData implements ICourceData {
  QALead("QA Lead", CourcesData.Testing);

  private String name;
  private CourcesData courcesData;

  QACourceData(String name, CourcesData courcesData) {
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
