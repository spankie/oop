package coll;

public class MyClass implements Comparable<MyClass> {
  private String version, label;

  public MyClass(String version, String label) {
    this.version = version;
    this.label = label;
  }

  public String toString() {
    return this.version + " - " + this.label;
  }

  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  // public boolean equals(Object o) {
  //   MyClass c = (MyClass) o;
  //   return label.equalsIgnoreCase(c.label);
  // }

  public int compareTo(MyClass o) { // 0 ==> ==; - ==> <; + ==> >
    return label.compareToIgnoreCase(o.label);
  }
}