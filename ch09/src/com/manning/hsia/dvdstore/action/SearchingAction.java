package com.manning.hsia.dvdstore.action;

import com.manning.hsia.dvdstore.model.Item;

import java.util.List;

public interface SearchingAction {
  List<Item> getMatchingItems(String query, int page);

  List<Item> getMatchingItemsWithDistributor(String query, int page);

  List<String> getTitleFromMatchingItems(String words);
}
