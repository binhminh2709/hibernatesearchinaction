package com.manning.hsia.dvdstore.util;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaTestCase {

  protected EntityManagerFactory factory;

  @BeforeTest(groups = {"ch02"})
  protected void setUp() throws Exception {
    factory = Persistence.createEntityManagerFactory("dvdstore-catalog");
    postSetUp();
  }

  @AfterTest(groups = {"ch02"})
  protected void tearDown() throws Exception {
    factory.close();
  }

  /**
   * can be overridden to initialize the dataset
   */
  public void postSetUp() throws Exception {
  }
}
