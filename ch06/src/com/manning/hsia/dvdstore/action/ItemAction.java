package com.manning.hsia.dvdstore.action;

import com.manning.hsia.dvdstore.model.Item;

import java.util.List;

public interface ItemAction {

  public abstract Item loadItem(Integer id);

  public abstract List<?> findByTitle(String words);

  public abstract List<Item> findItemByTitle(String words);

}