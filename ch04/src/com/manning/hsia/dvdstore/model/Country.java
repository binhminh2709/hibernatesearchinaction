package com.manning.hsia.dvdstore.model;

import org.hibernate.search.annotations.Field;

import javax.persistence.Embeddable;

@Embeddable
public class Country {
  @Field
  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
