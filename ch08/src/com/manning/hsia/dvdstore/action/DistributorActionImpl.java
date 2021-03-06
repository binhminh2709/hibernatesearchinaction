package com.manning.hsia.dvdstore.action;

import com.manning.hsia.dvdstore.model.Distributor;
import com.manning.hsia.dvdstore.util.SessionHolder;

import java.util.List;

public class DistributorActionImpl implements DistributorAction {

  @SuppressWarnings("unchecked")
  public List<Distributor> getDistributors() {
    org.hibernate.Session session = SessionHolder.getFullTextSession();
    return session.createCriteria(Distributor.class).list();
  }

}
