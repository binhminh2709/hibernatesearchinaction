package com.manning.hsia.dvdstore.model;

import org.hibernate.search.annotations.Field;
import org.hibernate.search.annotations.Indexed;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

//@javax.persistence.Entity
@Indexed
public class Pizza extends Item {
  @Field
  @Enumerated(EnumType.STRING)
  private PizzaSize size;

  public PizzaSize getSize() {
    return size;
  }

  public void setSize(PizzaSize size) {
    this.size = size;
  }


}
