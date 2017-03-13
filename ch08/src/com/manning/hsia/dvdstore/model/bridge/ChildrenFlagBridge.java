package com.manning.hsia.dvdstore.model.bridge;

import com.manning.hsia.dvdstore.model.Category;
import com.manning.hsia.dvdstore.model.Item;
import org.hibernate.search.bridge.StringBridge;

/**
 * Add "yes" to the dedicated field if item contains the children category
 * <p>
 * Example 8.7
 */
public class ChildrenFlagBridge implements StringBridge {
  public String objectToString(Object object) {
    assert object instanceof Item;
    Item item = (Item) object;

    boolean hasChildrenCategory = false;
    for (Category category : item.getCategories()) {  //retrieve unindexed data
      if ("Children".equalsIgnoreCase(category.getName())) {
        hasChildrenCategory = true;
        break;
      }
    }
    return hasChildrenCategory ? "yes" : "no";  //index useful flag
  }
}
