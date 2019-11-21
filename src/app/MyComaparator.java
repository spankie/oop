package app;

import java.util.Comparator;

import coll.MyClass;

public class MyComaparator implements Comparator<MyClass> {
  public int compare(MyClass x, MyClass y) {
    return x.getVersion().compareToIgnoreCase(y.getVersion());
  }
}
