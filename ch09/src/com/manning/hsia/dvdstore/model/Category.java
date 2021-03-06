package com.manning.hsia.dvdstore.model;

import javax.persistence.*;

@Entity
@Table(name = "CATEGORIES")
public class Category {
  @Id
  @GeneratedValue
  @Column(name = "CATEGORY")
  private Integer id;
  @Column(name = "NAME")
  private String name;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


}
