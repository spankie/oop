package app;

import people.Person;

public class Lecturer extends Person implements Info, Level {
  private int StaffNo;
  private long salary;
  private int level;

  public Lecturer(String name, String gender, String nationality, String dob, String title, int sn, long salary, int level) {
    super(name, gender, nationality, dob, title);
    this.salary = salary;
    this.level = level;
    this.StaffNo = sn;
  }

  public long Salary() {
    return this.salary;
  }

  public int MyLevel() {
  return this.level;
  }

  public long SchoolFees() {
    return 0;
  }

  public String details() {
    return this.getName();
  }

  public String bio() {
    return this.getDob();
  }
}
