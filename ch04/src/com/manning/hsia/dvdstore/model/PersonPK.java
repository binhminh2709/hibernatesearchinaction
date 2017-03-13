package com.manning.hsia.dvdstore.model;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class PersonPK implements Serializable {
  private String firstName;
  private String lastName;

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

}
