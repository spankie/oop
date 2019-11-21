package people;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public abstract class Person {

  private String name;
  private String gender;
  private String nationality;
  private Date dob;
  private String title;

  public Person(String name, String gender, String nationality, String dob, String title) {
    this.name = name;
    this.gender = gender;
    this.nationality = nationality;
    try {
      this.setDob(dob);
    } catch(ParseException e) {
      System.out.println(e);
    }
    this.title = title;
  }

  // Define setters;
  public void setName(String name) {
    this.name = name;
  }
  public void setGender(String gender) {
    this.gender = gender;
  }
  public void setNationality(String nationality) {
    this.nationality = nationality;
  }
  public void setDob(String dob) throws ParseException {
    SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
    Date d;
    try {
      d = ft.parse(dob);
      this.dob = d;
    } catch(ParseException pe) {
      System.out.println(pe.toString());
      throw pe;
    }
  }
  public void setTitle(String title) {
    this.title = title;
  }

  // Define getters;
  public String getName() {
    return this.name;
  }
  public String getGender() {
    return this.gender;
  }
  public String getNationality() {
    return this.nationality;
  }
  public String getDob() {
    return this.dob.toString();
  }
  public String getTitle() {
    return this.title;
  }
}
